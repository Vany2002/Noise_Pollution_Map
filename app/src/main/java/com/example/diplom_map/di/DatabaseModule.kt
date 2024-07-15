package com.example.diplom_map.di

import android.content.Context
import com.example.diplom_map.database.AppDatabase
import dagger.Module
import dagger.Provides

// Модуль Dagger для предоставления базы данных
@Module
object DatabaseModule {

    // Предоставляет экземпляр базы данных приложения
    @Provides
    fun provideDatabase(context: Context): AppDatabase = AppDatabase.getInstance(context)

}