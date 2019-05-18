package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import DataBaseHelpers.PhoneDB;

public class PhoneAdd extends AppCompatActivity {

    TextView textname, textmodel, textprocessor, textram, textgraficscore, textbatterry, textcost;
    Button btnset;

    PhoneDB phoneDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_add);
        phoneDB = new PhoneDB(this);
        textname = findViewById(R.id.TextName);
        textmodel = findViewById(R.id.TextModel);
        textprocessor = findViewById(R.id.TextProcessor);
        textram = findViewById(R.id.TextRam);
        textgraficscore = findViewById(R.id.TextGraphicscore);
        textbatterry = findViewById(R.id.TextBattery);
        textcost = findViewById(R.id.TextCost);
        btnset = findViewById(R.id.btnSet);

        final Intent intentphone = new Intent(this, PhoneActivity.class);

        btnset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneDB.addData(textname.getText().toString(), textmodel.getText().toString(), textprocessor.getText().toString(), textram.getText().toString(), textgraficscore.getText().toString(), textbatterry.getText().toString(), textcost.getText().toString());
                startActivity(intentphone);
            }
        });

    }
}
