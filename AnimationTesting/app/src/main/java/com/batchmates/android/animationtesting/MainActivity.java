package com.batchmates.android.animationtesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test=(ImageView)findViewById(R.id.testImage);

    }

    public void move(View view) {
//        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sparactic_move);
//        test.setAnimation(animation);
//        test.startAnimation(animation);

//        test.animate().translationY(200);
//        test.animate().translationX(200);

        test.animate().translationYBy(200);

//
//        TranslateAnimation translateAnimation=new TranslateAnimation(0,0,1000,1000);
//        translateAnimation.setDuration(800);
//        translateAnimation.setInterpolator(new LinearInterpolator());
//        test.setAnimation(translateAnimation);
//
//        translateAnimation.setFillAfter(true);
//        test.startAnimation(translateAnimation);



    }

    public void moveUp(View view) {

//        test.animate().translationYBy(-200);
        Threader threader=new Threader(this,test,0);
        threader.start();
    }

    public void moveLeft(View view) {

//        test.animate().translationXBy(-200);
        Threader threader=new Threader(this,test,1);
        threader.start();
    }

    public void moveRight(View view) {

//        test.animate().translationXBy(200);
        Threader threader=new Threader(this,test,2);
        threader.start();
    }

    public void moveDown(View view) {

//        test.animate().translationYBy(200);
        Threader threader=new Threader(this,test,3);
        threader.start();


    }
}
