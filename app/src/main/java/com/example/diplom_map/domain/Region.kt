package com.example.diplom_map.domain

import com.yandex.mapkit.geometry.Point

// Класс для представления региона на карте
data class Region (
    val name: String,
    val size: Int,
    val point: Point
)