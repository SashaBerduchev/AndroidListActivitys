package com.example.student.androidlistactivitys;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;



import java.util.ArrayList;

import DataBaseHelpers.Main2ActivityDataBase;
import es.dmoral.toasty.Toasty;


import static com.example.student.androidlistactivitys.R.*;

public class MainActivity extends AppCompatActivity {

    static final int requestCodeActivity =2;
    Button btnOpen,  btnrequest, notepadBttn;
    ListView listdat;
    Button btnaction;
    Button btnweb, btnmap, btncalc, btnmath, btnrecycleactivity, btnShape;



    Animation animation, btnanim;

    static final String keyName = "keyName";
    static final String keySename = "keySename";


    public AdapterData adapter;
    ArrayList<Person> list;

    DBCreatorTool dbCreatorTool;
    SQLiteDatabase db;
    Main2ActivityDataBase dataBase;
    private static final String NAME_TABLE = "ListTable";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        btnOpen = findViewById(R.id.btnOpen);
        listdat = findViewById(R.id.listdat);
        btnaction = findViewById(id.btnAction);
        btnweb = findViewById(R.id.btnWeb);
        btnmap = findViewById(R.id.btnMap);
        btncalc = findViewById(R.id.btnCalc);
        btnmath = findViewById(R.id.btnMatrix);
        btnrequest = findViewById(R.id.btnrequestactivity);
        btnrecycleactivity = findViewById(R.id.btnRecycle);
        btnShape = findViewById(id.btnShapeActivity);
        notepadBttn = findViewById(id.notepadButton);
        dataBase = new Main2ActivityDataBase(this);
        list = new ArrayList<Person>();

        final Intent intent = getIntent();

        final Intent intents = new Intent(this, Main2Activity.class);

        final Intent intent1 = new Intent(this, Main3Activity.class);

        final Intent intent2 = new Intent(this, Main5Activity.class);

        final Intent intentmap = new Intent(this, MapsActivity.class);

        final Intent intentcalc = new Intent(this, ArrayCalcActivity.class);

        final Intent intentmath = new Intent(this, MathActivity.class);

        final  Intent intentrequest = new Intent(this, RequaestActivity.class);

        final  Intent intentrecycleactivity = new Intent(this, ResycleListActivity.class);

        final Intent intentshape = new Intent(this, ShapeViewActivity.class);

        final  Intent intentnotepadactivity = new Intent(this, NotepadActivity.class);

        String name = intent.getStringExtra(keyName);
        String sername = intent.getStringExtra(keySename);
        list.add(new Person(name, sername));
        adapter = new AdapterData(list, getApplicationContext());
        listdat.setAdapter(adapter);
        btnanim = AnimationUtils.loadAnimation(getApplicationContext(), anim.anim_scale);

        btnOpen.startAnimation(btnanim);
        btnaction.startAnimation(btnanim);
        btnweb.startAnimation(btnanim);
        btnmap.startAnimation(btnanim);
        btncalc.startAnimation(btnanim);
        btnmath.startAnimation(btnanim);
        btnrequest.startAnimation(btnanim);
        btnrecycleactivity.startAnimation(btnanim);
        notepadBttn.startAnimation(btnanim);

        dbCreatorTool = new DBCreatorTool(this);
        db = dbCreatorTool.getWritableDatabase();


        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(intents, requestCodeActivity);


                ContentValues contentValues = new ContentValues();
                contentValues.put("firstName", String.valueOf(listdat.getAdapter()));

                long id = db.insert(NAME_TABLE, null, contentValues);

            }

        });


        btnrequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentrequest);
            }
        });



        btnaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
                Toasty.success(getApplicationContext(), "Success!", Toast.LENGTH_SHORT, true).show();
            }
        });


        btnweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
                Toasty.success(getApplicationContext(), "Success!", Toast.LENGTH_SHORT, true).show();

            }
        });


        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentmap);
                Toasty.success(getApplicationContext(), "Success!", Toast.LENGTH_SHORT, true).show();

            }
        });

        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentcalc);
                Toasty.success(getApplicationContext(), "Success!", Toast.LENGTH_SHORT, true).show();

            }
        });

        btnmath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentmath);
                Toasty.success(getApplicationContext(), "Success!", Toast.LENGTH_SHORT, true).show();
            }
        });

        btnrecycleactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentrecycleactivity);
                Toasty.success(getApplicationContext(), "Success!", Toast.LENGTH_SHORT, true).show();
            }
        });

        btnShape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentshape);
                Toasty.success(getApplicationContext(), "Success!", Toast.LENGTH_SHORT, true).show();
            }
        });

        notepadBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentnotepadactivity);
            }
        });

        getData();
    }

    private void getData() {
        Cursor cursor = dataBase.fetchData();
        ListAdapter myAdapter = new SimpleCursorAdapter(this, R.layout.tasks, cursor,
                new String[]{dataBase._ID, dataBase.COLUMN_1, dataBase.COLUMN_2},
                new int[]{R.id.idnum,R.id.c1,R.id.c2},0);
        listdat.setAdapter(myAdapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == requestCodeActivity)
        {
            if(resultCode == RESULT_OK)
            {
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_listview);
                list.add(new Person(data.getStringExtra(keyName), data.getStringExtra(keySename)));
                adapter.notifyDataSetChanged();
                listdat.startAnimation(animation);
                btnOpen.startAnimation(btnanim);
                btnaction.startAnimation(btnanim);

            }

        }

    }

}




