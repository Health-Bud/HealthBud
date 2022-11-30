package com.example.healthbud

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class FoodDetailActivity : AppCompatActivity() {
    private var foods = mutableListOf<DisplayFood>()
    private lateinit var foodRV: RecyclerView
    private lateinit var backButton: Button
    inline fun <reified T> Gson.fromJson(json: String) = fromJson<Collection<DisplayFood>>(json, object: TypeToken<Collection<DisplayFood>>() {}.type)

    @SuppressLint("SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_food)

        backButton = findViewById<Button>(R.id.button)

        var json = intent.getStringExtra("Bundle")
        val foodArray = Gson().fromJson<Collection<DisplayFood>>(json!!)
        foods.addAll(foodArray)

        // Find the views for the screen
        val layoutManager = LinearLayoutManager(this)
        foodRV = findViewById(R.id.foodRecyclerView)
        foodRV.layoutManager = layoutManager
        foodRV.setHasFixedSize(true)
        val foodAdapter = FoodAdapter(this, foods)
        foodRV.adapter = foodAdapter
        foodAdapter.notifyDataSetChanged()


        backButton.setOnClickListener {
            finish()
        }
    }
}
