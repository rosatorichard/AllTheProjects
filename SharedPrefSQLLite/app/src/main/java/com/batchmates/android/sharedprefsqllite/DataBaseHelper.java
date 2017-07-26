package com.batchmates.android.sharedprefsqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Android on 6/26/2017.
 */

public class DataBaseHelper extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 2;
    private static final String TAG = "DATABASEHELPER";
    private static final String DATABASE_NAME = "MY_DB";
    private static final String TABLE_NAME = "Contacts";
    private static final String CONTACT_NAME = "name";
    private static final String CONTACT_PHONE = "phone";


    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_TABLE= "CREATE TABLE "+TABLE_NAME+"("+CONTACT_NAME+" TEXT,"+CONTACT_PHONE+" TEXT PRIMARY KEY"+")";


        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXIST "+TABLE_NAME);

        onCreate(db);

    }

    //SQLiteDatabase database;

    public void saveData(String name , String phone)
    {

        Log.d(TAG, "saveData: It worked");
        SQLiteDatabase database=this.getWritableDatabase();


        ContentValues contentValues =new ContentValues();

        contentValues.put(CONTACT_NAME, name);
        contentValues.put(CONTACT_PHONE,phone);

        database.insert(TABLE_NAME,null,contentValues);


    }


    public void getData()
    {
        String query="Select * From "+TABLE_NAME;

        SQLiteDatabase database=this.getWritableDatabase();
        Cursor cursor=database.rawQuery(query,null);

        //only grabs the first one
        if(cursor.moveToFirst())
        {
            Log.d(TAG, "getContact: "+"Name: "+cursor.getString(0)+", phone: "+cursor.getString(1));
        }
    }

}
