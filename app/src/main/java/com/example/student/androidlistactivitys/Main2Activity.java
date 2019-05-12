package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import DataBaseHelpers.Main2ActivityDataBase;

public class Main2Activity extends AppCompatActivity {

    Main2ActivityDataBase dataBase;
    ListView listdat;
    EditText editfirstTezt;
    EditText editlastText;
    Button btnSetData, sqlactivity;

    Animation animation;

    static final String keyName = "keyName";
    static final String keySename = "keySename";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editfirstTezt = findViewById(R.id.editfirstText);
        editlastText = findViewById(R.id.editlastText);
        btnSetData = findViewById(R.id.btnSetData);
        listdat = findViewById(R.id.listdat);
        sqlactivity = findViewById(R.id.sqlActivity);
        final Intent intent = new Intent(this, MainActivity.class);

        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_listview);

        editfirstTezt.startAnimation(animation);
        editlastText.startAnimation(animation);
        btnSetData.startAnimation(animation);
        dataBase = new Main2ActivityDataBase(this);
        final Intent intent1 = new Intent(this, SqlightListActivity.class);

        btnSetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = editfirstTezt.getText().toString();
                String s2 = editlastText.getText().toString();
                dataBase.addData(s1, s2);
                Intent intentRequest = new Intent();
                intentRequest.putExtra(keyName, String.valueOf(editfirstTezt.getText()));
                intentRequest.putExtra(keySename, String.valueOf(editlastText.getText()));
                setResult(RESULT_OK, intentRequest);
                finish();
            }
        });

        sqlactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });
    }
}
