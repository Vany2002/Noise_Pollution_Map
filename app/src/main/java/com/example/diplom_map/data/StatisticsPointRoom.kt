package com.example.diplom_map.data

import androidx.room.Entity
import androidx.room.PrimaryKey

// Класс для хранения связей статистики
@Entity(tableName = "statistics")
data class StatisticsPointRoom(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val size: Int
)