package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ListView listdat;
    EditText editfirstTezt;
    EditText editlastText;
    Button btnSetData;

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

        final Intent intent = new Intent(this, MainActivity.class);

        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_listview);

        editfirstTezt.startAnimation(animation);
        editlastText.startAnimation(animation);
        btnSetData.startAnimation(animation);

        btnSetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRequest = new Intent();
                intentRequest.putExtra(keyName, String.valueOf(editfirstTezt.getText()));
                intentRequest.putExtra(keySename, String.valueOf(editlastText.getText()));
                setResult(RESULT_OK, intentRequest);

                finish();
            }
        });


    }
}
