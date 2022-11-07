package com.example.healthbud

data class DisplayMedicine(
    val date: String?,
    val medicine: String?,
    val dose: String?,
    val notes: String?,
) : java.io.Serializable