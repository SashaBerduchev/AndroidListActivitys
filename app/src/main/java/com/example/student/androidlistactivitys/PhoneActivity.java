package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import DataBaseHelpers.PhoneDB;

public class PhoneActivity extends AppCompatActivity {

    ListView listphone;
    Button btnSetPhone;
    PhoneDB phoneDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        listphone = findViewById(R.id.listPhone);
        btnSetPhone = findViewById(R.id.btnSetPhone);
        phoneDB = new PhoneDB(this);
        getData();
        final Intent intent = new Intent(this, PhoneAdd.class);
        btnSetPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }

    private void getData() {
        Cursor cursor = phoneDB.fetchData();
        ListAdapter myAdapter = new SimpleCursorAdapter(this, R.layout.phone_layout,
                cursor,
                new String[]{phoneDB.COLUMN_1, phoneDB.COLUMN_2, phoneDB.COLUMN_3, phoneDB.COLUMN_4, phoneDB.COLUMN_4, phoneDB.COLUMN_5, phoneDB.COLUMN_6, phoneDB.COLUMN_6, phoneDB.COLUMN_7},
                new int[]{R.id.name,R.id.model,R.id.procc, R.id.ram, R.id.graph, R.id.batter, R.id.cost},0);
        listphone.setAdapter(myAdapter);
    }
}
