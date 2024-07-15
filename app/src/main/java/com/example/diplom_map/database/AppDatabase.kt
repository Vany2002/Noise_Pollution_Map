package com.example.diplom_map.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.diplom_map.data.NoiseDAO
import com.example.diplom_map.data.NoisePointRoom
import com.example.diplom_map.data.QuietPointRoom
import com.example.diplom_map.data.StatisticsPointRoom
import com.example.diplom_map.data.UserPointRoom

@Database(
    version = 1,
    entities = [
        NoisePointRoom::class,
        QuietPointRoom::class,
        UserPointRoom::class,
        StatisticsPointRoom::class
    ]
)
@TypeConverters(CalendarConverter::class)
abstract class AppDatabase: RoomDatabase() {

    // Абстрактный метод для получения объекта доступа к данным о шуме
    abstract fun getNoiseDao(): NoiseDAO

    companion object {
        private var INSTANCE: AppDatabase? = null

        // Метод для получения экземпляра базы данных
        fun getInstance(context: Context): AppDatabase {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "database")
                        .allowMainThreadQueries() // Разрешение выполнения запросов на главном потоке (не рекомендуется)
                        .build()
                }
            }
            return INSTANCE!!
        }
    }
}