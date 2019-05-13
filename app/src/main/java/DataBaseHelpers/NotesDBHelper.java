package DataBaseHelpers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class NotesDBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="DbNotes";
    public static final int DATABASE_VERSION=1;
    public static final String TABLE = "DbTableNotes";
    public static final String _ID = "id";
    public static final String COLUMN_1="Title";
    public static final String COLUMN_2="Description";
    public static final String CREATE_TABLE="CREATE TABLE "
            + TABLE + " ( "
            + _ID + " INTEGER PRIMARY KEY, "
            + COLUMN_1 + " TEXT, "
            + COLUMN_2 + " TEXT)";

    public NotesDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void addData(String s1,String s2)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_1,s1);
        values.put(COLUMN_2,s2);
        db.insert(TABLE,null,values);
        db.close();
    }

    public Cursor fetchData()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        String str = ("SELECT rowid _id, * FROM DbTableNotes");
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
