package com.example.fastfoodapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.fastfoodapp.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val splashScreenActivity = this

        object:CountDownTimer(3000, 1000) {
            override fun onTick(p0: Long) {
            }

            override fun onFinish() {
                val productIntent = Intent(baseContext, ProductActivity::class.java)

                splashScreenActivity.startActivity(productIntent)
                splashScreenActivity.finish()
            }
        }.start()
    }
}