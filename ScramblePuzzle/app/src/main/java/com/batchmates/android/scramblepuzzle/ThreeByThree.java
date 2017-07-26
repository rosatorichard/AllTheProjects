package com.batchmates.android.scramblepuzzle;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.concurrent.ExecutorCompletionService;

public class ThreeByThree extends AppCompatActivity {

    private ImageButton topLeft,topMiddle,topRight,centerLeft,centerMiddle,centerRight,bottomLeft,bottomMiddle,bottomRight;
    private int selected=0;
    private int deadSpace=3;
    private int previus=0;

    //all the drawable
    private int nine=R.drawable.topright;
    private int eight=R.drawable.topmiddle;
    private int seven=R.drawable.topleft;
    private int six=R.drawable.centerright;
    private int five=R.drawable.centermiddle;
    private int four=R.drawable.centerleft;
    private int three=R.drawable.black;
    private int two=R.drawable.bottommiddle;
    private int one=R.drawable.bottomleft;
    private int handler=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_by_three);



        topLeft =(ImageButton)findViewById(R.id.imgBtnTopLeft);
        topMiddle =(ImageButton)findViewById(R.id.imgBtnTopMiddle);
        topRight =(ImageButton)findViewById(R.id.imgBtnTopRight);

        centerLeft =(ImageButton)findViewById(R.id.imgBtnCenterLeft);
        centerMiddle =(ImageButton)findViewById(R.id.imgBtnCenterMiddle);
        centerRight =(ImageButton)findViewById(R.id.imgBtnCenterRight);

        bottomLeft =(ImageButton)findViewById(R.id.imgBtnBottomLeft);
        bottomMiddle =(ImageButton)findViewById(R.id.imgBtnBottomMiddle);
        bottomRight =(ImageButton)findViewById(R.id.imgBtnBottomRight);



        //not yet completed
        randomConfig();

        bottomLeft.setBackgroundResource(one);
        bottomMiddle.setBackgroundResource(two);
        bottomRight.setBackgroundResource(three);

        centerLeft.setBackgroundResource(four);
        centerMiddle.setBackgroundResource(five);
        centerRight.setBackgroundResource(six);

        topLeft.setBackgroundResource(seven);
        topMiddle.setBackgroundResource(eight);
        topRight.setBackgroundResource(nine);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setShowHideAnimationEnabled(true);
    }

    public void randomConfig()
    {
        int roller=0;
        for (int i = 0; i <45 ; i++)
        {
            roller=(int)Math.floor(Math.random()*2);
            Log.d("Which Rand "+roller, "randomConfig: ");

            if(deadSpace==1)
            {
                if(roller==1)
                {
//                    bottomLeft.setBackgroundResource(two);
//                    bottomMiddle.setBackgroundResource(one);
                    handler=two;
                    two=one;
                    one=handler;
                    deadSpace=2;
                }
                else
                {
//                    bottomLeft.setBackgroundResource(four);
//                    centerLeft.setBackgroundResource(one);
                    handler=four;
                    four=one;
                    one=handler;
                    deadSpace=4;
                }
                continue;
            }
            if(deadSpace==2)
            {
                if(roller==1)
                {
//                    bottomMiddle.setBackgroundResource(one);
//                    bottomLeft.setBackgroundResource(two);
                    handler=two;
                    two=one;
                    one=handler;
                    deadSpace=1;
                }
                else
                {
                    roller=(int)Math.floor(Math.random()*2);
                    if(roller==1)
                    {
//                        bottomMiddle.setBackgroundResource(three);
//                        bottomRight.setBackgroundResource(two);
                        handler = three;
                        three = two;
                        two = handler;
                        deadSpace = 3;
                    }
                    else
                    {
//                        bottomMiddle.setBackgroundResource(five);
//                        centerMiddle.setBackgroundResource(two);
                        handler = five;
                        five = two;
                        two = handler;
                        deadSpace = 5;
                    }
                }
                continue;
            }

            if(deadSpace==3)
            {
                if(roller==1)
                {
//                    bottomLeft.setBackgroundResource(two);
//                    bottomMiddle.setBackgroundResource(three);
                    handler=two;
                    two=three;
                    three=handler;
                    deadSpace=2;
                }
                else
                {
//                    bottomLeft.setBackgroundResource(six);
//                    centerRight.setBackgroundResource(three);
                    handler=six;
                    six=three;
                    three=handler;
                    deadSpace=6;
                }
                continue;
            }

            if(deadSpace==4)
            {
                if(roller==1)
                {
//                    centerLeft.setBackgroundResource(one);
//                    bottomLeft.setBackgroundResource(four);
                    handler=one;
                    one=four;
                    four=handler;
                    deadSpace=1;
                }
                else
                {
                    roller=(int)Math.floor(Math.random()*2);
                    if(roller==1)
                    {
//                        centerLeft.setBackgroundResource(seven);
//                        topLeft.setBackgroundResource(four);
                        handler=seven;
                        seven=four;
                        four=handler;
                        deadSpace=7;
                    }
                    else
                    {
//                        centerLeft.setBackgroundResource(five);
//                        centerMiddle.setBackgroundResource(four);
                        handler=five;
                        five=four;
                        four=handler;
                        deadSpace=5;
                    }
                }
                continue;
            }

            if(deadSpace==5)
            {
                if(roller==1)
                {
                    roller=(int)Math.floor(Math.random()*2);
                    if(roller==1)
                    {
//                        centerMiddle.setBackgroundResource(four);
//                        centerLeft.setBackgroundResource(five);
                        handler = four;
                        four = five;
                        five = handler;
                        deadSpace = 4;
                    }
                    else
                    {
//                        centerMiddle.setBackgroundResource(two);
//                        bottomMiddle.setBackgroundResource(five);
                        handler = two;
                        two = five;
                        five = handler;
                        deadSpace = 2;
                    }
                }
                else
                {
                    roller=(int)Math.floor(Math.random()*2);
                    if(roller==1)
                    {
//                        centerMiddle.setBackgroundResource(eight);
//                        topMiddle.setBackgroundResource(five);
                        handler = eight;
                        eight = five;
                        five = handler;
                        deadSpace = 8;
                    }
                    else
                    {
//                        centerMiddle.setBackgroundResource(six);
//                        centerRight.setBackgroundResource(five);
                        handler = six;
                        six = five;
                        five = handler;
                        deadSpace = 6;
                    }
                }
                continue;
            }

            if(deadSpace==6)
            {
                if(roller==1)
                {
//                    centerRight.setBackgroundResource(nine);
//                    topLeft.setBackgroundResource(six);
                    handler=nine;
                    nine=six;
                    six=handler;
                    deadSpace=9;
                }
                else
                {
                    roller=(int)Math.floor(Math.random()*2);
                    if(roller==1)
                    {
//                        centerRight.setBackgroundResource(three);
//                        bottomLeft.setBackgroundResource(six);
                        handler=three;
                        three=six;
                        six=handler;
                        deadSpace=3;
                    }
                    else
                    {
//                        centerRight.setBackgroundResource(five);
//                        centerMiddle.setBackgroundResource(six);
                        handler=five;
                        five=six;
                        six=handler;
                        deadSpace=5;
                    }
                }
                continue;
            }

            if(deadSpace==7)
            {
                if(roller==1)
                {
//                    topLeft.setBackgroundResource(eight);
//                    topMiddle.setBackgroundResource(seven);
                    handler=eight;
                    eight=seven;
                    seven=handler;
                    deadSpace=8;
                }
                else
                {
//                    topLeft.setBackgroundResource(four);
//                    centerLeft.setBackgroundResource(seven);
                    handler=four;
                    four=seven;
                    seven=handler;
                    deadSpace=4;
                }
                continue;
            }


            if(deadSpace==8)
            {
                if(roller==1)
                {
//                    topMiddle.setBackgroundResource(nine);
//                    topRight.setBackgroundResource(eight);
                    handler=nine;
                    nine=eight;
                    eight=handler;
                    deadSpace=9;
                }
                else
                {
                    roller=(int)Math.floor(Math.random()*2);
                    if(roller==1)
                    {
//                        topMiddle.setBackgroundResource(seven);
//                        topLeft.setBackgroundResource(eight);
                        handler=seven;
                        seven=eight;
                        eight=handler;
                        deadSpace=7;
                    }
                    else
                    {
//                        topMiddle.setBackgroundResource(five);
//                        centerMiddle.setBackgroundResource(eight);
                        handler=five;
                        five=eight;
                        eight=handler;
                        deadSpace=5;
                    }
                }
                continue;
            }


            if(deadSpace==9)
            {
                if(roller==1)
                {
//                    topRight.setBackgroundResource(eight);
//                    topMiddle.setBackgroundResource(nine);
                    handler=eight;
                    eight=nine;
                    nine=handler;
                    deadSpace=8;
                }
                else
                {
//                    topRight.setBackgroundResource(six);
//                    centerRight.setBackgroundResource(nine);
                    handler=six;
                    six=nine;
                    nine=handler;
                    deadSpace=6;
                }
                continue;
            }
        }
    }



    //top image buttons
    public void topLeft(View view) {


        selected=7;

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        if(selected!=deadSpace)
        {
            previus =7;
        }

        switch (deadSpace)
        {
            case 8:
                view.setBackgroundResource(eight);
                topMiddle.setBackgroundResource(seven);
                handler=eight;
                eight=seven;
                seven=handler;
                deadSpace=selected;
                break;

            case 4:
                view.setBackgroundResource(four);
                centerLeft.setBackgroundResource(seven);
                handler=four;
                four=seven;
                seven=handler;
                deadSpace=selected;
                break;

            default:
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
//        selected =7;
//        if(selected!=deadSpace)
//        {
//            previus =7;
//        }
//        if(selected==deadSpace)
//        {
//            if(previus==4)
//            {
//                Log.d("Swap with four", "topLeft: ");
//                topLeft.setBackgroundResource(four);
//                centerLeft.setBackgroundResource(seven);
//                handler=four;
//                four=seven;
//                seven=handler;
//                deadSpace=4;
//            }
//            if(previus==8)
//            {
//                topLeft.setBackgroundResource(eight);
//                topMiddle.setBackgroundResource(seven);
//                handler=eight;
//                eight=seven;
//                seven=handler;
//                deadSpace=8;
//            }
//            previus =0;
//        }
//
//        if(checkForVictory()==true)
//        {
//            Victory();
//        }
    }

    public void topMiddle(View view) {


        selected=8;

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        if(selected!=deadSpace)
        {
            previus =8;
        }

        switch (deadSpace)
        {
            case 9:
                view.setBackgroundResource(nine);
                topRight.setBackgroundResource(eight);
                handler=eight;
                eight=nine;
                nine=handler;
                deadSpace=selected;
                break;

            case 7:
                view.setBackgroundResource(seven);
                topLeft.setBackgroundResource(eight);
                handler=eight;
                eight=seven;
                seven=handler;
                deadSpace=selected;
                break;

            case 5:
                view.setBackgroundResource(five);
                centerMiddle.setBackgroundResource(eight);
                handler=eight;
                eight=five;
                five=handler;
                deadSpace=selected;
                break;

            default:
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
//        selected =8;
//        if(selected!=deadSpace)
//        {
//            previus=8;
//        }
//        else
//        {
//            if(previus==7)
//            {
//                Log.d("Swap with seven", "topMiddle: ");
//                topMiddle.setBackgroundResource(seven);
//                topLeft.setBackgroundResource(eight);
//                handler=seven;
//                seven=eight;
//                eight=handler;
//                deadSpace=7;
//            }
//            if(previus==9)
//            {
//                Log.d("Swap with nine", "topMiddle: ");
//                topMiddle.setBackgroundResource(nine);
//                topRight.setBackgroundResource(eight);
//                handler=nine;
//                nine=eight;
//                eight=handler;
//                deadSpace=9;
//            }
//            if(previus==5)
//            {
//                Log.d("Swap with five", "topMiddle: ");
//                topMiddle.setBackgroundResource(five);
//                centerMiddle.setBackgroundResource(eight);
//                handler=five;
//                five=eight;
//                eight=handler;
//                deadSpace=5;
//            }
//            previus=0;
//        }
//
//        if(checkForVictory()==true)
//        {
//            Victory();
//        }

    }

    public void topRight(View view) {


        selected=9;

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        if(selected!=deadSpace)
        {
            previus =9;
        }

        switch (deadSpace)
        {
            case 8:
                view.setBackgroundResource(eight);
                topMiddle.setBackgroundResource(nine);
                handler=eight;
                eight=nine;
                nine=handler;
                deadSpace=selected;
                break;

            case 6:
                view.setBackgroundResource(six);
                centerRight.setBackgroundResource(nine);
                handler=six;
                six=nine;
                nine=handler;
                deadSpace=selected;
                break;

            default:
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
//        selected =9;
//        if(selected!=deadSpace)
//        {
//            previus=9;
//        }
//        else
//        {
//            if(previus==8)
//            {
//                Log.d("Swap with eight", "topRight: ");
//                topRight.setBackgroundResource(eight);
//                topMiddle.setBackgroundResource(nine);
//                handler=eight;
//                eight=nine;
//                nine=handler;
//                deadSpace=8;
//            }
//            if(previus==6)
//            {
//                Log.d("Swap with six", "topRight: ");
//                topRight.setBackgroundResource(six);
//                centerRight.setBackgroundResource(nine);
//                handler=six;
//                six=nine;
//                nine=handler;
//                deadSpace=6;
//            }
//            previus=0;
//        }
//
//        if(checkForVictory()==true)
//        {
//            Victory();
//        }
    }


    //Center image buttons
    public void centerLeft(View view) {


        selected=4;

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        if(selected!=deadSpace)
        {
            previus =4;
        }

        switch (deadSpace)
        {
            case 5:
                view.setBackgroundResource(five);
                centerMiddle.setBackgroundResource(four);
                handler=five;
                five=four;
                four=handler;
                deadSpace=selected;
                break;

            case 7:
                view.setBackgroundResource(seven);
                topLeft.setBackgroundResource(four);
                handler=seven;
                seven=four;
                four=handler;
                deadSpace=selected;
                break;

            case 1:
                view.setBackgroundResource(one);
                bottomLeft.setBackgroundResource(four);
                handler=one;
                one=four;
                four=handler;
                deadSpace=selected;
                break;


            default:
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }

//        selected =4;
//        if(selected!=deadSpace)
//        {
//            previus=4;
//        }
//        else
//        {
//            if(previus==7)
//            {
//                Log.d("Swap with seven", "centerLeft: ");
//                centerLeft.setBackgroundResource(seven);
//                topLeft.setBackgroundResource(four);
//                handler=seven;
//                seven=four;
//                four=handler;
//                deadSpace=7;
//            }
//            if(previus==5)
//            {
//                Log.d("Swap with five", "centerLeft: ");
//                centerLeft.setBackgroundResource(five);
//                centerMiddle.setBackgroundResource(four);
//                handler=five;
//                five=four;
//                four=handler;
//                deadSpace=5;
//            }
//            if(previus==1)
//            {
//                Log.d("Swap with one", "centerLeft: ");
//                centerLeft.setBackgroundResource(one);
//                bottomLeft.setBackgroundResource(four);
//                handler=one;
//                one=four;
//                four=handler;
//                deadSpace=1;
//            }
//            previus=0;
//        }
//
//        if(checkForVictory()==true)
//        {
//            Victory();
//        }
    }

    public void centerMiddle(View view) {


        selected=5;

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        if(selected!=deadSpace)
        {
            previus =5;
        }

        switch (deadSpace)
        {
            case 6:
                view.setBackgroundResource(six);
                centerRight.setBackgroundResource(five);
                handler=six;
                six=five;
                five=handler;
                deadSpace=selected;
                break;

            case 8:
                view.setBackgroundResource(eight);
                topMiddle.setBackgroundResource(five);
                handler=eight;
                eight=five;
                five=handler;
                deadSpace=selected;
                break;

            case 2:
                view.setBackgroundResource(two);
                bottomMiddle.setBackgroundResource(five);
                handler=two;
                two=five;
                five=handler;
                deadSpace=selected;
                break;

            case 4:
                view.setBackgroundResource(four);
                centerLeft.setBackgroundResource(five);
                handler=four;
                four=five;
                five=handler;
                deadSpace=selected;
                break;

            default:
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
//        selected =5;
//        if(selected!=deadSpace)
//        {
//            previus=5;
//        }
//        else
//        {
//            if(previus==8)
//            {
//                Log.d("Swap with eight", "centerMiddle: ");
//                centerMiddle.setBackgroundResource(eight);
//                topMiddle.setBackgroundResource(five);
//                handler=eight;
//                eight=five;
//                five=handler;
//                deadSpace=8;
//            }
//            if(previus==4)
//            {
//                Log.d("Swap with four", "centerMiddle: ");
//                centerMiddle.setBackgroundResource(four);
//                centerLeft.setBackgroundResource(five);
//                handler=four;
//                four=five;
//                five=handler;
//                deadSpace=4;
//            }
//            if(previus==6)
//            {
//                Log.d("swap with six", "centerMiddle: ");
//                centerMiddle.setBackgroundResource(six);
//                centerRight.setBackgroundResource(five);
//                handler=six;
//                six=five;
//                five=handler;
//                deadSpace=6;
//            }
//            if(previus==2)
//            {
//                Log.d("Swap with two", "centerMiddle: ");
//                centerMiddle.setBackgroundResource(two);
//                bottomMiddle.setBackgroundResource(five);
//                handler=two;
//                two=five;
//                five=handler;
//                deadSpace=2;
//            }
//            previus=0;
//        }
//
//        if(checkForVictory()==true)
//        {
//            Victory();
//        }
    }

    public void centerRight(View view) {


        selected=6;

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        if(selected!=deadSpace)
        {
            previus =6;
        }

        switch (deadSpace)
        {
            case 5:
                view.setBackgroundResource(five);
                centerMiddle.setBackgroundResource(six);
                handler=six;
                six=five;
                five=handler;
                deadSpace=selected;
                break;

            case 3:
                view.setBackgroundResource(three);
                bottomRight.setBackgroundResource(six);
                handler=six;
                six=three;
                three=handler;
                deadSpace=selected;
                break;

            case 9:
                view.setBackgroundResource(nine);
                topRight.setBackgroundResource(six);
                handler=six;
                six=nine;
                nine=handler;
                deadSpace=selected;
                break;

            default:
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
//        selected =6;
//        if(selected!=deadSpace)
//        {
//            previus=6;
//        }
//        else
//        {
//            if(previus==9)
//            {
//                Log.d("Swap with nine", "centerRight: ");
//                centerRight.setBackgroundResource(nine);
//                topRight.setBackgroundResource(six);
//                handler=nine;
//                nine=six;
//                six=handler;
//                deadSpace=9;
//            }
//            if(previus==5)
//            {
//                Log.d("Swap with five", "centerRight: ");
//                centerRight.setBackgroundResource(five);
//                centerMiddle.setBackgroundResource(six);
//                handler=five;
//                five=six;
//                six=handler;
//                deadSpace=5;
//            }
//            if(previus==3)
//            {
//                Log.d("Swap with Three", "centerRight: ");
//                centerRight.setBackgroundResource(three);
//                bottomRight.setBackgroundResource(six);
//                handler=three;
//                three=six;
//                six=handler;
//                deadSpace=3;
//            }
//            previus=0;
//        }
//
//        if(checkForVictory()==true)
//        {
//            Victory();
//        }
    }


    //Bottom image buttons

    public void bottomLeft(View view) {

        selected=1;

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        if(selected!=deadSpace)
        {
            previus =1;
        }

        switch (deadSpace)
        {
            case 2:
                Log.d("Swap with three", "bottomMiddle: ");
                view.setBackgroundResource(two);
                bottomMiddle.setBackgroundResource(one);
                handler=one;
                one=two;
                two=handler;
                deadSpace=selected;
                break;

            case 4:
                Log.d("Swap with three", "bottomMiddle: ");
                view.setBackgroundResource(four);
                centerLeft.setBackgroundResource(one);
                handler=one;
                one=four;
                four=handler;
                deadSpace=selected;
                break;

            default:
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
//        selected =1;
//        if(selected!=deadSpace)
//        {
//            previus=1;
//        }
//        else
//        {
//            if(previus==4)
//            {
//                Log.d("Swap with Four", "bottomLeft: ");
//                bottomLeft.setBackgroundResource(four);
//                centerLeft.setBackgroundResource(one);
//                handler=four;
//                four=one;
//                one=handler;
//                deadSpace=4;
//            }
//            if(previus==2)
//            {
//                Log.d("Swap with two", "bottomLeft: ");
//                bottomLeft.setBackgroundResource(two);
//                bottomMiddle.setBackgroundResource(one);
//                handler=one;
//                one=two;
//                two=handler;
//                deadSpace=2;
//            }
//            previus=0;
//        }
//
//        if(checkForVictory()==true)
//        {
//            Victory();
//        }
    }


    public void bottomMiddle(View view) {


        selected=2;

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        if(selected!=deadSpace)
        {
            previus =2;
        }

        switch (deadSpace)
        {
            case 3:
                Log.d("Swap with three", "bottomMiddle: ");
                view.setBackgroundResource(three);
                bottomRight.setBackgroundResource(two);
                handler=three;
                three=two;
                two=handler;
                deadSpace=selected;
                break;

            case 1:
                Log.d("swap with six", "bottomRight: ");
                view.setBackgroundResource(one);
                bottomLeft.setBackgroundResource(two);
                handler=one;
                one=two;
                two=handler;
                deadSpace=selected;
                break;

            case 5:
                Log.d("swap with six", "bottomRight: ");
                view.setBackgroundResource(five);
                centerMiddle.setBackgroundResource(two);
                handler=five;
                five=two;
                two=handler;
                deadSpace=selected;
                break;
            default:
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }


//        //OLD
//        selected =2;
//        if(selected!=deadSpace)
//        {
//            previus=2;
//        }
//        else
//        {
//            if(previus==3)
//            {
//                Log.d("Swap with three", "bottomMiddle: ");
//                bottomMiddle.setBackgroundResource(three);
//                bottomRight.setBackgroundResource(two);
//                handler=three;
//                three=two;
//                two=handler;
//                deadSpace=3;
//            }
//            if(previus==5)
//            {
//                Log.d("Swap with five", "bottomMiddle: ");
//                bottomMiddle.setBackgroundResource(five);
//                centerMiddle.setBackgroundResource(two);
//                handler=five;
//                five=two;
//                two=handler;
//                deadSpace=5;
//            }
//            if(previus==1)
//            {
//                Log.d("Swap with one", "bottomMiddle: ");
//                bottomMiddle.setBackgroundResource(one);
//                bottomLeft.setBackgroundResource(two);
//                handler=one;
//                one=two;
//                two=handler;
//                deadSpace=1;
//            }
//            previus=0;
//        }
//        if(checkForVictory()==true)
//        {
//            Victory();
//        }
    }

    public void bottomRight(View view) {

        selected=3;

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        if(selected!=deadSpace)
        {
            previus =3;
        }

        switch (deadSpace)
        {
            case 2:
                Log.d("swap with two", "bottomRight: ");
                view.setBackgroundResource(two);
                bottomMiddle.setBackgroundResource(three);
                handler=two;
                two=three;
                three=handler;
                deadSpace=selected;
                break;

            case 6:
                Log.d("swap with six", "bottomRight: ");
                view.setBackgroundResource(six);
                centerRight.setBackgroundResource(three);
                handler=six;
                six=three;
                three=handler;
                deadSpace=selected;
                break;
            default:
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }

//        //orig
//        selected =3;
//        if(selected!=deadSpace)
//        {
//            previus=3;
//        }
//        else
//        {
//            if(previus==6)
//            {
//                Log.d("swap with six", "bottomRight: ");
//                bottomRight.setBackgroundResource(six);
//                centerRight.setBackgroundResource(three);
//                handler=six;
//                six=three;
//                three=handler;
//                deadSpace=6;
//
//            }
//            if(previus==2)
//            {
//                Log.d("swap with two", "bottomRight: ");
//                bottomRight.setBackgroundResource(two);
//                bottomMiddle.setBackgroundResource(three);
//                handler=two;
//                two=three;
//                three=handler;
//                deadSpace=2;
//            }
//            previus=0;
//        }
//
//        if(checkForVictory()==true)
//        {
//            Victory();
//        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    private void Victory()
    {
        bottomRight.setBackgroundResource(R.drawable.bottomright);

        Toast toast = Toast.makeText(this,"Puzzle Complete",Toast.LENGTH_LONG);
        toast.show();
        finish();
    }

    public boolean checkForVictory()
    {
        Log.d("One is "+one, "checkForVictory: ");
        Log.d("Two is "+two, "checkForVictory: ");
        Log.d("Three is "+three, "checkForVictory: ");
        Log.d("Four is "+four, "checkForVictory: ");
        Log.d("Five is "+five, "checkForVictory: ");
        Log.d("Six is "+six, "checkForVictory: ");
        Log.d("Seven is "+seven, "checkForVictory: ");
        Log.d("Eight is "+eight, "checkForVictory: ");
        Log.d("Nine is "+nine, "checkForVictory: ");
        if(one==R.drawable.bottomleft && two==R.drawable.bottommiddle && three==R.drawable.black && four==R.drawable.centerleft && five==R.drawable.centermiddle && six==R.drawable.centerright && seven==R.drawable.topleft && eight==R.drawable.topmiddle && nine==R.drawable.topright)
        {
            Log.d("You Win", "checkForVictory: Finish");
            return true;
        }
        return false;
    }

}
