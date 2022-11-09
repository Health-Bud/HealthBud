package com.example.healthbud

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.CalendarView.OnDateChangeListener
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

private const val TAG = "CalendarFragment"

class CalendarFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v("Oncreate","Oncreated")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_calendar, container, false)
        val calendarView = view.findViewById<CalendarView>(R.id.calendarView)
        val foods = mutableListOf<DisplayFood>()

        calendarView.setOnDateChangeListener { calendarView, year, month, day ->
            Log.v("Day:",day.toString())
            var dayString = day.toString()
            //Add 0 in front of string for database query
            if (day < 10) {
                dayString = "0" + dayString
            }
            lifecycleScope.launch {
                (requireActivity().application as HealthBudApplication).db.FoodDao().getByDate((month+1).toString()+"/"+dayString+"/"+year).collect { databaseList ->
                    databaseList.map { entity ->
                        DisplayFood(
                            entity.date,
                            entity.food,
                            entity.calorie,
                            entity.carb,
                            entity.protein,
                            entity.fat
                        )
                    }.also { mappedList ->
                        foods.clear()
                        foods.addAll(mappedList)
                        //Log.v("foods length", foods.size.toString())
                        for (food in foods) {
                            Log.v("Food: ", food.food + "");
                        }
                    }
                }
            }
        }
        // Inflate the layout for this fragment
        return view //inflater.inflate(R.layout.fragment_calendar, container, false)
    }

    companion object {
        fun newInstance(): CalendarFragment {
            return CalendarFragment()
        }
    }
}