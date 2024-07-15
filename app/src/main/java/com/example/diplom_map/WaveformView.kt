package com.example.diplom_map

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

// Определение пользовательского представления для отображения звуковой волны
class WaveformView(context: Context?, attrs: AttributeSet?): View(context, attrs) {

    // Кисть для рисования
    private var paint = Paint()

    // Список амплитуд звуковой волны
    private var amplitudes = ArrayList<Float>()

    // Список прямоугольников для отображения амплитуд
    private var spikes = ArrayList<RectF>()

    // Радиус скругления прямоугольников
    private var radius = 6f

    // Ширина прямоугольника
    private var w = 9f

    // Расстояние между прямоугольниками
    private var d = 6f

    // Ширина экрана и высота представления
    private var sw = 0f
    private var sh = 400f

    // Максимальное количество прямоугольников на экране
    private var maxSpikes = 0

    // Инициализация начальных параметров
    init {
        // Установка цвета кисти
        paint.color = Color.rgb(244, 81, 30)
        // Получение ширины экрана
        sw = resources.displayMetrics.widthPixels.toFloat()
        // Вычисление максимального количества прямоугольников на экране
        maxSpikes = (sw / (w + d)).toInt()
    }

    // Метод для добавления амплитуды
    fun addAmplitude(amp: Float) {
        // Нормализация амплитуды и добавление ее в список
        var norm = Math.min(amp.toInt()/7, sh.toInt()).toFloat()
        amplitudes.add(norm)

        // Очистка списка прямоугольников
        spikes.clear()
        // Получение последних значений амплитуд
        var amps = amplitudes.takeLast(maxSpikes)

        // Создание прямоугольников на основе амплитуд
        for (i in amps.indices) {
            var left = sw - i * (w + d)
            var top = sh/2 - amps[i]/2
            var right = left + w
            var bottom = top + amps[i]
            spikes.add(RectF(left, top, right, bottom))
        }

        // Перерисовка представления
        invalidate()
    }

    // Метод для очистки представления
    fun clear() {
        // Очистка списков амплитуд и прямоугольников
        spikes.clear()
        amplitudes.clear()

        // Перерисовка представления
        invalidate()
    }

    // Метод для отрисовки прямоугольников
    override fun draw(canvas: Canvas) {
        super.draw(canvas)
        // Отрисовка прямоугольников на холсте
        spikes.forEach {
            canvas.drawRoundRect(it, radius, radius, paint)
        }
    }
}