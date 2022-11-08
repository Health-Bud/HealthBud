package com.example.healthbud

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

private const val TAG = "LogFragment"

class LogFragment : Fragment() {
    private lateinit var exerciseLogButton: Button
    private lateinit var medicineLogButton: Button
    private lateinit var foodLogButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        print("IN LOG FRAGMENT")
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_log, container, false)
        exerciseLogButton = view.findViewById(R.id.exerciseLogButton)
        medicineLogButton = view.findViewById(R.id.medicineLogButton)
        foodLogButton = view.findViewById(R.id.foodLogButton)


        exerciseLogButton.setOnClickListener {
            val intent = Intent(view?.context, Exercise::class.java)
            view?.context?.startActivity(intent)
        }


        medicineLogButton.setOnClickListener {
            val intent = Intent(view?.context, MedicineLogActivity::class.java)
            view?.context?.startActivity(intent)
        }

        foodLogButton.setOnClickListener {
            val intent = Intent(view?.context, FoodLogActivity::class.java)
            view?.context?.startActivity(intent)
        }

        return view
    }

    companion object {
        fun newInstance(): LogFragment {
            return LogFragment()
        }
    }
}