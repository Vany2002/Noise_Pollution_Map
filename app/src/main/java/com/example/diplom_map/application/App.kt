package com.example.diplom_map.application

import android.app.Application
import com.example.diplom_map.di.AppComponent
import com.example.diplom_map.di.DaggerAppComponent
import com.example.diplom_map.di.StatisticsComponent
import com.yandex.mapkit.MapKitFactory

// Класс приложения, расширяющий Application
class App: Application() {

    lateinit var appComponent: AppComponent

    // Метод вызывается при создании приложения
    override fun onCreate() {
        super.onCreate()

        // Устанавливаем API-ключ для Yandex MapKit
        MapKitFactory.setApiKey("f5ba09cb-d2ae-4a26-9747-b0e71983d67c")

        // Создаем и инициализируем AppComponent с помощью Dagger
        appComponent = DaggerAppComponent.builder().application(this).create()
    }

    // Метод для получения компонента статистики из AppComponent
    fun getStatisticsComponent(): StatisticsComponent {
        return appComponent.getStatisticsComponent()
    }
}