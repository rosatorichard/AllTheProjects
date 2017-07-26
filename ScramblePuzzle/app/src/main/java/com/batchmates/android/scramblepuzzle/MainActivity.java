package com.batchmates.android.scramblepuzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void three(View view) {

        Intent intent = new Intent(MainActivity.this, ThreeByThree.class);
        Toast.makeText(this,"Puzzle 3x3",Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }


    public void four(View view) {

        Intent intent = new Intent(MainActivity.this, FourByFour.class);
        Toast.makeText(this,"Puzzle 4x4",Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }


    public void five(View view) {

        Intent intent = new Intent(MainActivity.this, FiveByFive.class);
        Toast.makeText(this,"Puzzle 5x5",Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
