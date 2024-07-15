package com.example.diplom_map.presentation.statistics

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.diplom_map.data.NoiseRepository
import com.example.diplom_map.domain.Statistics
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

// ViewModel для управления статистикой
class StatisticsViewModel @Inject constructor(
    private val repository: NoiseRepository // Репозиторий для получения данных о шуме
): ViewModel() {

    // Состояние экрана
    private val state = MutableStateFlow(ViewState())
    fun uiState() = state.asStateFlow()

    // Инициализация, загрузка данных
    init {
        fetchData()
    }

    // Получение данных о шуме из репозитория и обновление состояния экрана
    private fun fetchData(query: String = "") {
        viewModelScope.launch {
            val items = repository.getAllStatistics()
                .filter { it.region.lowercase().contains(query.lowercase()) }

            state.update { it.copy(items = items) } // Обновление состояния экрана с новыми данными
        }
    }

    // Установка запроса для фильтрации данных
    fun setQuery(q: String) {
        fetchData(q)
    }

}

// Состояние экрана статистики
data class ViewState(
    val items: List<Statistics> = emptyList() // Список элементов статистики по умолчанию пуст
)