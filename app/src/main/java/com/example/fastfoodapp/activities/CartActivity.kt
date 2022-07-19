package com.example.fastfoodapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.fastfoodapp.R

class CartActivity : AppCompatActivity() {

    var backBtn:Button? = null
    var cartItemRecyclerView:RecyclerView? = null
    var checkoutBtn:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        backBtn = findViewById<Button>(R.id.backBtn)
        cartItemRecyclerView = findViewById<RecyclerView>(R.id.cartItemsList)
        checkoutBtn = findViewById<Button>(R.id.checkoutBtn)
    }
}