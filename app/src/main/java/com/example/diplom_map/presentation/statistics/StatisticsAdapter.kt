package com.example.diplom_map.presentation.statistics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.diplom_map.R
import com.example.diplom_map.databinding.StatisticsItemBinding
import com.example.diplom_map.domain.Statistics

// Определение адаптера для списка статистики
class StatisticsAdapter(): ListAdapter<Statistics, StatisticsAdapter.ViewHolder>(DiffUtil()) {

    // Внутренний класс ViewHolder, содержащий представление элемента списка
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        // Привязка элементов макета с использованием View Binding
        private val binding = StatisticsItemBinding.bind(view)

        // Метод для привязки данных к элементу списка
        fun bind(item: Statistics) {
            binding.region.text = item.region
            // Отображение процентного значения с двумя десятичными знаками
            binding.count.text = "${String.format("%.2f", item.result)} %"
        }
    }

    // Создание нового ViewHolder при необходимости
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.statistics_item, parent, false)
        return ViewHolder(view)
    }

    // Привязка данных к ViewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = currentList[position]
        holder.bind(item)
    }

}

// Класс DiffUtil для оптимизации обновлений списка
class DiffUtil(): DiffUtil.ItemCallback<Statistics>() {

    // Метод сравнения элементов списка
    override fun areItemsTheSame(oldItem: Statistics, newItem: Statistics): Boolean {
        return oldItem.id == newItem.id
    }

    // Метод сравнения содержимого элементов списка
    override fun areContentsTheSame(oldItem: Statistics, newItem: Statistics): Boolean {
        return oldItem == newItem
    }
}