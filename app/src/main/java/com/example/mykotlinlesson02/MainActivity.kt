package com.example.mykotlinlesson02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cell_main.view.*
import java.text.SimpleDateFormat
import java.util.*

data class Item(val title: String, val description: String)

class MainActivity : AppCompatActivity(), CustomAdapter.ItemSelectionListener {
    private val items = mutableListOf<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ダミーデータ作成
        for (index in 1..20) {
            items.add(
                Item(
                    "${resources.getString(R.string.cell_title)}$index",
                    "${resources.getString(R.string.cell_description)}$index"
                )
            )
        }

        val view = findViewById<RecyclerView>(R.id.recycleView)
        with(view) {
            layoutManager = LinearLayoutManager(context)
            adapter = CustomAdapter(items, this@MainActivity)
        }
    }

    // アイテムが選択されたときの動作
    override fun notifyItemSelected(item: Item) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("title", item.title)
        intent.putExtra("title", item.description)
        startActivity(intent)
    }
}


