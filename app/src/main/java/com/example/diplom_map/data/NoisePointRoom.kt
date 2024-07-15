package com.example.diplom_map.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.diplom_map.database.CalendarConverter
import com.example.diplom_map.domain.NoisePointServer
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

// Класс для хранения данных о "шумной" точке в базе данных Room
@Entity(tableName = "points")
data class NoisePointRoom (
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
    val noiseSyncTime: Long = 0L
)

fun NoisePointServer.asRoom(): NoisePointRoom {
    val calendarConverter = CalendarConverter()
    val calendar = calendarConverter.iso8601ToCalendar(this.datePoint)
    return NoisePointRoom(
        name = this.nameRegion,
        latitude = this.latitude,
        longitude = this.longitude,
        volume = this.volume,
        date = calendar,
        reason = this.reason,
        isSynced = false
    )
}