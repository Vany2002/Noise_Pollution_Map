package com.example.diplom_map

import java.util.Calendar

// Пакет, в котором находится класс PlacemarkUserData
data class PlacemarkUserData(
    val region: String,
    val size: Int,
    val date: Calendar? = Calendar.getInstance(),
    val reason: String?,
    val volume: Double?
)