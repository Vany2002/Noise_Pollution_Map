package com.example.diplom_map.domain

import com.yandex.mapkit.geometry.Point
import java.util.Calendar

// Класс для представления "тихой" точки на карте
data class QuietPoint (
    override val id: Int = 0,
    override val name: String,
    override val point: Point,
    override val volume: Double? = null,
    override val reason: String = "",
    override val date: Calendar = Calendar.getInstance(),
): VolumePoint