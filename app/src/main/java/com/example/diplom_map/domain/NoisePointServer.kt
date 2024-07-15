package com.example.diplom_map.domain

import com.example.diplom_map.data.NoisePointRoom
import com.google.gson.annotations.SerializedName
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import java.util.TimeZone

data class NoisePointServer (
    // Убрано поле ID, так как оно должно генерироваться на сервере
    @SerializedName("nameRegion")
    val nameRegion: String,
    @SerializedName("latitude")
    val latitude: Double,
    @SerializedName("longitude")
    val longitude: Double,
    @SerializedName("volume")
    val volume: Double,
    @SerializedName("datePoint")
    val datePoint: String, // Тип уже изменен на String для формата даты ISO 8601
    @SerializedName("reason")
    val reason: String
)

fun NoisePointRoom.toNoisePointServer(): NoisePointServer {
    val isoDateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault()).apply {
        timeZone = TimeZone.getTimeZone("UTC")
    }
    return NoisePointServer(
        nameRegion = this.name,
        latitude = this.latitude,
        longitude = this.longitude,
        volume = this.volume ?: 0.0,
        datePoint = isoDateFormat.format(this.date.time), // Конвертация в формат ISO 8601
        reason = this.reason
    )
}