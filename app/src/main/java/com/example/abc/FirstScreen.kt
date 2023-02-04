package com.example.abc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)
        var searchflightsbutton = findViewById<Button>(R.id.searchflightsbutton)
        searchflightsbutton.setOnClickListener {
            val intent = Intent(this, ListScreen::class.java)
            startActivity(intent)
        }
    }
}