package com.tjsquad.utsppb1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()
        var login = findViewById<Button>(R.id.btnLogin1)
        var username = findViewById<TextInputEditText>(R.id.txtuname)
        var pass = findViewById<TextInputEditText>(R.id.txtpass)
        var usname = findViewById<TextView>(R.id.txtuname1)
        login.setOnClickListener{
            var unamekey = username.getText().toString()
            var passkey = pass.getText().toString()
            if (unamekey.length == 0){
                Snackbar.make(it,"Username tidak boleh kosong!", Snackbar.LENGTH_LONG).show()
            }
            if (passkey.length == 0){
                Snackbar.make(it,"Password tidak boleh kosong!", Snackbar.LENGTH_LONG).show()
            }
            if (unamekey.length == 0 && passkey.length == 0){
                Snackbar.make(it,"Username dan Password tidak boleh kosong!", Snackbar.LENGTH_LONG).show()
            }
            else {
                if (unamekey.equals("admin") && passkey.equals("admin")){
                    var dashboard = Intent(this@LoginActivity, DashboardActivity::class.java)
                    val uname2: String = username.getText().toString()
                    usname.setText(uname2)
                    dashboard.putExtra(DashboardActivity.Login,usname.text)
                    Snackbar.make(it,"Selamat Datang", Snackbar.LENGTH_LONG).show()
                    startActivity(dashboard)
                }
                else{
                    Snackbar.make(it,"Username atau Password salah!", Snackbar.LENGTH_LONG).show()
                }

            }
        }
    }
}