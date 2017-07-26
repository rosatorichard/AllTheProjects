package com.batchmates.android.multiplebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        web=(WebView)findViewById(R.id.wvWeb);

        web.setWebViewClient(new WebViewClient());
        web.loadUrl("http://www.mmo-champion.com/content/");
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
