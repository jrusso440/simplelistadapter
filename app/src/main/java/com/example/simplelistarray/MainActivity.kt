package com.example.simplelistarray


import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "List Example"
        val arrayAdapter: ArrayAdapter<*>
        val list = arrayOf(
            "Coffee",
            "Bagel",
            "Donut",
            "Muffin",
            "Munchkin",
            "Iced Coffee",
            "Cold Brew"
        )
        // access the listView from xml file
        val listView = findViewById<ListView>(R.id.simpleListView)
        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, list
        )
        listView.adapter = arrayAdapter
    }
}