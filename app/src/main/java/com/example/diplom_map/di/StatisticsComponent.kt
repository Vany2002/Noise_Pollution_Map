package com.example.diplom_map.di

import com.example.diplom_map.presentation.statistics.StatisticsViewModel
import dagger.Subcomponent

// Подкомпонент Dagger для управления зависимостями внутри статистики
@Subcomponent
interface StatisticsComponent {

    // Метод для получения экземпляра ViewModel статистики
    fun getViewModel(): StatisticsViewModel
}