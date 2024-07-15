package com.example.diplom_map.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.diplom_map.database.CalendarConverter
import com.example.diplom_map.domain.QuietPointServer
import java.util.Calendar

// Класс для хранения данных о "тихой" точке в базе данных Room
@Entity(tableName = "quiets")
data class QuietPointRoom(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val latitude: Double,
    val longitude: Double,
    val volume: Double? = null,
    val date: Calendar,
    val reason: String,
    val isSynced: Boolean = false,
    val isManualEntry: Boolean = volume == null,
    val quietSyncTime: Long = 0L
)

fun QuietPointServer.asRoom(): QuietPointRoom {
    val calendarConverter = CalendarConverter()
    val calendar = calendarConverter.iso8601ToCalendar(this.datePoint)
    return QuietPointRoom(
        name = this.nameRegion,
        latitude = this.latitude,
        longitude = this.longitude,
        volume = this.volume,
        date = calendar,
        reason = this.reason,
        isSynced = false // По умолчанию точка не синхронизирована
    )
}