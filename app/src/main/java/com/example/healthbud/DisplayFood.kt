package com.example.healthbud

data class DisplayFood(
    val date: String?,
    val food: String?,
    val calorie: Int?,
    val carb: Double?,
    val protein: Double?,
    val fat: Double?
) : java.io.Serializable