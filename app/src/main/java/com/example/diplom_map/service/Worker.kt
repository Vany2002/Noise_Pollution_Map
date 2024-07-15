package com.example.diplom_map.service

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkerParameters
import com.example.diplom_map.data.NoisePointRoom
import com.example.diplom_map.data.QuietPointRoom
import com.example.diplom_map.data.asRoom
import com.example.diplom_map.database.AppDatabase
import com.example.diplom_map.domain.toNoisePointServer
import com.example.diplom_map.domain.toQuietPointServer

class DataUpdateWorker(context: Context, params: WorkerParameters) : CoroutineWorker(context, params) {
    // Инициализация DAO внутри Worker
    private val noiseDAO by lazy { AppDatabase.getInstance(applicationContext).getNoiseDao() }
    override suspend fun doWork(): Result {
        // Синхронизация данных с сервером
        syncDataWithServer()
        // Получение несинхронизированных данных для отправки
        val newNoisePoints = noiseDAO.getNotSyncedData()
        val quietNoisePoints = noiseDAO.getQuietNotSyncedData()
        // Проверка наличия новых данных
        if (newNoisePoints.isNotEmpty()) {
            // Отправка данных на сервер
            newNoisePoints.forEach { noisePoint ->
                sendNoisePointToServer(noisePoint)
            }
        }
        if (quietNoisePoints.isNotEmpty()) {
            // Отправка тихих точек в другую таблицу
            quietNoisePoints.forEach { quietPoint ->
                sendQuietNoisePointToServer(quietPoint)
            }
        }

        // Создание Intent для широковещательного сообщения
        val intent = Intent("com.example.ACTION_DATA_UPDATED")
        // Отправка широковещательного сообщения
        applicationContext.sendBroadcast(intent)
        // Успешное выполнение задачи
        return Result.success()
    }

    private suspend fun sendNoisePointToServer(noisePoint: NoisePointRoom) {
        val noisePointServer = noisePoint.toNoisePointServer()
        try {
            val response = RetrofitInstance.api.postNoisePoint(noisePointServer)
            if (response.isSuccessful) {
                // Помечаем точку как синхронизированную в блоке try, чтобы избежать ошибок
                noiseDAO.markAsSynced(noisePoint.id)
            } else {
                // Обработка ошибок синхронизации
                Log.e("DataUpdateWorker", "Ошибка синхронизации: ${response.errorBody()?.string()}")
            }
        } catch (e: Exception) {
            // Обработка исключений при отправке
            Log.e("DataUpdateWorker", "Исключение при отправке: ${e.message}")
        }
    }

    private suspend fun sendQuietNoisePointToServer(quietPoint: QuietPointRoom) {
        // Конвертация точки для отправки на сервер
        val quietPointServer = quietPoint.toQuietPointServer()
        try {
            // Отправка тихой точки в другую таблицу
            val response = RetrofitInstance.api.postQuietPoint(quietPointServer)
            if (response.isSuccessful) {
                // Помечаем точку как синхронизированную
                noiseDAO.markQuietAsSynced(quietPoint.id)
            } else {
                Log.e("DataUpdateWorker", "Ошибка отправки тихой точки: ${response.errorBody()?.string()}"
                )
            }
        } catch (e: Exception) {
            Log.e("DataUpdateWorker", "Исключение при отправке тихой точки: ${e.message}")
        }
    }

    private suspend fun syncDataWithServer() {
        // Синхронизация шумных точек
        val noiseSyncTime = noiseDAO.getLastSyncTime()
        val noiseUpdates = RetrofitInstance.api.syncData(noiseSyncTime)
        noiseUpdates.forEach { update ->
            if (!noiseDAO.isExistNoise(update.latitude, update.longitude)) {
                noiseDAO.insert(update.asRoom())
            }
        }

        // Синхронизация тихих точек
        val quietSyncTime = noiseDAO.getLastSyncTimeQuiet()
        val quietUpdates = RetrofitInstance.api.syncQuietData(quietSyncTime)
        quietUpdates.forEach { quietUpdate ->
            if (!noiseDAO.isExistQuites(quietUpdate.latitude, quietUpdate.longitude)) {
                noiseDAO.insert(quietUpdate.asRoom())
            }
        }

        val currentTime = System.currentTimeMillis()
        noiseDAO.updateLastSyncTimeForSynced(currentTime)
        noiseDAO.updateLastSyncTimeForSyncedQuiets(currentTime)

        // Обновление времени последней синхронизации
        noiseDAO.setLastSyncTime(currentTime)
        noiseDAO.setLastSyncQuietTime(currentTime)
    }
}
// Функция для запуска Worker
fun enqueueDataUpdateWorker(context: Context) {
    val workRequest = OneTimeWorkRequestBuilder<DataUpdateWorker>().build()
    WorkManager.getInstance(context).enqueue(workRequest)
}