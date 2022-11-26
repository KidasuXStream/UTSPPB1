package com.tjsquad.utsppb1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Web1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web1)
        val web1: WebView =findViewById(R.id.webView1)
        supportActionBar?.hide()

        web1.settings.javaScriptEnabled=true
        web1.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url : String
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web1.loadUrl("https://vipairsoft.net/info/what-is-airsoft/")
    }
}