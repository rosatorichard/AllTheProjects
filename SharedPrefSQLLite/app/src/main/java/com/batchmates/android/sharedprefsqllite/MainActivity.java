package com.batchmates.android.sharedprefsqllite;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private static final String MY_PREF_FILE = "com.example.rosato.sharedprefsqllight.sharedpreffile";

    private EditText texter;
    private TextView textView;


    private String name,phone,birthday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texter=(EditText)findViewById(R.id.text);
        textView = (TextView) findViewById(R.id.textView);

    }

    public void showSaved(View view) {

        //TextView view1;
        SharedPreferences preferences =getSharedPreferences(MY_PREF_FILE, Context.MODE_PRIVATE);
        //view1=(TextView)findViewById(R.id.textView);
        textView.setText(preferences.getString(getString(R.string.KEY_NAME),"woot"));

 //       view1.setText(preferences.getString(getString(R.string.KEY_NAME),"woot"));

    }

    public void saveName(View view) {
        SharedPreferences preferences =getSharedPreferences(MY_PREF_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();

        String text=String.valueOf(texter.getText());

        editor.putString(getString(R.string.KEY_NAME),text);
        editor.commit();

    }

    public void saveContact(View view) {

        DatabaseHelperMultiple dataBaseHelper=new DatabaseHelperMultiple(this);


        dataBaseHelper.addContact(name,phone,birthday);


    }

    public void getContact(View view) {

        DatabaseHelperMultiple dataBaseHelper=new DatabaseHelperMultiple(this);

        dataBaseHelper.printContacts();
    }
}
