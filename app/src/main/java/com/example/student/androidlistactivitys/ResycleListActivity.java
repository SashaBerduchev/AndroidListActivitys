package com.example.student.androidlistactivitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.TextView;

public class ResycleListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TextView textname, textsername, textage, textheight, textweight;
    private Button btnhuman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resycle_list);

        recyclerView = findViewById(R.id.recyclerView);
        textname = findViewById(R.id.TextName);
        textsername = findViewById(R.id.TextSername);
        textage = findViewById(R.id.TextAge);
        textheight = findViewById(R.id.TextHeight);
        textweight = findViewById(R.id.TextWeight);
        btnhuman = findViewById(R.id.btnHuman);



    }
}
