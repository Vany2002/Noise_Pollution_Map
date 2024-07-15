package com.example.diplom_map.data

import com.example.diplom_map.domain.Statistics
import com.example.diplom_map.domain.NoisePoint
import com.example.diplom_map.domain.QuietPoint
import com.example.diplom_map.domain.StatisticsPoint
import kotlinx.coroutines.flow.Flow

// Интерфейс, определяющий контракт для работы с данными о шуме
interface NoiseRepository {

    // Вставка "шумной" точки
    suspend fun insert(noisePoint: NoisePoint)

    suspend fun insert(statisticsPoint: StatisticsPoint)

    suspend fun updateStatistics(regionName: String, count: Int)

    // Вставка "тихой" точки
    suspend fun insert(quietPoint: QuietPoint)

    // Получение потока "шумных" точек
    suspend fun observeAll(): List<NoisePoint>

    suspend fun observeAllQuiets(): List<QuietPoint>

    // Получение списка статистики по регионам
    suspend fun getAllStatistics(): List<Statistics>

    // Удаление всех записей
    suspend fun deleteAll()

    // Проверка, очищена ли база данных
    suspend fun isDataBaseCleared(): Boolean

    // Получение списка всех регионов
    suspend fun getAllRegions(): List<String>
}