package com.tjsquad.utsppb1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {
    private lateinit var rvUnits : RecyclerView
    private var list: ArrayList<Unit> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        supportActionBar?.hide()

        rvUnits = findViewById(R.id.rv_units)
        rvUnits.setHasFixedSize(true)
        list.addAll(UnitData.listData)
        showdata()
    }
    private fun showdata(){
        rvUnits.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListUnitAdapter(list)
        rvUnits.adapter = listHeroAdapter
    }
}