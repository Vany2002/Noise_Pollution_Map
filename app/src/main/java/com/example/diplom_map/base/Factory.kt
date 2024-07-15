package com.example.diplom_map.base

//import SettingsViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

// Фабрика для создания экземпляров ViewModel с поддержкой пользовательского создания
class Factory<T : ViewModel>(private val create: () -> T) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return create.invoke() as T
    }
}