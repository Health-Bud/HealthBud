package com.example.healthbud

import android.app.Application

class HealthBudApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}