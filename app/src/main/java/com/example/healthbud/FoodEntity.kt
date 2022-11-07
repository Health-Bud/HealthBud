package com.example.healthbud

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "food_table")
data class FoodEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "date") val date: String?,
    @ColumnInfo(name = "food") val food: String?,
    @ColumnInfo(name = "calorie") val calorie: Int?,
    @ColumnInfo(name = "carb") val carb: Double?,
    @ColumnInfo(name = "protein") val protein: Double?,
    @ColumnInfo(name = "fat") val fat: Double?
)