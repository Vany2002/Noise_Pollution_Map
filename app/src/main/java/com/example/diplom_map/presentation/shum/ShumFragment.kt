package com.example.diplom_map.presentation.shum

//import SettingsFragment
//import SettingsViewModel
//import SettingsViewModelFactory
import android.Manifest
import android.app.AlertDialog
import android.content.pm.PackageManager
import android.media.MediaRecorder
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.setFragmentResultListener
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.diplom_map.R
import com.example.diplom_map.application.App
import com.example.diplom_map.base.Factory
import com.example.diplom_map.databinding.ShumFragmentBinding
//import com.example.diplom_map.presentation.SharedViewModel
import com.example.diplom_map.presentation.searchRegion.SearchRegionFragment
import kotlinx.coroutines.launch
import java.io.IOException
import kotlin.math.log10

class ShumFragment : Fragment(R.layout.shum_fragment) {
    // Получаем SharedViewModel

//    private val settingsViewModel: SettingsViewModel by viewModels {
//        SettingsViewModelFactory(requireContext().getExternalFilesDir(null)!!.absolutePath)
//    }

    // ViewModel для этого фрагмента
    private val viewModel by viewModels<ShumViewModel> {
        Factory {
            (requireActivity().application as App).appComponent
                .getShumComponent()
                .viewModel()
        }
    }

    // Привязка ViewBinding
    private val binding by viewBinding(ShumFragmentBinding::bind)

    // Переменные для записи звука
    private var mediaRecorder: MediaRecorder? = null
    private lateinit var output: String
    private var isRecording: Boolean = false

    private var correctionValue: Double = 0.0

    // Код запроса для разрешений
    private val PERMISSION_REQUEST_CODE = 101

    // Интервал обновления амплитуды звука
    private val updateInterval: Long = 500
    private val handler = Handler()

