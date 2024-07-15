package com.example.diplom_map.data

import androidx.room.Entity
import androidx.room.PrimaryKey

// Класс для хранения данных о пользовательской точке в базе данных Room
@Entity(tableName = "user_points")
data class UserPointRoom (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val latitude: Double,
    val longitude: Double,
    val volume: String
)