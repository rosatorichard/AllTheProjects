package com.batchmates.android.sharedprefsqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;
import android.util.Log;

/**
 * Created by Android on 6/26/2017.
 */

public class DatabaseHelperMultiple extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "database_Name";
    private static final int DATABASE_VERSION = 3;
    private static final String TABLE_NAME = "The_Table";
    private static final String TAG = "The Database";
    private static final String CONTACT_NAME = "Name";
    private static final String CONTACT_PHONE = "Phone";
    private static final String BITHDAY = "Birthday";
    private static final String NUM = "ID";

    public DatabaseHelperMultiple(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_TABLE= "CREATE TABLE " + TABLE_NAME +"(" +
                CONTACT_NAME +" TEXT,"+
                CONTACT_PHONE+" TEXT,"+
                BITHDAY + " TEXT," +
                NUM + " INTEGER PRIMARY KEY"+")";

        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXIST "+TABLE_NAME);

        onCreate(db);

    }


    public void addContact(String name, String phone, String birtday)
    {
        SQLiteDatabase database=this.getWritableDatabase();

        ContentValues content=new ContentValues();

        content.put(CONTACT_NAME,name);
        content.put(CONTACT_PHONE,phone);
        content.put(BITHDAY,birtday);
        //content.put(NUM,database);

        database.insert(TABLE_NAME,null,content);
        //database.insert(TABLE_NAME,content,DATABASE_NAME,);
    }

    public void printContacts() {

        String query = "Select * From " + TABLE_NAME;


        SQLiteDatabase database = this.getWritableDatabase();

        Cursor cursor = database.rawQuery(query, null);
        if (cursor.moveToFirst())
        {
            do {
                Log.d(TAG, "printContacts: Name: " + cursor.getString(0) + " Phone: " + cursor.getString(1) + " Birthday: " + cursor.getString(2) + " ID: " + cursor.getString(3));

            } while (cursor.moveToNext());
    }
    }

}
