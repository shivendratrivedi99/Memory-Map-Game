package com.singularity.memorymap;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WebView webView=(WebView)findViewById(R.id.webView);
        webView.loadUrl("file:///android_asset/main.html");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.canGoForward();

        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

//        JavaScriptReceiver javaScriptReceiver;
//        javaScriptReceiver = new JavaScriptReceiver(this);
        webView.addJavascriptInterface(new WebAppInterface(this), "JSReceiver");


    }

}
