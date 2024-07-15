package com.example.diplom_map.data

import android.content.Context
import com.example.diplom_map.domain.Statistics
import com.example.diplom_map.domain.NoisePoint
import com.example.diplom_map.domain.QuietPoint
import com.example.diplom_map.domain.StatisticsPoint
import com.example.diplom_map.service.enqueueDataUpdateWorker
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import javax.inject.Inject

class NoiseRepositoryImpl @Inject constructor(
    private val dao: NoiseDAO,
    private val context: Context
) : NoiseRepository {// Реализация репозитория для работы с данными о шуме

    override suspend fun insert(noisePoint: NoisePoint) {
        var roomModel = noisePoint.asRoom()
        if (roomModel.isManualEntry) {
            roomModel = roomModel.copy(isSynced = true)
        }
        dao.insert(roomModel)
        enqueueDataUpdateWorker(context)
    }

    override suspend fun insert(quietPoint: QuietPoint) {
        var roomModel = quietPoint.asRoom()
        if (roomModel.isManualEntry) {
            roomModel = roomModel.copy(isSynced = true)
        }
        dao.insert(roomModel)
        enqueueDataUpdateWorker(context)
    }

    override suspend fun insert(statisticsPoint: StatisticsPoint) {
        dao.insert(statisticsPoint.asRoom())
    }

    override suspend fun updateStatistics(regionName: String, count: Int) {
        withContext(Dispatchers.IO) {
            val statisticsPointRoom = dao.getStatisticsByName(regionName)
            val statisticsModified =
                statisticsPointRoom.copy(size = statisticsPointRoom.size + count)
            dao.update(statisticsModified)
        }
    }

    // Получение потока "шумных" точек
    override suspend fun observeAll(): List<NoisePoint> {
        return dao.observeAll().map { it.asDomain() }
    }

    override suspend fun observeAllQuiets(): List<QuietPoint> {
        return dao.observeAllQuiets().map { it.asDomain() }
    }

    // Получение списка статистики по регионам
    override suspend fun getAllStatistics(): List<Statistics> {
        val result = dao.getAllStatistics()
        return result.map {
            Statistics(
                region = it.name,
                count = it.noise,
                quiet = it.quiet
            )
        }
    }

    // Удаление всех записей из базы данных
    override suspend fun deleteAll() {
        dao.deleteAll()
    }

    // Проверка, очищена ли база данных
    override suspend fun isDataBaseCleared(): Boolean {
        return dao.getFirstPointId() == 0
    }

    // Получение списка всех регионов
    override suspend fun getAllRegions(): List<String> {
        return withContext(Dispatchers.IO) {
            dao.getAllRegions()
        }
    }
}