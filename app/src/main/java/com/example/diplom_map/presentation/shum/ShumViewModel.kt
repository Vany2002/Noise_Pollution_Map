package com.example.diplom_map.presentation.shum

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.diplom_map.data.NoiseRepository
import com.example.diplom_map.domain.NoisePoint
import com.example.diplom_map.domain.QuietPoint
import com.itleader.delivery.LocationManager
import com.yandex.mapkit.geometry.Point
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

// ViewModel для управления записью уровня шума.
class ShumViewModel @Inject constructor(
    private val noiseRepository: NoiseRepository,
    private val locationManager: LocationManager
): ViewModel() {

    // Состояние экрана записи уровня шума.
    private val state = MutableStateFlow(State())

//    private val _noiseLevelCorrection = MutableSharedFlow<Double>(replay = 1)
//    val noiseLevelCorrection: SharedFlow<Double> = _noiseLevelCorrection.asSharedFlow()

    // Метод для наблюдения за UI состоянием.
    fun observeUi() = state.asStateFlow()

    // Job для управления таймером.
    private var timerJob: Job? = null

    private var seconds: Int = 0
    private var maxDb = 55

    // Список уровней звука.
    private val volumeList = mutableListOf<Double>()

    // Методы для обновления состояний
    fun setRegionSelected(selected: Boolean) {
        state.update { it.copy(regionSelected = selected) }
    }

    fun updateReasonSelected(newReason: String) {
        state.update { it.copy(reasonSelected = newReason) }
    }

    // Сохранение уровня шума в базе данных.
    fun save(regionName: String, reason: String) {
        locationManager.getLastLocation({}) { location ->
            // Используйте параметр reason, а не state.value.selectedReason
            val volumeAverage = volumeList.filter { it > 0 }.average()
            if (volumeAverage >= maxDb) {
                viewModelScope.launch {
                    val noise = NoisePoint(
                        name = regionName,
                        point = Point(location.latitude, location.longitude),
                        volume = volumeAverage,
                        reason = reason // Используйте параметр reason
                    )
                    noiseRepository.insert(noise)
                }
            } else {
                viewModelScope.launch {
                    noiseRepository.updateStatistics(regionName, 1)
                }
                viewModelScope.launch {
                    val quiet = QuietPoint(
                        name = regionName,
                        point = Point(location.latitude, location.longitude),
                        volume = volumeAverage,
                        reason = reason
                    )
                    noiseRepository.insert(quiet)
                }
            }
        }
    }

    // Начать запись уровня шума.
    fun startRecording() {
        clearVolumeList()
        state.update { it.copy(isStartRecording = true) }
        viewModelScope.launch {
            startTimer()
        }
    }

    // Запуск таймера.
    suspend fun startTimer() {
        timerJob?.cancel()
        timerJob = null
        volumeList.clear()
        timerJob = viewModelScope.launch {
            while (true) {
                delay(1000)
                seconds += 1
                val minutes = seconds / 60

                val currentSeconds = seconds - (minutes * 60)
                val secondsString = String.format("%02d", currentSeconds)
                val timerText = "$minutes:$secondsString/5:00"
                val progress = (seconds.toDouble() / 300) * 100
                state.update { it.copy(
                    timer = timerText,
                    timerProgress = progress.toInt()
                ) }
            }
        }
    }

    // Остановить запись уровня шума.
    fun stopRecording() {
        timerJob?.cancel()
        timerJob = null
        seconds = 0
        state.update { it.copy(timer = "", timerProgress = 0, isStartRecording = false) }
    }

    // Добавить уровень звука в список.
    fun addVolume(value: Double) {
        volumeList.add(value)
        val average = volumeList.filter { it > 0 }.average()
        state.update {
            it.copy(
                noiseValue = "Среднее значение: ${"%.2f".format(average)} dB ${if (average >= 55) "Шумно" else "Тихо"}",
                volumeAmplitude = "${"%.2f".format(value)} dB",
                saveAvailable = volumeList.isNotEmpty()
            )
        }
    }

    // Очистить список уровней звука.
    fun clearVolumeList() {
        volumeList.clear()
        state.update { it.copy(saveAvailable = volumeList.isNotEmpty()) }
    }

//    fun updateNoiseLevelCorrection(correction: Double) {
//        viewModelScope.launch {
//            _noiseLevelCorrection.emit(correction)
//        }
//    }
}

// Состояние экрана записи уровня шума.
data class State(
    val timer: String = "",
    val timerProgress: Int = 0,
    val noiseValue: String = "",
    val volumeAmplitude: String = "",
    val saveAvailable: Boolean = false,
    val selectedReason: String = "",
    val regionSelected: Boolean = false,
    val reasonSelected: String? = null,
    val isStartRecording: Boolean = false
)