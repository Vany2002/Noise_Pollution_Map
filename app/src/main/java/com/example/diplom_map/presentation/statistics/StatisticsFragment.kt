package com.example.diplom_map.presentation.statistics

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.diplom_map.R
import com.example.diplom_map.application.App
import com.example.diplom_map.base.Factory
import com.example.diplom_map.databinding.StatisticsFragmentBinding
import kotlinx.coroutines.launch

class StatisticsFragment: Fragment(R.layout.statistics_fragment) {

    // Используем viewBinding для привязки макета к фрагменту
    private val binding by viewBinding(StatisticsFragmentBinding::bind)
    // Инициализация ViewModel с помощью делегата viewModels и Factory
    private val viewModel by viewModels<StatisticsViewModel> {
        Factory {
            (requireActivity().application as App)
                .getStatisticsComponent()
                .getViewModel()
        }
    }

    // TextWatcher для отслеживания изменений в поле ввода поиска
    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

        override fun onTextChanged(text: CharSequence?, p1: Int, p2: Int, p3: Int) {
            // Обновляем запрос в ViewModel при изменении текста
            viewModel.setQuery(text?.toString().orEmpty())
        }

        override fun afterTextChanged(p0: Editable?) {}

    }

    // Адаптер для RecyclerView
    private lateinit var adapter: StatisticsAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Настройка RecyclerView и привязка TextWatcher к полю ввода поиска
        setupRecycler()
        binding.editDistrict.addTextChangedListener(textWatcher)

        // Наблюдаем за состоянием интерфейса из ViewModel, используя корутины
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState().collect { state ->
                    // Обновляем адаптер новыми данными
                    adapter.submitList(state.items)
                }
            }
        }
    }

    // Функция для настройки RecyclerView
    private fun setupRecycler() {
        adapter = StatisticsAdapter()
        binding.content.adapter = adapter
        binding.content.layoutManager = LinearLayoutManager(requireContext())
        binding.content.addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))
    }
}