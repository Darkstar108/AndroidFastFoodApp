package com.example.fastfoodapp.adapter

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.fastfoodapp.MenuItem
import com.example.fastfoodapp.R
import com.example.fastfoodapp.activities.IngredientActivity
import com.example.fastfoodapp.activities.SplashScreenActivity
import com.squareup.picasso.Picasso

class ProductAdapter(private var products: Array<MenuItem>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    // he will take care of cache ..
    inner  class ViewHolder( itemView : View): RecyclerView.ViewHolder(itemView){
        // 11cf  inflated memory

        val pName : TextView   = itemView.findViewById(R.id.prodName)
        val pPrice: TextView    = itemView.findViewById(R.id.prodPrice)
        val pDescription: TextView    = itemView.findViewById(R.id.prodDescription)
        val pImage : ImageView  = itemView.findViewById(R.id.prodImage)

        init {

            itemView.setOnClickListener {
                v: View ->
                var b: Bundle = Bundle();
                b.putString("product",pName.text.toString())

                val productIntent = Intent(itemView.context, IngredientActivity::class.java)
                productIntent.putExtras(b)
                itemView.context.startActivity(productIntent)

            //intent to move to ingredients page
            }
        }


    }

  // MainActivity ( context ) -> member of mainactivity ViewGroup.context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ViewHolder {
       val v = LayoutInflater.from( parent.context  ).inflate(R.layout.menu_item,parent,false)
      return ViewHolder( v )
    }

    override fun onBindViewHolder(holder: ProductAdapter.ViewHolder, position: Int) {

//         holder.fName.text = title[ position ]
//         holder.fDesc.text = descriptions [ position ]

        holder.apply {
            pName.text = products[position].name
            pDescription.text = products[position].desc
            pPrice.text = "Rs." + products[position].currentPrice.toString()
            Picasso.with(itemView.context).load(products[position].image).into(pImage)
        }


    }

    override fun getItemCount(): Int {
        return products.size
    }

}
