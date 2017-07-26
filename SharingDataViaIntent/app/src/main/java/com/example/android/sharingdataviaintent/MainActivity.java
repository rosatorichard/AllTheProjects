package com.example.android.sharingdataviaintent;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void sendPerson(View view) {

        SerializablePersonal person= new SerializablePersonal("Bob Bobberson",18,"Male");

        Intent intent =new Intent(MainActivity.this,PersonActivity.class);

        intent.putExtra("person",person);
        startActivity(intent);


    }

    public void sendPersonParcilible(View view) {


        ParciliblePerson person= new ParciliblePerson("Park Parkerson",80,"Male");

        Intent intent =new Intent(MainActivity.this, Main2Activity.class);

        intent.putExtra("ParcPerson",person);
        startActivity(intent);

    }
}
