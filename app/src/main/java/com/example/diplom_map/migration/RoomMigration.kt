package com.example.diplom_map.migration

import com.example.diplom_map.data.NoiseRepository
import com.example.diplom_map.data.Repository
import com.example.diplom_map.domain.NoisePoint
import com.example.diplom_map.domain.QuietPoint
import com.example.diplom_map.domain.StatisticsPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.Calendar
import java.util.Date
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.random.Random

@Singleton // Одиночка: гарантирует, что будет создан только один экземпляр этого класса
class RoomMigration @Inject constructor( // Класс миграции комнаты, внедрение зависимостей
    private val repository: NoiseRepository, // Репозиторий шума для доступа к данным
    private val migrateRepository: Repository // Репозиторий миграции для доступа к данным
) {

    fun migrateIfNeeded() { // Метод для выполнения миграции, если это необходимо
        CoroutineScope(Dispatchers.IO).launch { // Запуск корутины в потоке ввода-вывода
            if (repository.isDataBaseCleared()) { // Проверка, была ли очищена база данных
                downloadData() // Если база данных была очищена, загрузить данные
            }
        }
    }

    private suspend fun downloadData() { // Сопрограмма для загрузки данных
        CoroutineScope(Dispatchers.IO).launch { // Запуск корутины в потоке ввода-вывода
            try {
                migrateRepository.getPoints().forEach { // Получение списка точек из репозитория миграции
                    it.second.forEach { second -> // Перебор второго элемента в паре
                        val point = NoisePoint(0, it.first, second, reason = randomReason(), date = randomDate()) // Создание объекта шума
                        repository.insert(point) // Вставка точки в репозиторий шума
                    }
                }
            } catch (e: Exception) {
                // Обработка исключения
            }
        }.join() // Ожидание завершения выполнения корутины

        CoroutineScope(Dispatchers.IO).launch { // Запуск корутины в потоке ввода-вывода
            try {
                migrateRepository.getQuietPoints().forEach { // Получение списка тихих точек из репозитория миграции
                    it.second.forEach { second -> // Перебор второго элемента в паре
                        val point = QuietPoint(0, it.first, second, reason = randomReason(), date = randomDate()) // Создание объекта тихой точки без параметра size
                        repository.insert(point) // Вставка тихой точки в репозиторий
                    }
                }
            } catch (e: Exception) {
                // Обработка исключения
            }
        }.join()

        CoroutineScope(Dispatchers.IO).launch { // Запуск корутины в потоке ввода-вывода
            try {
                migrateRepository.getStatisticsPointRoom().forEach { // Получение списка тихих точек из репозитория миграции
                    val point = StatisticsPoint(name = it.first, size = it.second as Int) // Создание объекта тихой точки
                    repository.insert(point)
                }
            } catch (e: Exception) {
            }
        }
    }

    private fun randomReason(): String {
        return listOf("Автотранспорт", "Автотранспорт", "Автотранспорт", "Автотранспорт", "Автотранспорт", "Автотранспорт", "Автотранспорт", "Автотранспорт", "Автотранспорт", "Автотранспорт", "Автотранспорт", "Автотранспорт", "Автотранспорт", "Автотранспорт", "Автотранспорт", "Автотранспорт", "Автотранспорт", "Автотранспорт", "Железнодорожный транспорт", "Железнодорожный транспорт", "Железнодорожный транспорт", "Железнодорожный транспорт", "Железнодорожный транспорт", "Промышленное предприятие", "Промышленное предприятие", "Промышленное предприятие", "Генераторная установка", "Авиатранспорт", "Автомойка", "Вентиляционные системы").random()
    }

    private fun randomDate(): Calendar {
        val minDays = Calendar.getInstance().apply {
            set(Calendar.YEAR, 2020)
            set(Calendar.MONTH, 1)
            set(Calendar.DAY_OF_YEAR, 1)
            set(Calendar.HOUR, 0)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
        }.timeInMillis
        val maxDays = Calendar.getInstance().timeInMillis
        val randomMills = Random.nextLong(minDays, maxDays)

        return Calendar.getInstance().apply { timeInMillis = randomMills }
    }
}