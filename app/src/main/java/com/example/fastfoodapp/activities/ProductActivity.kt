package com.example.fastfoodapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fastfoodapp.*
import com.example.fastfoodapp.adapter.ProductAdapter

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView1) as RecyclerView
        val pizzaBuilder = PizzaBuilder()
        val burgerBuilder = BurgerBuilder()
//        val products = arrayOf<MenuItem>(
//            Pizza("Pizza",500,"Pizza Desc","https://pngimg.com/uploads/pizza/pizza_PNG43991.png"),
//        Burger("Burger",100,"Burger Desc","https://pngimg.com/uploads/burger_sandwich/burger_sandwich_PNG4135.png"),
//            Burger("Burger",100,"Burger Desc","https://pngimg.com/uploads/burger_sandwich/burger_sandwich_PNG4135.png"))
        val products = arrayOf<MenuItem>(
            pizzaBuilder.createPizza("Pizza",500,"Pizza Desc","https://pngimg.com/uploads/pizza/pizza_PNG43991.png"),
            burgerBuilder.createBurger("Burger1",100,"Burger Desc","https://pngimg.com/uploads/burger_sandwich/burger_sandwich_PNG4135.png"),
            burgerBuilder.createBurger("Burger2",100,"Burger Desc","https://pngimg.com/uploads/burger_sandwich/burger_sandwich_PNG4135.png")
        )

        recyclerView.layoutManager = LinearLayoutManager(this);//,LinearLayout.VERTICAL,false)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        recyclerView.adapter = ProductAdapter(products)
        recyclerView.setHasFixedSize(true)

    }
}