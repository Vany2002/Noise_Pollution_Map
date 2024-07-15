package com.example.diplom_map.di.map

import com.example.diplom_map.presentation.map.MapViewModel
import dagger.Subcomponent

// Подкомпонент Dagger для управления зависимостями внутри функциональности карты
@Subcomponent
interface MapComponent {

    // Метод для получения экземпляра ViewModel карты
    fun getViewModel(): MapViewModel

}
