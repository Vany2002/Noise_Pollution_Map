package com.example.diplom_map.domain

import com.yandex.mapkit.geometry.Point
import java.util.Calendar

interface VolumePoint {
    val id: Int
    val name: String
    val point: Point
    val volume: Double?
    val reason: String
    val date: Calendar
}