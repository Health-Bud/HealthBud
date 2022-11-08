package com.example.healthbud

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class MedicineLogActivity : AppCompatActivity() {
    private lateinit var medicineTextView: TextView
    private lateinit var doseTextView: TextView
    private lateinit var notesTextView: TextView
    private lateinit var saveButton: Button
    private lateinit var backButton: Button
    private lateinit var currentTime: Date


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicine_log)

        currentTime = Calendar.getInstance().time
        val dateFormat = SimpleDateFormat("MM/dd/yyyy")
        val output: String = dateFormat.format(currentTime)

        // Find the views for the screen
        medicineTextView = findViewById(R.id.inputMedicine)
        doseTextView = findViewById(R.id.inputDose)
        saveButton = findViewById(R.id.recordMedicineEntry)
        backButton = findViewById(R.id.medicineBackButton)
        notesTextView = findViewById(R.id.inputNotes)

        backButton.setOnClickListener {
            finish()
        }

        saveButton.setOnClickListener {
            lifecycleScope.launch(Dispatchers.IO) {
                (application as HealthBudApplication).db.MedicineDao().insert(
                    MedicineEntity (
                        id = 0,
                        date = output,
                        medicineTextView.text.toString(),
                        doseTextView.text.toString(),
                        notesTextView.text.toString()
                    )
                )
            }
            finish()
        }
    }
}