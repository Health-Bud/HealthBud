package com.example.healthbud

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercise_table")
data class ExerciseEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "date") val date: String?,
    @ColumnInfo(name = "type") val type: String?,
    @ColumnInfo(name = "rep") val rep: Int?,
    @ColumnInfo(name = "set") val set: Int?,
)