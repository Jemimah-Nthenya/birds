package com.example.myapplication2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_fifth_bird : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fifth_bird)
        val imageview15 = findViewById(R.id.imageView15)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)

        imageview15.setOnClickListener {
            finish()
        }

        imageView4.setOnClickListener{
            val intent = intent(this, imageview15::class.java)
            startActivity(intent)
        }
    }
}