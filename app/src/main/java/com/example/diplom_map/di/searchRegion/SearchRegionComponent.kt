package com.example.diplom_map.di.searchRegion

import com.example.diplom_map.presentation.searchRegion.SearchRegionViewModel
import dagger.Subcomponent

// Подкомпонент Dagger для управления зависимостями внутри функциональности поиска регионов
@Subcomponent
interface SearchRegionComponent {

    // Метод для получения экземпляра ViewModel поиска регионов
    fun viewModel(): SearchRegionViewModel
}