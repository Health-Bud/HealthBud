package com.example.healthbud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragmentManager: FragmentManager = supportFragmentManager

        // define fragments here
        val DashboardFragment: Fragment = DashboardFragment()
        val LogFragment: Fragment = LogFragment()
        val CalendarFragment: Fragment = CalendarFragment()

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // handle navigation selection
        bottomNavigationView.setOnItemSelectedListener { item ->
            lateinit var fragment: Fragment
            when (item.itemId) {
                R.id.nav_dashboard -> fragment = DashboardFragment
                R.id.nav_log -> fragment = LogFragment
                R.id.nav_calendar -> fragment = CalendarFragment
            }
            replaceFragment(fragment)
            true
        }
        // Set default selection
        bottomNavigationView.selectedItemId = R.id.nav_dashboard
    }

    private fun replaceFragment(xFragment: Fragment) {
        print("Replace Fragment")
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.list_frame_layout, xFragment)
        fragmentTransaction.commit()
    }
}