package com.example.student.androidlistactivitys;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import DataBaseHelpers.ResyclerDBHelper;

public class ResycleListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TextView textname, textsername, textage, textheight, textweight;
    private Button btnhuman;
    private ResyclerDBHelper resyclerDBHelper;
    private RecyclerView.Adapter recycleViewAdapter;
    private  RecyclerView.LayoutManager layoutManager;
    private ArrayList<Humen> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resycle_list);
        resyclerDBHelper = new ResyclerDBHelper(this);

        recyclerView = findViewById(R.id.recyclerView);
        textname = findViewById(R.id.TextName);
        textsername = findViewById(R.id.TextSername);
        textage = findViewById(R.id.TextAge);
        textheight = findViewById(R.id.TextHeight);
        textweight = findViewById(R.id.TextWeight);
        btnhuman = findViewById(R.id.btnHuman);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        list.add(new Humen(resyclerDBHelper.COLUMN_1, resyclerDBHelper.COLUMN_2, resyclerDBHelper.COLUMN_3, resyclerDBHelper.COLUMN_4, resyclerDBHelper.COLUMN_5));

        recycleViewAdapter = new RecyclerViewAdapter(list);
        recyclerView.setAdapter(recycleViewAdapter);
        btnhuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor cursor = resyclerDBHelper.fetchData();
                String name = textname.getText().toString();
                String sername =  textsername.getText().toString();
                String age = String.valueOf(textage.getText());
                String heigt = String.valueOf(textheight.getText());
                String weight = String.valueOf(textweight.getText());
                resyclerDBHelper.addData(name, sername, age, heigt, weight);
                list.add(new Humen(resyclerDBHelper.COLUMN_1, resyclerDBHelper.COLUMN_2, resyclerDBHelper.COLUMN_3, resyclerDBHelper.COLUMN_4, resyclerDBHelper.COLUMN_5));

                recycleViewAdapter = new RecyclerViewAdapter(list);
                recyclerView.setAdapter(recycleViewAdapter);

            }
        });





    }
}
