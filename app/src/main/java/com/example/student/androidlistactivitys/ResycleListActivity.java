package com.example.student.androidlistactivitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ResycleListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TextView textname, textsername, textage, textheight, textweight;
    private Button btnhuman;
    public RecyclerView.Adapter recycleViewAdapter;
    private ArrayList<Humen> list = new ArrayList<>();
    private RecyclerView.LayoutManager layoutManager;
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

        btnhuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = textname.getText().toString();
                String sername =  textsername.getText().toString();
                Integer age =Integer.parseInt(textage.getText().toString());
                Integer heigt = Integer.parseInt(textheight.getText().toString());
                Integer weight = Integer.parseInt(textweight.getText().toString());
                list.add(new Humen(name, sername, age, heigt, weight));

                recycleViewAdapter = new RecyclerViewAdapter(list);
                recyclerView.setAdapter(recycleViewAdapter);



            }
        });





    }
}
