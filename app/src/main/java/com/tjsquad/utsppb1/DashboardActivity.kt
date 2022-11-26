package com.tjsquad.utsppb1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {
    companion object {
        const val Login = "login"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        supportActionBar?.hide()
        var session = findViewById<TextView>(R.id.txtsessions1)
        val txtsession = intent.getStringExtra(Login)
        session.text = txtsession

        var apa = findViewById<Button>(R.id.btnApa)
        apa.setOnClickListener(){
            val apa = Intent(this@DashboardActivity, Web1Activity::class.java)
            startActivity(apa)
        }
        var jenis = findViewById<Button>(R.id.btnJenis)
        jenis.setOnClickListener(){
            val jenis = Intent(this@DashboardActivity, Web2Activity::class.java)
            startActivity(jenis)
        }
        var unit = findViewById<Button>(R.id.btnUnit)
        unit.setOnClickListener(){
            val unit = Intent(this@DashboardActivity, RecyclerActivity::class.java)
            startActivity(unit)
        }
    }
}