    // Runnable для обновления амплитуды звука
    private val volumeRunnable = object : Runnable {
        override fun run() {
            val volume = getVolume()
            viewModel.addVolume(volume)
            handler.postDelayed(this, updateInterval)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val correction = settingsViewModel.loadNoiseLevelCorrection(requireContext())
//        Log.d("ShumFragment", "Загружена коррекция: $correction dB")
//        applyNoiseCorrection(correction)
//
//        val buttonSettings = view.findViewById<ImageButton>(R.id.buttonSettings)
//        buttonSettings.setOnClickListener {
//            requireActivity().supportFragmentManager.beginTransaction()
//                .replace(R.id.container, SettingsFragment())
//                .addToBackStack(null) // Добавьте эту строку, если хотите поддерживать навигационную цепочку
//                .commit()
//        }

        // Обработчики нажатий кнопок
        val start = view.findViewById<Button>(R.id.buttonStartRecording)
        val stop = view.findViewById<Button>(R.id.buttonStopRecording)
        val buttonSelectReason = view.findViewById<Button>(R.id.button_select_reason)
        buttonSelectReason.setOnClickListener {
            showReasonDialog()
        }

        start.setOnClickListener {
            // Проверка разрешений перед началом записи
            if (ContextCompat.checkSelfPermission(
                    requireContext(),
                    Manifest.permission.RECORD_AUDIO
                ) != PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(
                    requireContext(),
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                // Если разрешения не предоставлены, запросить их
                val permissions = arrayOf(
                    Manifest.permission.RECORD_AUDIO,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_EXTERNAL_STORAGE
                )
                requestPermissions(permissions, PERMISSION_REQUEST_CODE)
            } else {
                // Начать запись, если разрешения уже есть
                startRecording()
            }
        }

        stop.setOnClickListener {
            // Остановить запись и очистить визуализацию звука
            stopRecording()
            binding.waveFormView.clear()
        }

        // Обработчик нажатия кнопки сохранения
        binding.save.setOnClickListener {
            val region = binding.selectRegion.text.toString()
            val reason = binding.buttonSelectReason.text.toString()
            viewModel.save(region, reason)
        }

        // Обработчик нажатия кнопки выбора региона
        binding.selectRegion.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, SearchRegionFragment())
                .addToBackStack(null)
                .commit()
        }

        // Слушатель результата выбора региона из другого фрагмента
        setFragmentResultListener("requestKey") { key, bundle ->
            val result = bundle.getString("region")
            binding.selectRegion.text = result
            viewModel.setRegionSelected(true)
        }

        // Наблюдение за изменениями в UI через LiveData
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.observeUi().collect { state ->
                    binding.timerText.text = state.timer
                    binding.timerProgress.progress = state.timerProgress
                    if (state.timerProgress == 100) {
                        stop(true)
                    }
                    binding.textViewAmplitude.text = state.volumeAmplitude
                    binding.noiseValue.text = state.noiseValue

                    updateSaveButton(state)
                }
            }
        }
    }
    // Открытие диалогового окна, для выбора причины шума
    private fun showReasonDialog() {
        val reasons = arrayOf("Автотранспорт", "Железнодорожный транспорт", "Промышленное предприятие", "Генераторная установка", "Авиатранспорт", "Автомойка", "Вентиляционные системы")
        val builder = AlertDialog.Builder(context)
        builder.setTitle("Выберите причину шума")
            .setItems(reasons) { _, which ->
                // 'which' содержит индекс выбранного элемента
                val selectedReason = reasons[which]
                // Обновляем выбранную причину в ViewModel
                viewModel.updateReasonSelected(selectedReason)
                // Обновляем текст кнопки выбора причины
                binding.buttonSelectReason.text = selectedReason
            }
        builder.create().show()
    }

    private fun applyNoiseCorrection(correction: Double?) {
        correctionValue = correction ?: 0.0
        Log.d("ShumFragment", "applyNoiseCorrection called with correction: $correctionValue")
    }

    // Обработка результатов запроса разрешений
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        if (requestCode == PERMISSION_REQUEST_CODE) {
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                startRecording()
            } else {
                // Показать сообщение об отказе в разрешениях
                Toast.makeText(context, "Permission denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Начать запись звука
    private fun startRecording() {
        if (!isRecording) {
            try {
                // Начать запись через MediaRecorder
                viewModel.startRecording()
                mediaRecorder = MediaRecorder()
                output = requireActivity().getExternalFilesDir(null)!!.absolutePath + "/recording.MPEG4"

                mediaRecorder?.setAudioSource(MediaRecorder.AudioSource.MIC)
                mediaRecorder?.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
                mediaRecorder?.setAudioEncoder(MediaRecorder.AudioEncoder.AAC)
                mediaRecorder?.setOutputFile(output)
                mediaRecorder?.prepare()
                mediaRecorder?.start()

                isRecording = true

                handler.post(volumeRunnable)
                Toast.makeText(context, "Recording started!", Toast.LENGTH_SHORT).show()
                binding.timerText.visibility = View.VISIBLE
                binding.timerProgress.visibility = View.VISIBLE
                binding.noiseValue.visibility = View.VISIBLE

                // Подписываемся на LiveData для получения актуального значения коррекции
                    applyNoiseCorrection(correctionValue) // Применяем коррекцию сразу
            } catch (e: IllegalStateException) {
                e.printStackTrace()
                mediaRecorder = null
            } catch (e: IOException) {
                e.printStackTrace()
                mediaRecorder = null
            }
        } else {
            Toast.makeText(context, "Recording is already in progress!", Toast.LENGTH_SHORT).show()
        }
    }

    // Остановить запись звука
    private fun stopRecording() {
        if (isRecording) {
            if (viewModel.observeUi().value.timerProgress != 100) {
                // Показать диалоговое окно при попытке остановить запись до завершения таймера
                showDialog()
            } else {
                stop(true)
            }
        } else {
            // Показать сообщение, если запись не идет
            Toast.makeText(context, "You are not recording right now!", Toast.LENGTH_SHORT).show()
        }
    }

    // Остановить запись звука
    private fun stop(save: Boolean) {
        handler.removeCallbacks(volumeRunnable)
        mediaRecorder?.stop()
        mediaRecorder?.release()
        mediaRecorder = null
        isRecording = false
        // Показать сообщение о завершении записи
        Toast.makeText(context, "Recording stopped!", Toast.LENGTH_SHORT).show()
        viewModel.stopRecording()

        binding.timerText.visibility = View.GONE
        binding.timerProgress.visibility = View.GONE
        binding.noiseValue.visibility = if (save) View.VISIBLE else View.GONE

        if (!save) {
            viewModel.clearVolumeList()
        }
    }

    private fun getVolume(): Double {
        // Проверяем, выполняется ли запись и есть ли объект MediaRecorder
        if (mediaRecorder != null && isRecording) {
            // Получаем максимальную амплитуду
            val maxAmplitude = mediaRecorder?.maxAmplitude ?: 1
            // Добавляем амплитуду визуализации в WaveFormView
            binding.waveFormView.addAmplitude((maxAmplitude?.toFloat() ?: 1f) / 2)
            // Используем correctionValue для коррекции уровня громкости
            val volume = 20 * log10(maxAmplitude.toDouble()) + correctionValue
            return volume
        }
        return 0.0
    }

    // Функция для отображения диалогового окна
    private fun showDialog() {
        // Создаем диалоговое окно с помощью AlertDialog.Builder
        val builder: AlertDialog.Builder = AlertDialog.Builder(context)
        builder
            .setMessage("меньше 5 мин")
            .setTitle("Точно выключить?")
            // Устанавливаем положительную кнопку и ее обработчик
            .setPositiveButton("Да") { _, _ ->
                stop(false) // Останавливаем запись с флагом сохранения false
            }
            // Устанавливаем отрицательную кнопку и ее обработчик
            .setNegativeButton("Отмена") { dialog, _ ->
                dialog.dismiss() // Закрываем диалоговое окно без действия
            }

        // Создаем диалоговое окно и отображаем его
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    // Функция для обновления состояния кнопки сохранения
    private fun updateSaveButton(state: State) {
        val regionSelected = binding.selectRegion.text.toString() != getString(R.string.region)
        val reasonSelected = state.reasonSelected
        val saveAvailable = state.saveAvailable
        val timeProgress = state.timerProgress

        Log.d("UpdateSaveButton", "regionSelected: $regionSelected, reasonSelected: $reasonSelected, saveAvailable: $saveAvailable, timeProgress: $timeProgress")

        // Кнопка выбора региона доступна только после завершения таймера
        binding.selectRegion.isEnabled = saveAvailable && (timeProgress == 0 || timeProgress == 100)

        // Кнопка выбора причины доступна только после выбора региона
        binding.buttonSelectReason.isEnabled = state.regionSelected

        // Кнопка сохранения доступна только после выбора причины
        binding.save.isEnabled = state.reasonSelected != null && state.isStartRecording == false
    }
}