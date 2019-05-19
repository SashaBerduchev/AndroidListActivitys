package DataBaseHelpers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ResyclerDBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="DbResycler";
    public static final int DATABASE_VERSION=1;
    public static final String TABLE = "DbResTable";
    public static final String _ID = "id";
    public static final String COLUMN_1="Name";
    public static final String COLUMN_2="Sername";
    public static final String COLUMN_3="Age";
    public static final String COLUMN_4="Height";
    public static final String COLUMN_5="Weight";
    public static final String CREATE_TABLE="CREATE TABLE "
            + TABLE + " ( "
            + _ID + " INTEGER PRIMARY KEY, "
            + COLUMN_1 + " TEXT, "
            + COLUMN_2 + " TEXT, "
            + COLUMN_3 + " TEXT, "
            + COLUMN_4 + " TEXT, "
            + COLUMN_5 + " TEXT)";

    public ResyclerDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void addData(String s1,String s2, String s3, String s4, String s5)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_1,s1);
        values.put(COLUMN_2,s2);
        values.put(COLUMN_3,s3);
        values.put(COLUMN_4,s4);
        values.put(COLUMN_5,s5);
        db.insert(TABLE,null,values);
        db.close();
    }

    public Cursor fetchData()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        String str = ("SELECT rowid _id, * FROM DbResTable");
        return db.rawQuery(str,null);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(db);
    }

}
