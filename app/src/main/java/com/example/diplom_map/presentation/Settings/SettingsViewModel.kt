//import android.content.Context
//import android.content.SharedPreferences
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import android.media.MediaRecorder
//import android.util.Log
//import java.io.IOException
//import kotlin.math.log10
//import kotlin.math.round
//
//class SettingsViewModel(private val externalFilesDir: String) : ViewModel() {
//
//    private val _noiseLevel = MutableLiveData<Double>()
//    val noiseLevel: LiveData<Double> = _noiseLevel
//    private var mediaRecorder: MediaRecorder? = null
//    private var isRecording = false
//
//    // Отдельная переменная для коррекции уровня шума
//    private var _noiseLevelCorrectionValue = 0.0
//    private val _noiseLevelCorrection = MutableLiveData<Double>()
//    val noiseLevelCorrection: LiveData<Double> = _noiseLevelCorrection
//
//    init {
//        _noiseLevel.value = 0.0 // Начальное значение
//        _noiseLevelCorrection.value = 0.0 // Начальное значение коррекции
//    }
//
//    fun setNoiseLevelCorrection(value: Double) {
//        // Обновляем значение коррекции и уровень шума
//        _noiseLevelCorrectionValue = value
//        _noiseLevelCorrection.postValue(value) // Используйте postValue для обновления из фонового потока
//        _noiseLevel.postValue(measureNoiseLevel()) // Обновляем уровень шума с новой коррекцией
//    }
//
//    fun startRecordingWithCorrection() {
//        startRecording()
//        // Убираем логику коррекции из метода startRecordingWithCorrection
//    }
//
//    fun stopRecordingWithCorrection() {
//        stopRecording()
//        // Убираем логику коррекции из метода stopRecordingWithCorrection
//    }
//
//    fun startRecording() {
//        if (isRecording) {
//            Log.w("SettingsViewModel", "Запись уже идет")
//            return
//        }
//        // Путь к файлу передается в ViewModel
//        val output = "$externalFilesDir/recording.MPEG4"
//        mediaRecorder = MediaRecorder().apply {
//            setAudioSource(MediaRecorder.AudioSource.MIC)
//            setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
//            setAudioEncoder(MediaRecorder.AudioEncoder.AAC)
//            setOutputFile(output)
//            try {
//                prepare()
//            } catch (e: IOException) {
//                Log.e("SettingsViewModel", "Ошибка при подготовке MediaRecorder", e)
//                isRecording = false
//                return
//            }
//            try {
//                start() // Запуск
//            } catch (e: IllegalStateException) {
//                Log.e("SettingsViewModel", "Ошибка при запуске записи", e)
//                isRecording = false
//                return
//            }
//            Thread {
//                while (isRecording) {
//                    val level = measureNoiseLevel() // Функция для измерения уровня шума
//                    _noiseLevel.postValue(level)
//                    try {
//                        Thread.sleep(500) // Обновление каждую секунду
//                    } catch (e: InterruptedException) {
//                        e.printStackTrace()
//                    }
//                }
//            }.start()
//        }
//        isRecording = true
//        Log.d("SettingsViewModel", "Запись начата")
//    }
//
//    fun stopRecording() {
//        if (!isRecording) {
//            return
//        }
//        mediaRecorder?.apply {
//            stop()
//            release()
//        }
//        mediaRecorder = null
//        isRecording = false
//    }
//
//    private fun measureNoiseLevel(): Double {
//        val maxAmplitude = mediaRecorder?.maxAmplitude ?: 1
//        // Преобразуем амплитуду в децибелы
//        val currentNoiseLevel = 20 * log10(maxAmplitude.toDouble())
//        // Применяем коррекцию уровня шума
//        val correctedNoiseLevel = currentNoiseLevel + _noiseLevelCorrectionValue
//        // Округляем до двух знаков после запятой
//        return round(correctedNoiseLevel * 100) / 100
//    }
//
//    fun increaseNoiseLevel(context: Context) {
//        // Увеличиваем коррекцию на 10 децибел
//        _noiseLevelCorrectionValue += 0.1
//        _noiseLevelCorrection.value = _noiseLevelCorrectionValue // Обновляем LiveData
//        _noiseLevel.value = measureNoiseLevel() // Обновляем уровень шума
//        saveNoiseLevelCorrection(context) // Сохраняем измененную коррекцию
//    }
//
//    fun decreaseNoiseLevel(context: Context) {
//        // Уменьшаем коррекцию на 10 децибел
//        _noiseLevelCorrectionValue -= 0.1
//        _noiseLevelCorrection.value = _noiseLevelCorrectionValue // Обновляем LiveData
//        _noiseLevel.value = measureNoiseLevel() // Обновляем уровень шума
//        saveNoiseLevelCorrection(context) // Сохраняем измененную коррекцию
//    }
//
//    fun getNoiseLevelCorrection(): Double {
//        return _noiseLevelCorrectionValue
//    }
//
//    fun saveNoiseLevelCorrection(context: Context) {
//        val sharedPref = context.getSharedPreferences("AppSettings", Context.MODE_PRIVATE)
//        with (sharedPref.edit()) {
//            putDouble("noiseLevelCorrection", _noiseLevelCorrectionValue)
//            apply()
//        }
//    }
//
//    fun loadNoiseLevelCorrection(context: Context): Double {
//        val sharedPref = context.getSharedPreferences("AppSettings", Context.MODE_PRIVATE)
//        return sharedPref.getDouble("noiseLevelCorrection", 0.0)
//    }
//
//    // Расширение для SharedPreferences.Editor, чтобы сохранять Double
//    fun SharedPreferences.Editor.putDouble(key: String, double: Double) = putLong(key, java.lang.Double.doubleToRawLongBits(double))
//
//    // Расширение для SharedPreferences, чтобы получать Double
//    fun SharedPreferences.getDouble(key: String, default: Double): Double {
//        return java.lang.Double.longBitsToDouble(getLong(key, java.lang.Double.doubleToRawLongBits(default)))
//    }
//}