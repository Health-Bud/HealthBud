package com.example.healthbud

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "medicine_table")
data class MedicineEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "date") val date: String?,
    @ColumnInfo(name = "medicine") val medicine: String?,
    @ColumnInfo(name = "dose") val dose: String?,
    @ColumnInfo(name = "notes") val notes: String?,
)