package com.example.student.androidlistactivitys;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import DataBaseHelpers.DatabaseHelper;

public class SqlightListActivity extends AppCompatActivity {

    EditText text1,text2;
    DatabaseHelper dbHelp;
    ListView alist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlight_list);

        text1 = (EditText) findViewById(R.id.Text1);
        text2 = (EditText) findViewById(R.id.Text2);
        dbHelp = new DatabaseHelper(this);
        alist = (ListView) findViewById(R.id.listView);
        // alist = getListView();
        getData();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        //    return true;
        //}

        return super.onOptionsItemSelected(item);
    }

    public void addNew(View view) {
        String s1 = text1.getText().toString();
        String s2 = text2.getText().toString();
        dbHelp.addData(s1,s2);
        getData();
    }
    public void getData()
    {
        Cursor cursor = dbHelp.fetchData();

        ListAdapter myAdapter = new SimpleCursorAdapter(this,R.layout.tasks,
                cursor,
                new String[]{dbHelp._ID,dbHelp.COLUMN_1,dbHelp.COLUMN_2},
                new int[]{R.id.model,R.id.name,R.id.c2},0);
        alist.setAdapter(myAdapter);

    }
}
