package com.example.diplom_map.di

import com.example.diplom_map.data.NoiseDAO
import com.example.diplom_map.data.NoiseRepository
import com.example.diplom_map.data.NoiseRepositoryImpl
import com.example.diplom_map.database.AppDatabase
import dagger.Module
import dagger.Provides

// Модуль Dagger для предоставления репозиториев
@Module
object RepositoriesModule {

    // Предоставляет экземпляр DAO для работы с данными о шуме
    @Provides
    fun provideNoiseDao(appDatabase: AppDatabase): NoiseDAO = appDatabase.getNoiseDao()

    // Предоставляет реализацию репозитория для работы с данными о шуме
    @Provides
    fun provideNoiseRepository(impl: NoiseRepositoryImpl): NoiseRepository = impl
}