package com.itleader.delivery

import android.location.Location

// Интерфейс для работы с местоположением
interface LocationManager {

    // Запрос обновлений местоположения с передачей колбэка
    fun requestLocationUpdates(callback: (Location) -> Unit)

    // Остановка обновлений местоположения
    fun stopLocationUpdates()

    // Получение последнего известного местоположения
    fun getLastLocation(onError: (String) -> Unit, onSuccess: (Location) -> Unit,)
}