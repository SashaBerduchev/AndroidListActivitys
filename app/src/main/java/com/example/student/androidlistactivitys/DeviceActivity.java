package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.telecom.PhoneAccount;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import Device.Phones;

public class DeviceActivity extends AppCompatActivity {

    Button btnadd;
    RecyclerView recycleViewDevice;

    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    static final String keyName = "keyName";
    static final String keyModel = "keyModel";
    static final String keyProcessor = "keyProcessor";
    static final String keyRam = "keyRam";
    static final String keyGraficscore = "keyGraficscore";
    static final Integer keyBattery = 10;
    static final Integer keyCost = 20;

    ArrayList<Phones> phonesArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);

        btnadd = findViewById(R.id.btnAddAction);
        recycleViewDevice = findViewById(R.id.recycleViewDevice);
        phonesArrayList = new ArrayList<>();


        final Intent addintent = new Intent(this, DeviceAddActivity.class);
        final Intent intent = getIntent();

        String name= intent.getStringExtra(keyName);
        String model= intent.getStringExtra(keyModel);
        String processor= intent.getStringExtra(keyProcessor);
        String ram= intent.getStringExtra(keyRam);
        String graphics = intent.getStringExtra(keyGraficscore);
        Integer battery= intent.getIntExtra("10", keyBattery);
        Integer cost= intent.getIntExtra("20", keyCost);

        phonesArrayList.add(new Phones(name, model, processor, ram, graphics, battery, cost));

        layoutManager = new LinearLayoutManager(this);
        recycleViewDevice.setLayoutManager(layoutManager);
        recycleViewDevice.setAdapter(adapter);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(addintent);
            }
        });
    }
}
