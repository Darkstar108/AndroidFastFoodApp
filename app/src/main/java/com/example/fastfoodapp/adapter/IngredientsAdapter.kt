package com.example.fastfoodapp.adapter

import ProjectWithDesignPatterns.*
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.fastfoodapp.R
import com.example.fastfoodapp.activities.SplashScreenActivity
import com.squareup.picasso.Picasso

class IngredientsAdapter(private var ingredients: Array<Ingredient>) : RecyclerView.Adapter<IngredientsAdapter.ViewHolder>() {

    // he will take care of cache ..
    inner  class ViewHolder( itemView : View): RecyclerView.ViewHolder(itemView) {
        // 11cf  inflated memory

        val ingredientName: TextView = itemView.findViewById(R.id.ingredient_name)
        val ingredientPrice: TextView = itemView.findViewById(R.id.ingredient_price)
        val ingredientQuantity: TextView = itemView.findViewById(R.id.ingredient_quantity)
        val ingredientImage: ImageView = itemView.findViewById(R.id.ingredient_image)



        init {

            itemView.setOnClickListener { v: View ->
                val position: Int = adapterPosition
                Toast.makeText(
                    itemView.context, "You clicked on position ${position + 1}",
                    Toast.LENGTH_SHORT
                ).show()
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
        val v = LayoutInflater.from( parent.context  ).inflate(R.layout.ingredient_item,parent,false)
        return ViewHolder( v )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            ingredientName.text = ingredients[position].name
            ingredientPrice.text = ingredients[position].cost.toString()
            ingredientQuantity.text = "1"
            Picasso.with(itemView.context).load(ingredients[position].image).into(ingredientImage)
        }
    }

    override fun getItemCount(): Int {
        return ingredients.size
    }
}