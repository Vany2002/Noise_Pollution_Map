package com.example.diplom_map.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.diplom_map.domain.StatisticsPoint
import kotlinx.coroutines.flow.Flow

// Data Access Object (DAO) для работы с данными о шуме в базе данных Room
@Dao
interface NoiseDAO {

    // Вставка "шумной" точки в базу данных
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(noisePointRoom: NoisePointRoom)

    // Вставка "тихой" точки в базу данных
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(quietPointRoom: QuietPointRoom)

    @Insert
    suspend fun insert(statisticsPointRoom: StatisticsPointRoom)

    // Обновление данных о "тихой" точке в базе данных
    @Update
    suspend fun update(quietPointRoom: QuietPointRoom)

    @Update
    suspend fun update(noisePointRoom: NoisePointRoom)

    @Update
    suspend fun update(statisticsPointRoom: StatisticsPointRoom)

    // Получение потока всех "шумных" точек из базы данных
    @Query("SELECT * FROM points")
    fun observeAll(): List<NoisePointRoom>

    @Query("SELECT * FROM quiets")
    fun observeAllQuiets(): List<QuietPointRoom>

    @Query("SELECT statistics.name, statistics.size AS quiet, COUNT(points.id) as noise FROM statistics \n" +
            "LEFT JOIN points\n" +
            "ON points.name = statistics.name\n" +
            "GROUP BY points.name")
    suspend fun getAllStatistics(): List<StatisticsRelation>

    // Удаление всех записей о точках из базы данных
    @Query("DELETE FROM points")
    suspend fun deleteAll()

    // Получение идентификатора первой точки в базе данных
    @Query("SELECT COUNT(id) FROM points")
    suspend fun getFirstPointId(): Int

    // Получение списка всех регионов, представленных в базе данных
    @Query("SELECT name FROM points GROUP BY name")
    suspend fun getAllRegions(): List<String>

    // Получение данных о "тихой" точке по имени
    @Query("SELECT * FROM statistics WHERE name =:name")
    suspend fun getStatisticsByName(name: String): StatisticsPointRoom

    @Query("UPDATE points SET isSynced = 1 WHERE id = :id")
    suspend fun markAsSynced(id: Int)

    @Query("UPDATE quiets SET isSynced = 1 WHERE id = :id")
    suspend fun markQuietAsSynced(id: Int)

    @Query("SELECT * FROM points WHERE isSynced = 0")
    fun getNotSyncedData(): List<NoisePointRoom>

    @Query("SELECT * FROM quiets WHERE isSynced = 0")
    fun getQuietNotSyncedData(): List<QuietPointRoom>

    @Query("SELECT MAX(noiseSyncTime) FROM points WHERE isSynced = 1")
    suspend fun getLastSyncTime(): Long

    @Query("SELECT MAX(quietSyncTime) FROM quiets WHERE isSynced = 1")
    suspend fun getLastSyncTimeQuiet(): Long

    @Query("UPDATE points SET noiseSyncTime = :time WHERE id = (SELECT id FROM points ORDER BY id DESC LIMIT 1)")
    suspend fun setLastSyncTime(time: Long)

    @Query("UPDATE quiets SET quietSyncTime = :time WHERE id = (SELECT id FROM quiets ORDER BY id DESC LIMIT 1)")
    suspend fun setLastSyncQuietTime(time: Long)

    @Query("UPDATE points SET noiseSyncTime = :time WHERE isSynced = 1 AND noiseSyncTime < :time")
    suspend fun updateLastSyncTimeForSynced(time: Long)

    @Query("UPDATE quiets SET quietSyncTime = :time WHERE isSynced = 1 AND quietSyncTime < :time")
    suspend fun updateLastSyncTimeForSyncedQuiets(time: Long)

    @Query("SELECT COUNT(1) FROM quiets WHERE latitude = :lat AND longitude = :longitude")
    suspend fun isExistQuites(lat: Double, longitude: Double): Boolean

    @Query("SELECT COUNT(1) FROM points WHERE latitude = :lat AND longitude = :longitude")
    suspend fun isExistNoise(lat: Double, longitude: Double): Boolean
}