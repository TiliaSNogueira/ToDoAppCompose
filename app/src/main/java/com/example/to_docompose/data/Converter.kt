package com.example.to_docompose.data

import androidx.room.TypeConverter
import com.example.to_docompose.data.models.Priority

class Converter {

    @TypeConverter
    fun fromPriority(priority: Priority) : String {
        return priority.name
    }

    @TypeConverter
    fun fromString(priority: String) : Priority {
        return Priority.valueOf(priority)
    }
}