package com.example.abc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class ListScreen : AppCompatActivity() {
    private val FlightList = ArrayList<FlightModel>()
    private lateinit var FlightListAdapter: FlightListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_screen)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        FlightListAdapter = FlightListAdapter(FlightList)
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = FlightListAdapter
        prepareMovieData()
    }
    private fun prepareMovieData() {
        FlightList.add(FlightModel("18:30","21:30","LKO","BLR","Indigo",32.20))
        FlightList.add(FlightModel("18:30","21:30","LKO","BLR","Indigo",32.20))
        FlightList.add(FlightModel("18:30","21:30","LKO","BLR","Indigo",32.20))
    }
    }
