package com.example.student.androidlistactivitys;

import android.content.Intent;
import android.database.Cursor;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.sdsmdg.harjot.longshadows.LongShadowsTextView;
import com.sdsmdg.harjot.longshadows.LongShadowsWrapper;

import java.util.ArrayList;

import DataBaseHelpers.NotesDBHelper;
import Notes.Notes;

public class NotepadActivity extends AppCompatActivity {

    private ListView notepadview;

    private  NotepadAdapter adapter;
    private ArrayList<Notes> notesArrayList;
    private FloatingActionButton floatBttn;

    static final String keyTitle = "keyTitle";
    static final String keyDescription = "keyDescription";

    private LongShadowsTextView longShadowsTextView;
    private LongShadowsWrapper longShadowsWrapper;
    private NotesDBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notepad);

        dbHelper = new NotesDBHelper(this);
        final Intent intent = getIntent();

        final Intent intentnoteactiovity = new Intent(this, NotesActivity.class);
        notepadview = findViewById(R.id.notepadView);
        floatBttn = findViewById(R.id.floatBttn);
        notesArrayList = new ArrayList<Notes>();
        longShadowsWrapper = findViewById(R.id.longShadowsWrapper);
        longShadowsTextView = findViewById(R.id.longShadowTextView);

        String title = intent.getStringExtra(keyTitle);
        String description = intent.getStringExtra(keyDescription);
        notesArrayList.add(new Notes(title, description));
        adapter = new NotepadAdapter(notesArrayList, getApplicationContext());
        notepadview.setAdapter(adapter);
        getData();
        floatBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentnoteactiovity);
                getData();
            }
        });
        notepadview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(intentnoteactiovity);
                getData();
            }
        });

    }

    private void getData() {
        Cursor cursor = dbHelper.fetchData();
        ListAdapter myAdapter = new SimpleCursorAdapter(this, R.layout.tasks,
                cursor,
                new String[]{dbHelper._ID,dbHelper.COLUMN_1,dbHelper.COLUMN_2},
                new int[]{R.id.model,R.id.name,R.id.c2},0);

        notepadview.setAdapter(myAdapter);
    }
}
