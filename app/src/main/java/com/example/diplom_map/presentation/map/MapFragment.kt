package com.example.diplom_map.presentation.map

import android.Manifest
import android.app.AlertDialog
import android.content.pm.PackageManager
import android.content.res.ColorStateList
import android.location.Location
import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.diplom_map.PlacemarkUserData
import com.example.diplom_map.R
import com.example.diplom_map.application.App
import com.example.diplom_map.base.Factory
import com.example.diplom_map.databinding.MapFragmentBinding
import com.example.diplom_map.domain.NoisePoint
import com.example.diplom_map.domain.VolumePoint
import com.example.diplom_map.presentation.ClusterView
import com.google.android.play.integrity.internal.m
import com.yandex.mapkit.Animation
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraListener
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.map.CameraUpdateReason
import com.yandex.mapkit.map.ClusterListener
import com.yandex.mapkit.map.Map
import com.yandex.mapkit.map.MapObjectCollection
import com.yandex.mapkit.map.MapObjectTapListener
import com.yandex.runtime.image.ImageProvider
import com.yandex.runtime.ui_view.ViewProvider
import kotlinx.coroutines.launch

class MapFragment: Fragment(com.example.diplom_map.R.layout.map_fragment), CameraListener {

    // Используем свойство делегирования для привязки ViewBinding.
    private val binding by viewBinding(MapFragmentBinding::bind)

    // Используем свойство делегирования для создания ViewModel с помощью Factory.
    private val viewmodel by viewModels<MapViewModel> {
        Factory {
            (requireActivity().application as App)
                .appComponent
                .getMapComponent()
                .getViewModel()
        }
    }

    // Последний зум.
    private var lastZoom: Float = 0f

    // Коллекция объектов на карте.
    private lateinit var mapObjects: MapObjectCollection

    // Элементы и регионы, получаемые из ViewModel.
    private val items
        get() = viewmodel.observeUi().value.items
    private val regions
        get() = viewmodel.observeUi().value.regions

    // Поставщик изображений для маркеров.
    private val imageProvider by lazy {
        ImageProvider.fromResource(
            requireContext(),
            com.example.diplom_map.R.drawable.pin_shum
        )
    }

    // Слушатель нажатия на маркер.
    private val onTapPlaceMarkListener = MapObjectTapListener { mapObject, point ->
        val userData = (mapObject.userData as PlacemarkUserData)
        showPointDialog(userData, point)
        true
    }

    // Слушатель кластеров.
    private val clusterListener = ClusterListener { cluster ->
        cluster.appearance.setView(
            ViewProvider(
                ClusterView(requireContext()).apply {
                    val userData = cluster.placemarks.map { (it.userData as PlacemarkUserData) }
                    setData(userData.first().size, userData.first().region)
                }
            )
        )
        cluster.appearance.zIndex = 100f
    }

