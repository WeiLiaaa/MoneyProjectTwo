package com.liwei.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.liwei.moneyprojecttwo.R;

/**
 * Created by wu  suo  wei on 2017/3/16.
 */

public class BannerWebViewActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bannerwebviewactivity);
        Intent intent = getIntent();
        String url = (String) intent.getExtras().get("webViewURL");
        WebView webView= (WebView) findViewById(R.id.bannerwebviewactivity_web);
        //js交互
        webView.loadUrl(url);
    }
}
