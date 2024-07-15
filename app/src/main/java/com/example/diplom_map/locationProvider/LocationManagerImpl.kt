package com.itleader.delivery

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.Priority
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocationManagerImpl @Inject constructor( // Реализация менеджера местоположений, внедрение зависимостей
    context: Context // Контекст приложения
) : LocationManager { // Реализация интерфейса LocationManager

    // Клиент для получения местоположения с использованием служб геолокации
    private val fusedLocationClient: FusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context)

    // Запрос на получение местоположения с наивысшей точностью каждую секунду
    private val locationRequest = LocationRequest.Builder(1000)
        .setPriority(Priority.PRIORITY_HIGH_ACCURACY) // Высокая точность местоположения
        .build()

    // Обратный вызов для обновления местоположения
    private var cameraCallback: LocationCallback? = null

    // Запрос на получение обновлений местоположения
    @SuppressLint("MissingPermission")
    override fun requestLocationUpdates(callback: (Location) -> Unit) {
        val locationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult) {
                if (locationResult.locations.isNotEmpty()) {
                    val location = locationResult.lastLocation
                    location?.let { callback.invoke(location) }
                }
            }
        }
        cameraCallback = locationCallback

        // Запрос на обновление местоположения
        fusedLocationClient.requestLocationUpdates(
            locationRequest,
            locationCallback,
            null /* Looper */
        )
    }

    // Остановка обновления местоположения
    override fun stopLocationUpdates() {
        cameraCallback?.let {
            fusedLocationClient.removeLocationUpdates(it)
        }
    }

    // Получение последнего известного местоположения
    @SuppressLint("MissingPermission")
    override fun getLastLocation(
        onError: (String) -> Unit,
        onSuccess: (Location) -> Unit
    ) {
        val task = fusedLocationClient.lastLocation
        task.addOnCanceledListener {
            onError.invoke("Что-то пошло не так при получении геолокации")
        }
        task.addOnFailureListener { "Ошибка при получении геолокации" }
        task.addOnSuccessListener { location -> onSuccess.invoke(location) }
    }
}