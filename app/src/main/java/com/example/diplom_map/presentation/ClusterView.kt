package com.example.diplom_map.presentation

import android.content.Context
import android.widget.LinearLayout
import android.widget.TextView
import com.example.diplom_map.R

// Определение класса ClusterView, который расширяет LinearLayout
class ClusterView(context: Context) : LinearLayout(context) {

    // Задание свойства greenText с использованием lazy инициализации
    private val greenText by lazy { findViewById<TextView>(R.id.text_green_pins) }

    // Инициализация класса
    init {
        // Надувание макета cluster_view в текущем контексте и добавление его к текущему LinearLayout
        inflate(context, R.layout.cluster_view, this)
        // Задание параметров макета
        layoutParams = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
        // Задание ориентации LinearLayout
        orientation = HORIZONTAL
        // Установка фонового ресурса для кластера
        setBackgroundResource(R.drawable.cluster_view_background)
    }

    // Метод для установки данных в представлении
    fun setData(size: Int, region: String = "") {
        // Обновление представлений с переданными данными
        updateViews(size, region)
    }

    // Приватный метод для обновления представлений
    private fun updateViews(size: Int, region:String) {
        // Установка текста в TextView greenText с использованием данных size и region
        greenText.text = "$region $size"
    }
}