package com.example.diplom_map.database

import androidx.room.TypeConverter
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder
import java.time.temporal.ChronoField
import java.util.Calendar
import java.util.GregorianCalendar
import java.util.Locale
import java.util.TimeZone

class CalendarConverter {
    @TypeConverter
    fun fromTimestamp(value: Long): Calendar {
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = value

        return calendar
    }

    @TypeConverter
    fun toTimestamp(calendar: Calendar): Long {
        return calendar.timeInMillis
    }

    @TypeConverter
    fun calendarToISO8601(calendar: Calendar): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault())
        dateFormat.timeZone = TimeZone.getTimeZone("UTC")
        return dateFormat.format(calendar.time)
    }

    @TypeConverter
    fun iso8601ToCalendar(iso8601String: String): Calendar {
        val formatter = DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd'T'HH:mm:ss")
            .appendFraction(ChronoField.MICRO_OF_SECOND, 3, 6, true)
            .toFormatter()

        val localDateTime = LocalDateTime.parse(iso8601String, formatter)
        return GregorianCalendar.from(localDateTime.atZone(ZoneId.systemDefault()))
    }
}