package com.example.diplom_map.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.diplom_map.R
import com.example.diplom_map.database.CalendarConverter
import com.example.diplom_map.domain.NoisePointServer
import kotlinx.coroutines.*
import java.util.Calendar

class InfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.info_fragment, container, false)
        return view
    }
//    // Функция для тестовой отправки данных на сервер
//    private suspend fun testPostNoisePoint() {
//        // Создание тестового объекта NoisePointServer
//        val testNoisePoint = NoisePointServer(
//            nameRegion = "Центральный район",
//            latitude = 55.7558,
//            longitude = 37.6173,
//            volume = 70.5,
//            datePoint = CalendarConverter().calendarToISO8601(Calendar.getInstance()),
//            reason = "Строительные работы"
//        )
//
//        // Отправка данных на сервер
//        try {
//            Log.d("TestPost", "Отправка данных на сервер: $testNoisePoint")
//            val response = RetrofitInstance.api.postNoisePoint(testNoisePoint)
//            withContext(Dispatchers.Main) {
//                if (response.isSuccessful && response.body() != null) {
//                    Log.d("TestPost", "Успешная отправка: ${response.body()}")
//                } else {
//                    Log.e("TestPost", "Ошибка отправки: ${response.errorBody()?.string()}")
//                }
//            }
//        } catch (e: Exception) {
//            withContext(Dispatchers.Main) {
//                Log.e("TestPost", "Исключение при отправке: ${e.message}")
//            }
//        }
//    }
}