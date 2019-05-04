package com.example.student.androidlistactivitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import Notes.Notes;

public class NotepadActivity extends AppCompatActivity {

    private ListView notepadview;

    private  NotepadAdapter adapter;
    private ArrayList<Notes> notesArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notepad);

        notepadview = findViewById(R.id.notepadView);
        notesArrayList = new ArrayList<Notes>();
    }
}
