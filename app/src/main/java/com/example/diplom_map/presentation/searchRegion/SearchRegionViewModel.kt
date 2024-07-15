package com.example.diplom_map.presentation.searchRegion

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.diplom_map.data.NoiseRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

// ViewModel для экрана поиска регионов
class SearchRegionViewModel @Inject constructor(
    private val repository: NoiseRepository
): ViewModel() {

    // Состояние ViewModel, хранящее список регионов
    private val state = MutableStateFlow(State())

    // Функция для наблюдения за состоянием UI
    fun observeUi() = state.asStateFlow()

    // Инициализация ViewModel
    init {
        fetchData() // Загрузка данных при инициализации
    }

    // Функция для загрузки данных о регионах
    private fun fetchData(query: String = "") {
        viewModelScope.launch {
            // Получение всех регионов и фильтрация по запросу
            val items = repository.getAllRegions()
                .filter { it.lowercase().contains(query.lowercase()) }

            // Обновление состояния с новым списком регионов
            state.update { it.copy(regions = items) }
        }
    }

    // Функция для установки запроса пользователя
    fun setQuery(q: String) {
        fetchData(q) // Вызов функции загрузки данных с новым запросом
    }

}

// Состояние экрана поиска регионов
data class State(
    val regions: List<String> = emptyList() // Список регионов, по умолчанию пустой
)