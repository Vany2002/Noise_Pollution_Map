package com.example.diplom_map.di

import com.example.diplom_map.presentation.shum.ShumViewModel
import dagger.Subcomponent

// Подкомпонент Dagger для управления зависимостями внутри модуля шума
@Subcomponent
interface ShumComponent {

    // Метод для получения экземпляра ViewModel шума
    fun viewModel(): ShumViewModel
}