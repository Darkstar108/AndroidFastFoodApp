package com.example.fastfoodapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fastfoodapp.*
import com.example.fastfoodapp.adapter.IngredientsAdapter
import com.example.fastfoodapp.adapter.ProductAdapter

class IngredientActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingredient)

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView2) as RecyclerView

        val ingredientMap: Map<String,Array<Ingredient>> = mutableMapOf("Burger" to arrayOf(Cheese(),
            Tomato(), Lettuce(),Chicken())
            ,"Pizza" to arrayOf(Cheese(), Tomato(),Lettuce(),Chicken())
        )



        recyclerView.layoutManager = LinearLayoutManager(this);//,LinearLayout.VERTICAL,false)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

//        val bundle = intent.extras
//        bundle!!.getString("product")?.let { Log.d("test", it) }
//        val product:String = bundle!!.getString("product").toString()
//        recyclerView.adapter = ingredientMap.get(bundle!!.getString("product"))?.let { IngredientsAdapter(it) }
        recyclerView.adapter = IngredientsAdapter(ingredientMap.get("Burger")!!)
        recyclerView.setHasFixedSize(true)
    }
}