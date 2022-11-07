package com.example.healthbud

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface ExerciseDao {
    @Query("SELECT * FROM exercise_table")
    fun getAll(): Flow<List<ExerciseEntity>>

    @Insert
    fun insertAll(entries: List<ExerciseEntity>)

    @Insert
    fun insert(entry: ExerciseEntity)

    @Query("DELETE FROM exercise_table")
    fun deleteAll()
}