package com.example.diplom_map.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.diplom_map.R
import com.example.diplom_map.databinding.ActivityMainBinding
import com.example.diplom_map.presentation.statistics.StatisticsFragment
import com.example.diplom_map.presentation.map.MapFragment
import com.example.diplom_map.presentation.shum.ShumFragment

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::bind) // Инициализация View Binding для активити

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Установка макета для активити

        binding.bottomNavigationView.setOnItemSelectedListener { // Установка слушателя для нижнего навигационного меню
            when (it.itemId) {
                R.id.map -> { openMap() }
                R.id.shum -> { openShum() }
                R.id.statistics -> { openStatistics() }
                R.id.info -> { openInfo() }
                else -> {}
            }
            true
        }

        supportFragmentManager.beginTransaction() // Начало транзакции фрагмента
            .add(R.id.container, MapFragment()) // Добавление фрагмента карты в контейнер
            .commit() // Подтверждение транзакции
    }

    private fun openMap() {
        supportFragmentManager.beginTransaction() // Начало транзакции фрагмента
            .replace(R.id.container, MapFragment()) // Замена текущего фрагмента на фрагмент карты
            .commit() // Подтверждение транзакции
    }

    private fun openShum() {
        supportFragmentManager.beginTransaction() // Начало транзакции фрагмента
            .replace(R.id.container, ShumFragment()) // Замена текущего фрагмента на фрагмент шума
            .commit() // Подтверждение транзакции
    }

    private fun openStatistics() {
        supportFragmentManager.beginTransaction() // Начало транзакции фрагмента
            .replace(R.id.container, StatisticsFragment()) // Замена текущего фрагмента на фрагмент статистики
            .commit() // Подтверждение транзакции
    }

    private fun openInfo() {
        supportFragmentManager.beginTransaction() // Начало транзакции фрагмента
            .replace(R.id.container, InfoFragment()) // Замена текущего фрагмента на фрагмент проекта
            .commit() // Подтверждение транзакции
    }
}