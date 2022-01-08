package com.example.mykotlinlesson02

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra("title")
        val description = intent.getStringExtra("description")

        val detailTitle = findViewById<TextView>(R.id.detailTitle)
        detailTitle.text = title

        val detailDescription = findViewById<TextView>(R.id.detailDescription)
        detailDescription.text = description

        val closeButton = findViewById<Button>(R.id.closeButton)
        closeButton.setOnClickListener {
            finish()
        }
    }
}