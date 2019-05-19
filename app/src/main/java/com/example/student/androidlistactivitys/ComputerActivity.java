package com.example.student.androidlistactivitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class ComputerActivity extends AppCompatActivity {

    private ListView compList;
    private Button btnSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        compList = findViewById(R.id.complistView);
        btnSet = findViewById(R.id.btnCompSet);
    }
}
