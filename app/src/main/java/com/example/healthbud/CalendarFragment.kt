package com.example.healthbud

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.Toast

private const val TAG = "CalendarFragment"

class CalendarFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_calendar, container, false)
        val calendarView = view.findViewById<CalendarView>(R.id.calendarView)

        calendarView.setOnDateChangeListener { calendarView, year, month, day ->
            Toast.makeText(context, year.toString() + (month+1).toString() + day.toString(), Toast.LENGTH_SHORT).show()
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calendar, container, false)
    }

    companion object {
        fun newInstance(): CalendarFragment {
            return CalendarFragment()
        }
    }
}