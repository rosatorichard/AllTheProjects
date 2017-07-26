package com.batchmates.android.contentproviders;

import android.content.ContentResolver;
import android.content.CursorLoader;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findContacts(View view) {

        Uri uri = ContactsContract.Contacts.CONTENT_URI;

        String DISPLAY_NAME = ContactsContract.Contacts.DISPLAY_NAME;

        String HAS_PHONE_NUMBER = ContactsContract.Contacts.HAS_PHONE_NUMBER;

        Cursor cursor = getContentResolver().query(uri, null, null, null, null);

        Uri PHONEURI = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        String number = ContactsContract.CommonDataKinds.Phone.NUMBER;
//        String contactName= cursor.getString(cursor.getColumnIndex(DISPLAY_NAME));
        int hasPhone = 0;

        while (cursor.moveToNext()) {

            if (cursor.getCount() > 0) {
                //Log.d(TAG, "findContacts: " + cursor.getString(cursor.getColumnIndex(DISPLAY_NAME)));

            }

            hasPhone = Integer.parseInt(cursor.getString(cursor.getColumnIndex(HAS_PHONE_NUMBER)));
            String contactName = cursor.getString(cursor.getColumnIndex(DISPLAY_NAME));
            String[] projection = new String[]{ContactsContract.CommonDataKinds.Phone.NUMBER};
            String selection = ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME + "=?";
            String[] selectionArgs = new String[]{contactName};
            if (hasPhone > 0) {
                Log.d(TAG, "findContacts: " + cursor.getString(cursor.getColumnIndex(DISPLAY_NAME)));
                Cursor phoneCursor = getContentResolver().query(PHONEURI, projection, selection, selectionArgs, null);
                while (phoneCursor.moveToNext()) {
                    Log.d(TAG, "findContacts: " + phoneCursor.getString(phoneCursor.getColumnIndex(number)));
                }
            }
        }
    }
}
