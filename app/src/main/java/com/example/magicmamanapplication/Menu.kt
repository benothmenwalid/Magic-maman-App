package com.example.magicmamanapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.magicmamanapplication.Adapter.HorizantalRcyclerViewMenuAdapter

class Menu : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: HorizantalRcyclerViewMenuAdapter
    private lateinit var menuArrayList: ArrayList<MenuItem>
    lateinit var imgressource1 : Array<Int>
    lateinit var imgressource2 : Array<Int>


    private lateinit var menuRcView : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        imgressource1 = arrayOf(
            R.drawable.image_nouriture,
            R.drawable.image_sommeil,
            R.drawable.image_croissance,
            R.drawable.image_sante,
            R.drawable.image_guides,
        )

        imgressource2 = arrayOf(
            R.drawable.btn_nouriture,
            R.drawable.btn_sommeil,
            R.drawable.btn_croissance,
            R.drawable.btn_sante,
            R.drawable.btn_guide,
        )



        recyclerView = findViewById(R.id.menuRcView)
        menuArrayList = arrayListOf<MenuItem>()
        adapter = HorizantalRcyclerViewMenuAdapter(menuArrayList)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter


    }
}