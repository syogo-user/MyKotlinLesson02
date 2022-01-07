package com.example.mykotlinlesson02

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

data class Item(val title: String, val description: String, val date:String)

class MainActivity : AppCompatActivity(), CustomAdapter.ItemSelectListener {
    private val items = mutableListOf<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mai
    }
}