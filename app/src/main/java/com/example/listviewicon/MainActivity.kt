package com.example.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dreamcode.listview.adapter.ListBahasaAdapter
import com.example.listviewicon.model.BahasaPemrograman
import com.example.listviewicon.model.BahasaPemrogramanData

class MainActivity : AppCompatActivity() {
    private lateinit var rvBahasaPemrograman: RecyclerView
    private var list: ArrayList<BahasaPemrograman> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBahasaPemrograman= findViewById(R.id.rv_bahasa)
        rvBahasaPemrograman.setHasFixedSize(true)
        list.addAll(BahasaPemrogramanData.listBahasaPemrograman)
        showBahasaPemrogramanList()
    }

    private fun showBahasaPemrogramanList() {
        rvBahasaPemrograman.layoutManager = LinearLayoutManager(this)
        val listBahasaAdapter = ListBahasaAdapter(list)
        rvBahasaPemrograman.adapter = listBahasaAdapter
    }
}