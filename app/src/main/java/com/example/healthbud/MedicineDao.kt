package com.example.healthbud

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface MedicineDao {
    @Query("SELECT * FROM medicine_table")
    fun getAll(): Flow<List<MedicineEntity>>

    @Insert
    fun insertAll(entries: List<MedicineEntity>)

    @Insert
    fun insert(entry: MedicineEntity)

    @Query("DELETE FROM medicine_table")
    fun deleteAll()
}