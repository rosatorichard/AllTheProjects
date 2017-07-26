package com.example.android.sharingdataviaintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PersonActivity extends AppCompatActivity {

    private TextView tvName;
    private TextView tvAge;
    private TextView tvGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);

        Intent intent =getIntent();
        SerializablePersonal serializablePersonal =(SerializablePersonal)intent.getSerializableExtra("person");

        tvName = (TextView)findViewById(R.id.tvPersonName);
        tvAge = (TextView)findViewById(R.id.tvPersonAge);
        tvGender = (TextView)findViewById(R.id.tvPersonGender);


        tvName.setText(serializablePersonal.getName());
        tvAge.setText(String.valueOf(serializablePersonal.getAge()));
        tvGender.setText(serializablePersonal.getGender());




    }
}
