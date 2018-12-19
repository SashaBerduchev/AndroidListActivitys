package com.example.student.androidlistactivitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Request;
import okhttp3.Response;
import okio.GzipSource;

public class RequaestActivity extends AppCompatActivity {

    TextView urltext, textanswer;;
    Button btnset;
    okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();

    void execute (String url) throws IOException{
        Request request = new Request.Builder().url(url).build();

        Response response = client.newCall(request).execute();

        //Log.d("OKHTTP", response.body().string());

        Gson gson = new Gson();
        MyPojo myPojo = gson.fromJson(response.body().string(), MyPojo.class);

        myPojo.getOrigin();

        textanswer.setText(myPojo.getOrigin()+ " " + myPojo.getHeaders()+" "+ myPojo.getUrl());


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requaest);

        urltext = findViewById(R.id.editTextUrl);
        btnset = findViewById(R.id.btnSet);
        textanswer = findViewById(R.id.textAnswer);

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
