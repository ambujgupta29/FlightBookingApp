package com.example.abc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstButton = findViewById<Button>(R.id.SignIn)
        firstButton.setOnClickListener {
            val intent = Intent(this, FirstScreen::class.java)
            startActivity(intent)
        }
    }
    }