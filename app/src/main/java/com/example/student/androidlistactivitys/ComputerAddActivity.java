package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import DataBaseHelpers.CompDB;

public class ComputerAddActivity extends AppCompatActivity {

    private TextView name, model, procc, ram, hdd, graphics, power, cost;
    private Button btnSet;
    private CompDB compDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_adds);
        btnSet = findViewById(R.id.btnCompSet);
        name = findViewById(R.id.compName);
        model = findViewById(R.id.compModel);
        procc = findViewById(R.id.compProcessor);
        ram = findViewById(R.id.compRam);
        hdd = findViewById(R.id.compHDD);
        graphics = findViewById(R.id.compGraphics);
        power = findViewById(R.id.compPower);
        cost = findViewById(R.id.compCost);
        final Intent compintent = new Intent(this, ComputerActivity.class);
        compDB = new CompDB(this);
        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compDB.addData(name.getText().toString(), model.getText().toString(), procc.getText().toString(), ram.getText().toString(), hdd.getText().toString(), graphics.getText().toString(), power.getText().toString(), cost.getText().toString());
                startActivity(compintent);
            }
        });
    }
}
