package com.example.healthbud

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [FoodEntity::class, MedicineEntity::class, ExerciseEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun FoodDao(): FoodDao
    abstract fun MedicineDao(): MedicineDao
    abstract fun ExerciseDao(): ExerciseDao

    companion object {

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java, "Articles-db"
            ).build()
    }
}