package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import DataBaseHelpers.NotesDBHelper;

public class NotesActivity extends AppCompatActivity {

    NotesDBHelper dbHelper;
    TextView editTextTitle;
    TextView editTextDescription;
    Button btnSave;
    Animation animation, btnanimation;

    static final String keyTitle = "keyTitle";
    static final String keyDescription = "keyDescription";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        editTextTitle = findViewById(R.id.editTextTitle);
        editTextDescription = findViewById(R.id.editTextDescription);
        btnSave = findViewById(R.id.btnSave);
        dbHelper = new NotesDBHelper(this);
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_listview);
        btnanimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_scale);
        editTextTitle.startAnimation(animation);
        editTextDescription.startAnimation(animation);
        btnSave.startAnimation(btnanimation);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRequest = new Intent();
                intentRequest.putExtra(keyTitle, String.valueOf(editTextTitle.getText()));
                intentRequest.putExtra(keyDescription, String.valueOf(editTextDescription.getText()));
                setResult(RESULT_OK, intentRequest);
                String s1 = editTextTitle.getText().toString();
                String s2 = editTextDescription.getText().toString();
                dbHelper.addData(s1, s2);
                finish();
            }
        });


    }
}
