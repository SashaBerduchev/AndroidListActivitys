package com.example.student.androidlistactivitys;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    TextView webStrText, webHtmlText;
    Button btnwebcontent;
    Connection connection;
    WebView webView;
    Animation animation, listanim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        webStrText = findViewById(R.id.webstringText);
        webHtmlText = findViewById(R.id.webHtmlText);
        btnwebcontent = findViewById(R.id.btnWebContent);
        webView = findViewById(R.id.webView);
        animation = AnimationUtils.loadAnimation(getApplicationContext(),  R.anim.anim_scale);
        listanim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_listview);
        btnwebcontent.startAnimation(animation);
        btnwebcontent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.startAnimation(listanim);
                //connection = new Connection(webStrText.getText().toString());

                connection = new Connection(webStrText.getText().toString());
                connection.getConnection();
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(webStrText.getText().toString());


            }
        });
    }
}
