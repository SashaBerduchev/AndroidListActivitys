package com.example.student.androidlistactivitys;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;

import DataBaseHelpers.ProdDataDBHelper;

public class Main4Activity extends AppCompatActivity {

   static final int requestCodeActivity=3;
    ListView listofstate;
    FloatingActionButton floatingActionButton;
    ProdDataDBHelper dbHelper;
    Button btnHome;
    public static String keyName = "keyName";
    public static String keyModel = "keyModel";
    public static String keyProd = "keyProd";

    ArrayList<ProdData> listprod;
    AdapterList adapterList;
    Animation animation;
    DBCreatorTool dbCreatorTool;
    SQLiteDatabase db;

    private  static final  String NAME_TABLE = "ListTable";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        final Intent intent = getIntent();
        final Intent intent1 = new Intent(this, MainActivity.class);
        listofstate= findViewById(R.id.listofstate);
        btnHome = findViewById(R.id.btnHome);
        floatingActionButton = findViewById(R.id.floatingBttn);
        listprod= new ArrayList<ProdData>();
        dbHelper = new ProdDataDBHelper(this);
        String namedat=intent.getStringExtra(keyName);
        String modeldat = intent.getStringExtra(keyModel);
        String proddat = intent.getStringExtra(keyProd);
        listprod.add(new ProdData(namedat, modeldat, proddat));
        adapterList = new AdapterList(listprod, this);
       // adapterList.notifyDataSetChanged();
        listofstate.setAdapter(adapterList);
        final Intent intentl = new Intent(this, Main3Activity.class);
        animation = AnimationUtils.loadAnimation(this, R.anim.animation_listview);
        listofstate.setAnimation(animation);
        dbCreatorTool = new DBCreatorTool(this);
        db=dbCreatorTool.getWritableDatabase();
        getData();
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(intentl, requestCodeActivity);

                ContentValues contentValues = new ContentValues();
                contentValues.put("listdat", String.valueOf(listprod));

                //long id = db.insert(NAME_TABLE, null, contentValues);
                Cursor cursor = db.query(NAME_TABLE, null, null, null, null, null, null);
                getData();
                if (cursor.moveToFirst()) {
                    int idIndex = cursor.getColumnIndex("_id");
                    int listProd = cursor.getColumnIndex("listprod");
                    do {
                        int idint = cursor.getInt(idIndex);
                        String list = cursor.getString(listProd);

                        Log.d("TAG", "id = " + idint);
                        Log.d("TAG", "firstName = " + list);


                    } while (cursor.moveToNext());
                }
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });
    }

    public void getData() {
        Cursor cursor = dbHelper.fetchData();

        ListAdapter myAdapter = new SimpleCursorAdapter(this, R.layout.prodtask, cursor,
                new String[]{dbHelper._ID, dbHelper.COLUMN_1, dbHelper.COLUMN_2},
                new int[]{R.id.model,R.id.name,R.id.c2},0);
        listofstate.setAdapter(myAdapter);
    }
   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==requestCodeActivity)
        {
            if(resultCode==RESULT_OK)
            {
                listprod.add(new ProdData(data.getStringExtra(keyName), data.getStringExtra(keyModel), data.getStringExtra(keyProd)));;

            }
        }

    }*/
}
