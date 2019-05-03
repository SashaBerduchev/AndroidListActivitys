package com.example.student.androidlistactivitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class NotepadActivity extends AppCompatActivity {

    private ListView notepadview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notepad);

        notepadview = findViewById(R.id.notepadView);
    }
}
