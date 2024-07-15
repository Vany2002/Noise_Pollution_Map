//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import android.widget.ImageButton
//import android.widget.TextView
//import androidx.fragment.app.Fragment
//import androidx.fragment.app.activityViewModels
//import androidx.fragment.app.viewModels
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//import com.example.diplom_map.R
//import com.example.diplom_map.presentation.SharedViewModel
//
//class SettingsFragment : Fragment(R.layout.settings_fragment) {
//
//    // Используем 'externalFilesDir' вместо 'fileDir'
//    private val viewModel: SettingsViewModel by viewModels {
//        SettingsViewModelFactory(requireActivity().getExternalFilesDir(null)!!.absolutePath)
//    }
//
//    private val sharedViewModel: SharedViewModel by activityViewModels()
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val savedCorrection = viewModel.loadNoiseLevelCorrection(requireContext())
//        viewModel.setNoiseLevelCorrection(savedCorrection)
//
//        val buttonSettings = view.findViewById<ImageButton>(R.id.buttonShum)
//        buttonSettings.setOnClickListener {
//            // Возвращаемся на предыдущий фрагмент в стеке
//            requireActivity().supportFragmentManager.popBackStack()
//        }
//
//        val startRecordingButton = view.findViewById<Button>(R.id.startRecordingButton)
//        val stopRecordingButton = view.findViewById<Button>(R.id.stopRecordingButton)
//        val increaseVolumeButton = view.findViewById<ImageButton>(R.id.increaseVolumeButton)
//        val decreaseVolumeButton = view.findViewById<ImageButton>(R.id.decreaseVolumeButton)
//        val noiseLevelTextView = view.findViewById<TextView>(R.id.noiseLevelTextView)
//
//        startRecordingButton.setOnClickListener {
//            viewModel.startRecordingWithCorrection()
//        }
//
//        stopRecordingButton.setOnClickListener {
//            viewModel.stopRecordingWithCorrection()
//        }
//
//        increaseVolumeButton.setOnClickListener {
//            viewModel.increaseNoiseLevel(requireContext()) // Передаем контекст
//        }
//
//        decreaseVolumeButton.setOnClickListener {
//            viewModel.decreaseNoiseLevel(requireContext()) // Передаем контекст
//        }
//
//        viewModel.noiseLevel.observe(viewLifecycleOwner) { level ->
//            noiseLevelTextView.text = "Уровень шума: $level dB"
//            sharedViewModel.updateNoiseLevel(level)
//        }
//    }
//}
//
//class SettingsViewModelFactory(private val externalFilesDir: String) : ViewModelProvider.Factory {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(SettingsViewModel::class.java)) {
//            return SettingsViewModel(externalFilesDir) as T
//        }
//        throw IllegalArgumentException("Unknown ViewModel class")
//    }
//}