package com.example.abc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class BookingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_screen)

        var departuretime: TextView =  findViewById<TextView>(R.id.Tv1)
        var airportto: TextView = findViewById<TextView>(R.id.Tv2)
        var airportfrom: TextView = findViewById<TextView>(R.id.Tv3)
        var airlinename: TextView =findViewById<TextView>(R.id.Tv4)
        var price: TextView = findViewById<TextView>(R.id.Tv5)
        var arrivaltime: TextView = findViewById<TextView>(R.id.Tv6)

        val intent = intent
        departuretime.setText(intent.getStringExtra("departuretime"));
        airportto.setText(intent.getStringExtra("airportto"));
        airportfrom.setText(intent.getStringExtra("airportfrom"));
        airlinename.setText(intent.getStringExtra("airlinename"));
        price.setText(intent.getStringExtra("price"));
        arrivaltime.setText(intent.getStringExtra("arrivaltime"));

        var bookflightbutton = findViewById<Button>(R.id.bookflightbutton)
        bookflightbutton.setOnClickListener {
            val intent = Intent(this, ListScreen::class.java)
            startActivity(intent)
        }
    }
}