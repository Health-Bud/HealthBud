package com.example.healthbud

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class FoodLogActivity : AppCompatActivity() {
    private lateinit var foodET: EditText
    private lateinit var calorieET: EditText
    private lateinit var carbET: EditText
    private lateinit var proteinET: EditText
    private lateinit var fatET: EditText
    private lateinit var saveButton: Button
    private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_log)

        // Find the views for the screen
        foodET = findViewById(R.id.FoodET)
        calorieET = findViewById(R.id.CalorieET)
        carbET = findViewById(R.id.CarbET)
        proteinET = findViewById(R.id.ProteinET)
        fatET = findViewById(R.id.FatET)
        saveButton = findViewById(R.id.FoodRecordButton)
        backButton = findViewById(R.id.FoodBackButton)

        backButton.setOnClickListener {
            finish()
        }
    }
}