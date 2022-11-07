package com.example.healthbud

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MedicineLogActivity : AppCompatActivity() {
    private lateinit var medicineTextView: TextView
    private lateinit var doseTextView: TextView
    private lateinit var saveButton: Button
    private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicine_log)

        // Find the views for the screen
        medicineTextView = findViewById(R.id.inputMedicine)
        doseTextView = findViewById(R.id.inputDose)
        saveButton = findViewById(R.id.recordMedicineEntry)
        backButton = findViewById(R.id.medicineBackButton)

        backButton.setOnClickListener {
            finish()
        }
    }
}