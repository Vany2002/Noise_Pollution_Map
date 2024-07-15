package com.example.diplom_map.presentation.searchRegion

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.diplom_map.R
import com.example.diplom_map.databinding.RegionItemBinding

class RegionsAdapter(
    private val onClick: (String) -> Unit // Конструктор адаптера, принимающий функцию обратного вызова для обработки нажатий на элементы списка
): ListAdapter<String, RegionsAdapter.RegionViewHolder>(DiffUtil()) {

    inner class RegionViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val binding = RegionItemBinding.bind(view) // Привязка View элементов к объектам внутри класса ViewHolder

        // Функция для привязки данных к элементам View внутри ViewHolder и установки обработчика нажатия
        fun bind(item: String, onClick: (String) -> Unit) {
            binding.region.text = item // Установка текста для элемента списка
            binding.root.setOnClickListener { onClick.invoke(item) } // Установка обработчика нажатия на элемент списка
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RegionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.region_item, parent, false) // Создание нового View для элемента списка
        return RegionViewHolder(view) // Возвращение ViewHolder'а с созданным View
    }

    override fun onBindViewHolder(holder: RegionViewHolder, position: Int) {
        val item = currentList[position] // Получение текущего элемента списка
        holder.bind(item, onClick) // Вызов функции bind() у ViewHolder для привязки данных и обработки нажатий
    }

}

class DiffUtil: DiffUtil.ItemCallback<String>() {

    // Проверка на совпадение элементов в старом и новом списке
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    // Проверка на совпадение содержимого элементов в старом и новом списке
    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}