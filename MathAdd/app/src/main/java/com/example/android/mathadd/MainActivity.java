package com.example.android.mathadd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private EditText first;
    private EditText second;
    private TextView sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (EditText) findViewById(R.id.First);
        second = (EditText) findViewById(R.id.Second);
        sum = (TextView) findViewById(R.id.sum);

        Log.d(TAG, "onCreate: ");
    }
    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart: ");

    }
    public void Add(View view) {

        String num1 = first.getText().toString();
        String num2 = second.getText().toString();
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int thesum = number1 + number2;

        num1 = String.valueOf(thesum);
        sum.setText(num1);

        Toast.makeText(this, "Calculated", Toast.LENGTH_SHORT).show();

    }

    public void goToSecond(View view) {

        Intent intent =new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
