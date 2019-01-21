package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class WebActivity extends AppCompatActivity {

    TextView urlstring2, itertext;
    WebView webView2, webView3, webView4, webView5;
    Button btnwebset;
    Animation  animation, listanim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        urlstring2 = findViewById(R.id.urlString2);

        itertext = findViewById(R.id.iterText);

        webView2 = findViewById(R.id.webView2);
        webView3 = findViewById(R.id.webView3);
        webView4 = findViewById(R.id.webView4);
        webView5 = findViewById(R.id.webView5);
        btnwebset = findViewById(R.id.btnWebSet);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),  R.anim.anim_scale);
        listanim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_listview);

        webView2.startAnimation(animation);
        webView3.startAnimation(animation);
        webView4.startAnimation(animation);
        webView5.startAnimation(animation);
        itertext.startAnimation(animation);
        urlstring2.startAnimation(animation);


        btnwebset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView2.startAnimation(listanim);
                webView3.startAnimation(listanim);
                webView4.startAnimation(listanim);
                webView5.startAnimation(listanim);

                webView2.getSettings().setJavaScriptEnabled(true);
                webView2.loadUrl(urlstring2.getText().toString());

                webView3.getSettings().setJavaScriptEnabled(true);
                webView3.loadUrl(urlstring2.getText().toString());
                webView4.getSettings().setJavaScriptEnabled(true);
                webView4.loadUrl(urlstring2.getText().toString());

                webView5.getSettings().setJavaScriptEnabled(true);
                webView5.loadUrl(urlstring2.getText().toString());
                
            }
        });
    }
}
