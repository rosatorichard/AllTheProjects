package com.example.android.sharingdataviaintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tvName;
    private TextView tvAge;
    private TextView tvGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();
        ParciliblePerson person =(ParciliblePerson)intent.getParcelableExtra("ParcPerson");

        tvName = (TextView)findViewById(R.id.tvPersonNameParc);
        tvAge = (TextView)findViewById(R.id.tvPersonAgeParc);
        tvGender = (TextView)findViewById(R.id.tvPersonGenderParc);


        tvName.setText(person.getName());
        tvAge.setText(String.valueOf(person.getAge()));
        tvGender.setText(person.getGender());


    }
}
