package com.example.fastfoodapp.adapter

import ProjectWithDesignPatterns.Ingredient
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.fastfoodapp.R
import com.example.fastfoodapp.activities.SplashScreenActivity

class IngredientsAdapter(private var ingredients: Array<Ingredient>) : RecyclerView.Adapter<IngredientsAdapter.ViewHolder>() {

    // he will take care of cache ..
    inner  class ViewHolder( itemView : View): RecyclerView.ViewHolder(itemView) {
        // 11cf  inflated memory

        val pName: TextView = itemView.findViewById(R.id.prodName)
        val pPrice: TextView = itemView.findViewById(R.id.prodPrice)
        val pDescription: TextView = itemView.findViewById(R.id.prodDescription)
        val pImage: ImageView = itemView.findViewById(R.id.prodImage)

        init {

            itemView.setOnClickListener { v: View ->
//                val position: Int = adapterPosition
//                Toast.makeText(
//                    itemView.context, "You clicked on ${pName.toString()} position ${position + 1}",
//                    Toast.LENGTH_SHORT
//                ).show()
//                var b: Bundle = Bundle();
//                b.putString("product", pName.toString())
//
//                val productIntent = Intent(itemView.context, SplashScreenActivity::class.java)
//                productIntent.putExtras(b)
//                itemView.context.startActivity(productIntent)

                //intent to move to ingredients page
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}