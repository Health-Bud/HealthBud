package com.example.healthbud

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

const val FOOD_EXTRA = "FOOD_EXTRA"
private const val TAG = "FoodAdapter"

class FoodAdapter(private val context: Context, private val foods: List<DisplayFood>) :
    RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_food, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // TODO: Get the individual food and bind to holder
        val food = foods[position]
        //Log.v("Foods in Adapter: ", foods.toString())
        holder.bind(food)
    }

    override fun getItemCount() = foods.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

        //private val mediaImageView = itemView.findViewById<ImageView>(R.id.mediaImage)
        private val foodTV = itemView.findViewById<TextView>(R.id.Food)
        private val calorieTV = itemView.findViewById<TextView>(R.id.Calories)

        init {
            itemView.setOnClickListener(this)
        }

        // TODO: Write a helper method to help set up the onBindViewHolder method
        fun bind(food: DisplayFood) {
            Log.v("Bind", "BIND")
            foodTV.text = food.food
            calorieTV.text = food.calorie.toString()
        }

        override fun onClick(v: View?) {
            /*
            // TODO: Get selected article
            val article = foods[absoluteAdapterPosition]

            // TODO: Navigate to Details screen and pass selected article
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(ARTICLE_EXTRA, article)
            context.startActivity(intent)*/
        }
    }
}