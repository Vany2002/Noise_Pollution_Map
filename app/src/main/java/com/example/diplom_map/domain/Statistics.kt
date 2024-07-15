package com.example.diplom_map.domain

// Класс для хранения статистики
data class Statistics (
    val region: String,
    val count: Int,
    val quiet: Int,
    val id: String = region,
) {
    val result: Double
        get() {
        // Вычисление результата на основе общего количества и "тихих" данных
        val sum = count + quiet
        return 100.0 / sum * count
    }
}