package com.example.diplom_map.presentation.map

import android.location.Location
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.diplom_map.data.NoiseRepository
import com.example.diplom_map.data.Repository
import com.example.diplom_map.domain.NoisePoint
import com.example.diplom_map.domain.Region
import com.example.diplom_map.domain.VolumePoint
import com.example.diplom_map.migration.RoomMigration
import com.itleader.delivery.LocationManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MapViewModel @Inject constructor(
    private val repository: NoiseRepository, // Репозиторий для работы с данными о шуме
    private val regionsRepository: Repository, // Репозиторий для работы с регионами
    roomMigration: RoomMigration, // Миграция базы данных Room
    private val locationManager: LocationManager // Менеджер местоположения
): ViewModel() {

    private val state = MutableStateFlow(ViewState()) // Состояние экрана

    // Функция для наблюдения за интерфейсом
    fun observeUi() = state.asStateFlow()

    init {
        roomMigration.migrateIfNeeded() // Проверка и выполнение миграции базы данных
        switchQuiet(true)
    }

    fun switchQuiet(isNoise: Boolean) {
        if (isNoise) {
            viewModelScope.launch {
                withContext(Dispatchers.IO) {
                    val items = repository.observeAll()
                    val regions = regionsRepository.getRegions() // Получение регионов из репозитория
                    state.update { it.copy(regions = regions, isNoise = true, items = items) } // Обновление состояния с регионами
                }
            }
        } else {
            viewModelScope.launch {
                withContext(Dispatchers.IO) {
                    val items = repository.observeAllQuiets()
                    val regions = regionsRepository.getRegionQuiet() // Получение регионов из репозитория
                    state.update { it.copy(regions = regions, isNoise = false, items = items) } // Обновление состояния с регионами
                }
            }
        }
    }

    // Функция для запроса обновлений местоположения
    fun requestLocationUpdates() {
        locationManager.requestLocationUpdates { location ->
            state.update { it.copy(location = location) } // Обновление состояния с текущим местоположением
        }
    }

    // Функция для остановки обновлений местоположения
    fun stopLocationUpdates() {
        locationManager.stopLocationUpdates() // Остановка обновлений местоположения
    }
}

data class ViewState(
    val items: List<VolumePoint> = emptyList(), // Список точек шума
    val regions: List<Region> = emptyList(), // Список регионов
    val location: Location? = null, // Текущее местоположение
    val isNoise: Boolean = true //Состояние кнопки Шумные точки
)