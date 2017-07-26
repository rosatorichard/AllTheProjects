package com.batchmates.android.databinding;

import android.databinding.DataBindingUtil;
import android.support.v4.database.DatabaseUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.batchmates.android.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);


        binding.setPerson(new Person("Harry","Potter"));
        binding.setViewmodel(new ViewModel());
    }
}
