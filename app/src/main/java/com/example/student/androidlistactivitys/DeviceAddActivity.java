package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeviceAddActivity extends AppCompatActivity {

    Button btnphone, btncomputers, btnComputerd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_add);
        btnphone = findViewById(R.id.btnPhones);
        btncomputers = findViewById(R.id.btnComputers);

        final Intent intentphone = new Intent(this, PhoneAdd.class);

        btnphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentphone);
            }
        });

        btncomputers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
