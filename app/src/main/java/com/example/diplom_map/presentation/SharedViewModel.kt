//package com.example.diplom_map.presentation
//
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//
//// SharedViewModel для обмена данными между SettingsFragment и ShumFragment
//class SharedViewModel : ViewModel() {
//    private val _noiseLevel = MutableLiveData<Double>()
//    val noiseLevel: LiveData<Double> get() = _noiseLevel
//
//    // Функция для обновления уровня шума
//    fun updateNoiseLevel(noiseLevel: Double) {
//        _noiseLevel.value = noiseLevel
//    }
//}