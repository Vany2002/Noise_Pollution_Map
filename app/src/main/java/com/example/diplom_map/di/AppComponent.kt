package com.example.diplom_map.di

import android.content.Context
import com.example.diplom_map.di.map.MapComponent
import com.example.diplom_map.di.searchRegion.SearchRegionComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        DatabaseModule::class,
        RepositoriesModule::class,
        ManagersModule::class
    ]
)
// Компонент Dagger приложения, связывающий все модули и предоставляющий доступ к подкомпонентам
interface AppComponent {

    // Возвращает подкомпонент для работы с картой
    fun getMapComponent(): MapComponent

    // Возвращает подкомпонент для работы со статистикой
    fun getStatisticsComponent(): StatisticsComponent

    // Возвращает подкомпонент для работы с шумом
    fun getShumComponent(): ShumComponent

    // Возвращает подкомпонент для работы с поиском регионов
    fun getSearchRegionComponent(): SearchRegionComponent

    @Component.Builder
    // Строитель компонента приложения
    interface AppComponentBuilder {

        // Привязывает экземпляр Context к компоненту
        fun application(@BindsInstance context: Context): AppComponentBuilder

        // Создает экземпляр AppComponent построенного компонента
        fun create(): AppComponent
    }

}