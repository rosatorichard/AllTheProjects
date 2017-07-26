package com.example.android.mathadd;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "Activity2";
    private ImageView image;
    private int current=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        image = (ImageView)findViewById(R.id.image);

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


    public void Swap(View view) {


//        if(image.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.not_math).getConstantState()))
//        {
//            image.setImageResource(R.drawable.picture_math);
//
//        }
//        else
//        {
//            image.setImageResource(R.drawable.not_math);
//        }
        if(current==1)
        {
            image.setImageResource(R.drawable.picture_math);
            current=0;
        }
        else
        {
            current=1;
            image.setImageResource(R.drawable.not_math);
        }


    }
}
