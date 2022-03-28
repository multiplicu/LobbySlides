package com.multiplicu.lobbyslides

import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import androidx.fragment.app.FragmentActivity

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Keep the screen on so the screen saver doesn't start
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        // Load the webpage
        val webView: WebView = findViewById(R.id.webview)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.loadUrl("https://multiplicu.com/lobby-slides")
    }
}