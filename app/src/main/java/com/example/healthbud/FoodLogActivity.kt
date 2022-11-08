package com.example.healthbud

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class FoodLogActivity : AppCompatActivity() {
    private lateinit var foodET: EditText
    private lateinit var calorieET: EditText
    private lateinit var carbET: EditText
    private lateinit var proteinET: EditText
    private lateinit var fatET: EditText
    private lateinit var saveButton: Button
    private lateinit var backButton: Button
    private lateinit var currentTime: Date

    @SuppressLint("SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_log)

        currentTime = Calendar.getInstance().time
        val dateFormat = SimpleDateFormat("MM/dd/yyyy")
        val output: String = dateFormat.format(currentTime)
        Log.v("outputDate: ", output )

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

        saveButton.setOnClickListener {
            lifecycleScope.launch(Dispatchers.IO) {
                (application as HealthBudApplication).db.FoodDao().insert(
                    FoodEntity (
                        id = 0,
                        date = output,
                        foodET.text.toString(),
                        calorieET.text.toString().toInt(),
                        carbET.text.toString().toDouble(),
                        proteinET.text.toString().toDouble(),
                        fatET.text.toString().toDouble()
                    )
                )
            }
            finish()
        }
    }
}