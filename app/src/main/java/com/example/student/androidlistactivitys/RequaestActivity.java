package com.example.student.androidlistactivitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.Request;
import okhttp3.Response;

public class RequaestActivity extends AppCompatActivity {

    TextView urltext;
    Button btnset;
    okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();

    void execute (String url) throws IOException{
        Request request = new Request.Builder().url(url).build();

        Response response = client.newCall(request).execute();

        Log.d("OKHTTP", response.body().string());




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requaest);

        urltext = findViewById(R.id.editTextUrl);
        btnset = findViewById(R.id.btnSet);

        btnset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            execute(urltext.getText().toString());
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                })
                .start();

            }
        });


    }
}
