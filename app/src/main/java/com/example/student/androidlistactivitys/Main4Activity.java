package com.example.student.androidlistactivitys;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

   static final int requestCodeActivity=3;
    ListView listofstate;
    Button btnready;

    public static String keyName = "keyName";
    public static String keyModel = "keyModel";
    public static String keyProd = "keyProd";

    ArrayList<ProdData> listprod;
    AdapterList adapterList;

    DBCreatorTool dbCreatorTool;
    SQLiteDatabase db;
    private  static final  String NAME_TABLE = "ListTable";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final Intent intent = getIntent();
        listofstate= findViewById(R.id.listofstate);
        btnready=findViewById(R.id.btnReady);
        listprod= new ArrayList<ProdData>();

        String namedat=intent.getStringExtra(keyName);
        String modeldat = intent.getStringExtra(keyModel);
        String proddat = intent.getStringExtra(keyProd);
        listprod.add(new ProdData(namedat, modeldat, proddat));
        adapterList = new AdapterList(listprod, this);
       // adapterList.notifyDataSetChanged();
        listofstate.setAdapter(adapterList);

        final Intent intentl = new Intent(this, Main3Activity.class);

        dbCreatorTool = new DBCreatorTool(this);
        db=dbCreatorTool.getWritableDatabase();

        btnready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(intentl, requestCodeActivity);

                ContentValues contentValues = new ContentValues();
                contentValues.put("listdat", String.valueOf(listprod));

                long id = db.insert(NAME_TABLE, null, contentValues);

                Cursor cursor = db.query(NAME_TABLE, null, null, null, null, null, null);
                if(cursor.moveToFirst()){
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
