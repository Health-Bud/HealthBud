package com.example.healthbud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Exercise : AppCompatActivity() {
    private lateinit var  dateTextView: TextView
    private lateinit var  typeTextView: TextView
    private lateinit var  repsTextView: TextView
    private lateinit var  setsTextView: TextView
    private lateinit var  saveButton: Button
    private lateinit var  backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)

        dateTextView = findViewById(R.id.Date)
        typeTextView = findViewById(R.id.Exercise)
        repsTextView = findViewById(R.id.Reps)
        setsTextView = findViewById(R.id.Sets)
        saveButton = findViewById(R.id.recordExButton)
        backButton = findViewById(R.id.Back)

        backButton.setOnClickListener {
            finish()
        }
    }
}