    // Создание объекта MapKit при создании фрагмента.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapKitFactory.initialize(requireContext())
    }

    // Настройка интерфейса после создания view.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Получаем объекты карты и устанавливаем начальную позицию.
        mapObjects = binding.mapview.mapWindow.map.mapObjects
        binding.mapview.mapWindow.map.move(
            CameraPosition(
                Point(55.751225, 37.629540),
                9.0f,
                150.0f,
                30.0f
            )
        )

        binding.switchNoise.setOnClickListener {
            viewmodel.switchQuiet(!viewmodel.observeUi().value.isNoise)
            lastZoom = 0f
        }

        // Устанавливаем слушатели нажатий.
        binding.mapview.mapWindow.map.addCameraListener(this)
        binding.myLocation.setOnClickListener {
            if (ContextCompat.checkSelfPermission(
                    requireContext(),
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    requireActivity(),
                    arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                    1
                )
                return@setOnClickListener
            }
            viewmodel.requestLocationUpdates()
        }
        binding.zoomIn.setOnClickListener { zoomChanged(true) }
        binding.zoomOut.setOnClickListener { zoomChanged(false) }

        // Наблюдаем за данными ViewModel и обновляем маркеры при изменении.
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewmodel.observeUi().collect { state ->
                    createPlaceMarks()
                    state.location?.let { location ->
                        locationUpdate(location)
                    }

                    if (state.isNoise) {
                        binding.switchNoise.backgroundTintList = ColorStateList.valueOf(resources.getColor(R.color.black))
                        binding.switchNoise.setTextColor(resources.getColor(R.color.white)) // Установка белого цвета текста
                        binding.switchNoise.text = "Шумные точки"
                    } else {
                        binding.switchNoise.backgroundTintList = ColorStateList.valueOf(resources.getColor(R.color.white))
                        binding.switchNoise.setTextColor(resources.getColor(R.color.black)) // Установка черного цвета текста
                        binding.switchNoise.text = "Тихие точки"
                    }
                }
            }
        }
    }

    // Обработка изменения зума карты.
    private fun zoomChanged(isIn: Boolean) {
        val cameraPosition = binding.mapview.mapWindow.map.cameraPosition
        val zoom = cameraPosition.zoom + if (isIn) 1 else -1
        val target = cameraPosition.target
        val tilt = cameraPosition.tilt
        val azimut = cameraPosition.azimuth

        binding.mapview.mapWindow.map.move(
            CameraPosition(
                target,
                zoom,
                azimut,
                tilt
            ),
            Animation(Animation.Type.LINEAR, 0.5f)
        ) {
        }
    }

    // Обновление местоположения на карте.
    private fun locationUpdate(location: Location) {
        val cameraPosition = binding.mapview.mapWindow.map.cameraPosition
        val zoom = 17f
        val target = Point(location.latitude, location.longitude)
        val tilt = cameraPosition.tilt
        val azimut = cameraPosition.azimuth

        binding.mapview.mapWindow.map.move(
            CameraPosition(
                target,
                zoom,
                azimut,
                tilt
            ),
            Animation(Animation.Type.LINEAR, 0.5f)
        ) {
        }
    }

    // Создание маркеров на карте в зависимости от зума.
    private fun createPlaceMarks() {
        val currentZoom = binding.mapview.mapWindow.map.cameraPosition.zoom

        if ((currentZoom <= 13 && lastZoom >= 13) || lastZoom == 0f || items.isEmpty()) { // Показываем только Москву.
            mapObjects.clear()
            regions.forEach {
                addObjects(
                    items = listOf(
                        NoisePoint(name = "", point = it.point),
                        NoisePoint(name = "", point = it.point)
                    ),
                    region = it.name,
                    size = it.size
                )
            }
        }

        if (currentZoom > 13 && lastZoom <= 13) {
            mapObjects.clear()
            val region = items.groupBy { it.name }
            region.forEach {
                addObjects(it.value, it.key, null)
            }
        }
        lastZoom = currentZoom.takeIf { regions.isNotEmpty() } ?: 0f
    }

    // Добавление маркеров на карту.
    private fun addObjects(items: List<VolumePoint>, region: String, size: Int?) {
        val cluster = mapObjects.addClusterizedPlacemarkCollection(clusterListener)

        items.forEach { noisePoint ->
            cluster.addPlacemark().apply {
                geometry = noisePoint.point
                setIcon(imageProvider)
                userData =
                    PlacemarkUserData(region = region, size = size ?: items.size, noisePoint.date, noisePoint.reason, noisePoint.volume)
                addTapListener(onTapPlaceMarkListener)
            }
        }
        cluster.clusterPlacemarks(CLUSTER_RADIUS, CLUSTER_MIN_ZOOM)
    }

    // Показ диалогового окна с информацией о маркере.
    private fun showPointDialog(userData: PlacemarkUserData, point: Point) {
        // Создание текстового сообщения с координатами и уровнем шума.
        val message = """
        Координаты:
            Широта:  ${point.latitude}
            Долгота: ${point.longitude}
        
        Причина: ${userData.reason ?: "Неизвестно"}
        Дата: ${userData.date?.time?.toString() ?: "Неизвестно"}
        Уровень шума: ${userData.volume ?: "Неизвестно"}
    """.trimIndent()

        // Показ диалогового окна с информацией о маркере.
        AlertDialog.Builder(requireContext())
            .setTitle(userData.region) // Установка заголовка диалога как название региона.
            .setMessage(message) // Установка текста сообщения.
            .setNeutralButton("OK") { dialog, _ -> dialog.dismiss() } // Установка кнопки "OK" для закрытия диалога.
            .show() // Показ диалогового окна.
    }


    override fun onStart() {
        super.onStart()
        MapKitFactory.getInstance().onStart() // Начало использования MapKit.
        binding.mapview.onStart() // Уведомление о начале использования MapView.
    }

    override fun onStop() {
        super.onStop()
        binding.mapview.onStop() // Уведомление об окончании использования MapView.
        MapKitFactory.getInstance().onStop() // Завершение использования MapKit.
    }

    override fun onCameraPositionChanged(
        p0: Map,
        p1: CameraPosition,
        reason: CameraUpdateReason,
        p3: Boolean
    ) {
        // Проверка, если изменение позиции вызвано пользовательским жестом, остановить обновление местоположения.
        if (reason == CameraUpdateReason.GESTURES) {
            viewmodel.stopLocationUpdates()
        }
        try {
            createPlaceMarks() // Создание маркеров на карте.
        } catch (_: Exception) {
        }
    }

    override fun onPause() {
        super.onPause()
        viewmodel.stopLocationUpdates() // Приостановка обновления местоположения при приостановке фрагмента.
    }

    companion object {
        private const val CLUSTER_RADIUS = 3000.0
        private const val CLUSTER_MIN_ZOOM = 15
    }
}