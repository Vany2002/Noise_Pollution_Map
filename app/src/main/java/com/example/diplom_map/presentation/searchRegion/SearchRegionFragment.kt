package com.example.diplom_map.presentation.searchRegion

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
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
import com.example.diplom_map.databinding.SearchRegionFragmentBinding
import kotlinx.coroutines.launch

class SearchRegionFragment: Fragment(R.layout.search_region_fragment) {

    // Получение экземпляра ViewModel с использованием Delegated Properties
    private val viewModel by viewModels<SearchRegionViewModel> {
        Factory {
            // Получение компонента и ViewModel из приложения
            (requireActivity().application as App)
                .appComponent
                .getSearchRegionComponent()
                .viewModel()
        }
    }

    // Привязка ViewBinding
    private val binding by viewBinding(SearchRegionFragmentBinding::bind)

    // Адаптер для списка регионов
    private lateinit var adapter: RegionsAdapter

    // Слушатель изменений текста для поиска
    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

        // Вызывается при изменении текста
        override fun onTextChanged(text: CharSequence?, p1: Int, p2: Int, p3: Int) {
            viewModel.setQuery(text?.toString().orEmpty()) // Обновление запроса в ViewModel
        }

        override fun afterTextChanged(p0: Editable?) {}
    }

    // Вызывается при создании представления
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecycler() // Настройка RecyclerView

        binding.editDistrict.addTextChangedListener(textWatcher) // Установка слушателя текста

        // Запуск корутины для наблюдения за состоянием жизненного цикла представления
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                // Наблюдение за изменениями UI
                viewModel.observeUi().collect { state ->
                    adapter.submitList(state.regions) // Обновление списка регионов
                }
            }
        }
    }

    // Настройка RecyclerView
    private fun setupRecycler() {
        adapter = RegionsAdapter {
            // Установка результата фрагменту и закрытие его
            setFragmentResult("requestKey", bundleOf("region" to it))
            parentFragmentManager.popBackStack()
        }

        binding.content.adapter = adapter // Установка адаптера
        binding.content.layoutManager = LinearLayoutManager(requireContext()) // Установка менеджера макета
        // Добавление разделителя между элементами списка
        binding.content.addItemDecoration(DividerItemDecoration(requireContext(), LinearLayoutManager.VERTICAL))
    }
}