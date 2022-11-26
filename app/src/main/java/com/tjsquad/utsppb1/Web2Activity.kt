package com.tjsquad.utsppb1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Web2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web2)
        val web2: WebView =findViewById(R.id.webView2)
        supportActionBar?.hide()

        web2.settings.javaScriptEnabled=true
        web2.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url : String
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web2.loadUrl("https://highspeedbbs.com/all-about-airsoft-guns-types-styles-facts-science/")
    }

}