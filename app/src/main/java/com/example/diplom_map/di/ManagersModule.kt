package com.example.diplom_map.di

import com.itleader.delivery.LocationManager
import com.itleader.delivery.LocationManagerImpl
import dagger.Module
import dagger.Provides

// Модуль Dagger для предоставления менеджеров
@Module
object ManagersModule {

    // Предоставляет реализацию менеджера местоположения
    @Provides
    fun provideLocationManager(impl: LocationManagerImpl): LocationManager = impl
}