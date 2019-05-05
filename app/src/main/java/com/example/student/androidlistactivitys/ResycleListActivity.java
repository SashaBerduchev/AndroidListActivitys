package com.example.student.androidlistactivitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ResycleListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TextView textname, textsername, textage, textheight, textweight;
    private Button btnhuman;
    private RecyclerView.Adapter recycleViewAdapter;
    private  RecyclerView.LayoutManager layoutManager;
    private ArrayList<Humen> list = new ArrayList<>();
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
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        btnhuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = textname.getText().toString();
                String sername =  textsername.getText().toString();
                String age = String.valueOf(textage.getText());
                String heigt = String.valueOf(textheight.getText());
                String weight = String.valueOf(textweight.getText());
                list.add(new Humen(name, sername, age, heigt, weight));

                recycleViewAdapter = new RecyclerViewAdapter(list);
                recyclerView.setAdapter(recycleViewAdapter);



            }
        });





    }
}
