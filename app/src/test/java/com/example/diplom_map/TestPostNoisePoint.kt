//package com.example.diplom_map
//
//import android.util.Log
//
//suspend fun testPostNoisePoint() {
//    val response = RetrofitInstance.api.postNoisePoint(testNoisePoint)
//    if (response.isSuccessful) {
//        // Обработка успешного ответа
//        Log.d("TestPost", "Успешная отправка: ${response.body()}")
//    } else {
//        // Обработка ошибки
//        Log.e("TestPost", "Ошибка отправки: ${response.errorBody()?.string()}")
//    }
//}