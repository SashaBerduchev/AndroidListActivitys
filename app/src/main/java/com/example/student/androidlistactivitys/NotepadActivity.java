package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import Notes.Notes;

public class NotepadActivity extends AppCompatActivity {

    private ListView notepadview;

    private  NotepadAdapter adapter;
    private ArrayList<Notes> notesArrayList;

    static final String keyTitle = "keyTitle";
    static final String keyDescription = "keyDescription";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notepad);

        final Intent intent = getIntent();

        final Intent intentnoteactiovity = new Intent(this, NotesActivity.class);
        notepadview = findViewById(R.id.notepadView);
        notesArrayList = new ArrayList<Notes>();
        String title = intent.getStringExtra(keyTitle);
        String description = intent.getStringExtra(keyDescription);
        notesArrayList.add(new Notes(title, description));
        adapter = new NotepadAdapter(notesArrayList, getApplicationContext());
        notepadview.setAdapter(adapter);
        notepadview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(intentnoteactiovity);
            }
        });

    }
}
