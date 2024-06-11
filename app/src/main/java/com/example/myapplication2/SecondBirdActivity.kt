package com.example.myapplication2

import android.app.Activity
import android.content.Intent
import android.os.Binder
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.MainActivity

class SecondBirdActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBirdActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=
        setContentView(binding.root)
        binding= SecondBirdActivity.inflate(layoutInflater)
        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val imageView4= findViewById<ImageView>(R.id.imageView4)

        imageView5.setOnClickListener {
            finish()
            binding.
        }

        imageView4.setOnClickListener{
            val intent = Intent(this,ThirdBirdActivity::class.java)
            startActivity(intent)
        }

    }
}