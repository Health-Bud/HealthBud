package com.example.healthbud

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class Exercise : AppCompatActivity() {

    private lateinit var  typeTextView: TextView
    private lateinit var  repsTextView: TextView
    private lateinit var  setsTextView: TextView
    private lateinit var  saveButton: Button
    private lateinit var  backButton: Button
    private lateinit var currentTime: Date

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)

        currentTime = Calendar.getInstance().time
        val dateFormat = SimpleDateFormat("MM/dd/yyyy")
        val output: String = dateFormat.format(currentTime)


        typeTextView = findViewById(R.id.Exercise)
        repsTextView = findViewById(R.id.Reps)
        setsTextView = findViewById(R.id.Sets)
        saveButton = findViewById(R.id.recordExButton)
        backButton = findViewById(R.id.Back)

        backButton.setOnClickListener {
            finish()
        }

        saveButton.setOnClickListener {
            lifecycleScope.launch(Dispatchers.IO){
                (application as HealthBudApplication).db.ExerciseDao().insert(
                ExerciseEntity(
                    id = 0,
                    date = output,
                    typeTextView.text.toString(),
                    repsTextView.text.toString().toInt(),
                    setsTextView.text.toString().toInt()
                )
                )
            }
            finish()
        }
    }
}