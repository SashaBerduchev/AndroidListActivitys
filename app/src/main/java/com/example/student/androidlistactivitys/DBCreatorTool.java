package com.example.student.androidlistactivitys;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBCreatorTool extends SQLiteOpenHelper {

    private static final String NAME_DB = "AndroidListActivitysDB";
    private static final  String NAME_TABLE = "ListTable";
    private static final  int VERSION_DB=1;

    public DBCreatorTool(Context context){super (context, NAME_DB, null, VERSION_DB);}

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("Create table " + NAME_TABLE + "(_id integer primary key autoincrement, listprod List);");
        Log.d("TAD", "On create DB");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }
}
