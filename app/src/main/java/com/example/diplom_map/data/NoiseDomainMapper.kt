package com.example.diplom_map.data

import com.example.diplom_map.domain.NoisePoint
import com.example.diplom_map.domain.QuietPoint
import com.example.diplom_map.domain.StatisticsPoint
import com.yandex.mapkit.geometry.Point

// Преобразование объекта NoisePoint в объект NoisePointRoom для базы данных Room
fun NoisePoint.asRoom(): NoisePointRoom = NoisePointRoom(
    id = 0,
    name = name,
    longitude = point.longitude,
    latitude = point.latitude,
    volume = volume,
    date = date,
    reason = reason
)

// Преобразование объекта NoisePointRoom в объект NoisePoint для доменного слоя
fun NoisePointRoom.asDomain(): NoisePoint = NoisePoint(
    id = id,
    name = name,
    point = Point(latitude, longitude),
    volume = volume,
    reason = reason,
    date = date
)

// Преобразование объекта QuietPoint в объект QuietPointRoom для базы данных Room
fun StatisticsPoint.asRoom(): StatisticsPointRoom = StatisticsPointRoom(
    id = id,
    name = name,
    size = size
)

fun StatisticsPointRoom.asDomain(): StatisticsPoint = StatisticsPoint(
    id = id,
    name = name,
    size = size
)

// Преобразование объекта QuietPoint в объект QuietPointRoom для базы данных Room
fun QuietPoint.asRoom(): QuietPointRoom = QuietPointRoom(
    id = 0,
    name = name,
    longitude = point.longitude,
    latitude = point.latitude,
    volume = volume,
    date = date,
    reason = reason
)

// Преобразование объекта QuietPointRoom в объект QuietPoint для доменного слоя
fun QuietPointRoom.asDomain(): QuietPoint = QuietPoint(
    id = id,
    name = name,
    point = Point(latitude, longitude),
    volume = volume,
    reason = reason,
    date = date
)