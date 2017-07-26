package com.batchmates.android.scramblepuzzle;

import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class FourByFour extends AppCompatActivity {

    private ImageButton topLeft,topMiddle,topRight,topRightTwo,centerLeft,centerMiddle,centerRight, centerRightTwo,bottomLeft,bottomMiddle,bottomRight,bottomRightTwo;
    private ImageButton fourbottomLeft, fourbottomMiddle, fourbottomRight, fourbottomRightTwo;

    //all the drawables

    //bottom row drawables
    private int one=R.drawable.four_bottomtwoleft;
    private int two=R.drawable.four_bottomtwomiddle;
    private int three=R.drawable.four_bottomtworight;
    private int four=R.drawable.four_black;

    //second row drawable
    private int five=R.drawable.four_bottomleft;
    private int six=R.drawable.four_bottommiddle;
    private int seven=R.drawable.four_bottomright;
    private int eight=R.drawable.four_bottomrighttwo;

    //third row drawable
    private int nine=R.drawable.four_centerleft;
    private int ten=R.drawable.four_centermiddle;
    private int eleven=R.drawable.four_centerright;
    private int twelve=R.drawable.four_centerrighttwo;

    //top row
    private int thirteen=R.drawable.four_topleft;
    private int fourteen=R.drawable.four_topmiddle;
    private int fifteen=R.drawable.four_topright;
    private int sixteen=R.drawable.four_toprighttwo;

    //handler
    private int handler=0;

    private int selected=0;
    private int deadSpace=4;
    private int previus=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_by_four);

        topLeft =(ImageButton)findViewById(R.id.imgBtnTopLeft);
        topMiddle =(ImageButton)findViewById(R.id.imgBtnTopMiddle);
        topRight =(ImageButton)findViewById(R.id.imgBtnTopRight);
        topRightTwo=(ImageButton)findViewById(R.id.imgBtnTopRightTwo);

        centerLeft =(ImageButton)findViewById(R.id.imgBtnCenterLeft);
        centerMiddle =(ImageButton)findViewById(R.id.imgBtnCenterMiddle);
        centerRight =(ImageButton)findViewById(R.id.imgBtnCenterRight);
        centerRightTwo=(ImageButton)findViewById(R.id.imgBtnCenterRightTwo);

        bottomLeft =(ImageButton)findViewById(R.id.imgBtnBottomLeft);
        bottomMiddle =(ImageButton)findViewById(R.id.imgBtnBottomMiddle);
        bottomRight =(ImageButton)findViewById(R.id.imgBtnBottomRight);
        bottomRightTwo=(ImageButton)findViewById(R.id.imgBtnBottomRightTwo);

        fourbottomLeft=(ImageButton)findViewById(R.id.imgBtnBottomTwoLeft);
        fourbottomMiddle=(ImageButton)findViewById(R.id.imgBtnBottomTwoMiddle);
        fourbottomRight=(ImageButton)findViewById(R.id.imgBtnBottomTwoRight);
        fourbottomRightTwo=(ImageButton)findViewById(R.id.imgBtnBottomTwoRightTwo);

        random();

        topLeft.setBackgroundResource(thirteen);
        topMiddle.setBackgroundResource(fourteen);
        topRight.setBackgroundResource(fifteen);
        topRightTwo.setBackgroundResource(sixteen);

        centerLeft.setBackgroundResource(nine);
        centerMiddle.setBackgroundResource(ten);
        centerRight.setBackgroundResource(eleven);
        centerRightTwo.setBackgroundResource(twelve);

        bottomLeft.setBackgroundResource(five);
        bottomMiddle.setBackgroundResource(six);
        bottomRight.setBackgroundResource(seven);
        bottomRightTwo.setBackgroundResource(eight);

        fourbottomLeft.setBackgroundResource(one);
        fourbottomMiddle.setBackgroundResource(two);
        fourbottomRight.setBackgroundResource(three);
        fourbottomRightTwo.setBackgroundResource(four);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setShowHideAnimationEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void random()
    {
        int roller=0;
        for (int i = 0; i < 256; i++)
        {
            roller=(int)Math.floor(Math.random()*2);

            switch (deadSpace)
            {
                case 1:
                    if(roller==1)
                    {
                        handler=one;
                        one=two;
                        two=handler;
                        deadSpace=2;
                    }
                    else
                    {
                        handler=one;
                        one=five;
                        five=handler;
                        deadSpace=5;
                    }
                    break;

                case 2:
                    if(roller==1)
                    {
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
                            handler = two;
                            two = three;
                            three = handler;
                            deadSpace = 3;
                        }
                        else
                        {
                            handler = two;
                            two = six;
                            six = handler;
                            deadSpace = 6;
                        }
                    }
                    break;

                case 3:
                    if(roller==1)
                    {
                        handler=three;
                        three=two;
                        two=handler;
                        deadSpace=2;
                    }
                    else
                    {
                        roller=(int)Math.floor(Math.random()*2);
                        if(roller==1)
                        {
                            handler=three;
                            three=seven;
                            seven=handler;
                            deadSpace=7;
                        }
                        else
                        {
                            handler = three;
                            three = four;
                            four = handler;
                            deadSpace = 4;
                        }
                    }
                    break;

                case 4:
                    if(roller==1)
                    {
                        handler=four;
                        four=three;
                        three=handler;
                        deadSpace=3;
                    }
                    else
                    {
                        handler=four;
                        four=eight;
                        eight=handler;
                        deadSpace=8;
                    }
                    break;

                case 5:

                    if(roller==1)
                    {
                        handler=five;
                        five=one;
                        one=handler;
                        deadSpace=1;
                    }
                    else
                    {
                        roller=(int)Math.floor(Math.random()*2);
                        if(roller==1)
                        {
                            handler=five;
                            five=nine;
                            nine=handler;
                            deadSpace=9;
                        }
                        else
                        {
                            handler=five;
                            five=six;
                            six=handler;
                            deadSpace=6;
                        }
                    }
                    break;

                case 6:

                    if(roller==1)
                    {
                        roller=(int)Math.floor(Math.random()*2);
                        if(roller==1)
                        {
                            handler=six;
                            six=five;
                            five=handler;
                            deadSpace=5;
                        }
                        else
                        {
                            handler=six;
                            six=ten;
                            ten=handler;
                            deadSpace=10;
                        }
                    }
                    else
                    {
                        roller=(int)Math.floor(Math.random()*2);
                        if(roller==1)
                        {
                            handler=six;
                            six=seven;
                            seven=handler;
                            deadSpace=7;
                        }
                        else
                        {
                            handler=six;
                            six=two;
                            two=handler;
                            deadSpace=2;
                        }
                    }
                    break;

                case 7:

                    if(roller==1)
                    {
                        roller=(int)Math.floor(Math.random()*2);
                        if(roller==1)
                        {
                            handler=seven;
                            seven=six;
                            six=handler;
                            deadSpace=6;
                        }
                        else
                        {
                            handler=seven;
                            seven=eleven;
                            eleven=handler;
                            deadSpace=11;
                        }
                    }
                    else
                    {
                        roller=(int)Math.floor(Math.random()*2);
                        if(roller==1)
                        {
                            handler=seven;
                            seven=eight;
                            eight=handler;
                            deadSpace=8;
                        }
                        else
                        {
                            handler=seven;
                            seven=three;
                            three=handler;
                            deadSpace=3;
                        }
                    }
                    break;

                case 8:
                    if(roller==1)
                    {
                        handler=eight;
                        eight=four;
                        four=handler;
                        deadSpace=4;
                    }
                    else
                    {
                        roller=(int)Math.floor(Math.random()*2);
                        if(roller==1)
                        {
                            handler=eight;
                            eight=twelve;
                            twelve=handler;
                            deadSpace=12;
                        }
                        else
                        {
                            handler=eight;
                            eight=seven;
                            seven=handler;
                            deadSpace=7;
                        }
                    }
                    break;

                case 9:

                    if(roller==1)
                    {
                        handler=nine;
                        nine=five;
                        five=handler;
                        deadSpace=5;
                    }
                    else
                    {
                        roller=(int)Math.floor(Math.random()*2);
                        if(roller==1)
                        {
                            handler=nine;
                            nine=thirteen;
                            thirteen=handler;
                            deadSpace=13;
                        }
                        else
                        {
                            handler=nine;
                            nine=ten;
                            ten=handler;
                            deadSpace=10;
                        }
                    }
                    break;

                case 10:

                    if(roller==1)
                    {
                        roller=(int)Math.floor(Math.random()*2);
                        if(roller==1)
                        {
                            handler=ten;
                            ten=six;
                            six=handler;
                            deadSpace=6;
                        }
                        else
                        {
                            handler=ten;
                            ten=nine;
                            nine=handler;
                            deadSpace=9;
                        }
                    }
                    else
                    {
                        roller=(int)Math.floor(Math.random()*2);
                        if(roller==1)
                        {
                            handler=ten;
                            ten=fourteen;
                            fourteen=handler;
                            deadSpace=14;
                        }
                        else
                        {
                            handler=ten;
                            ten=eleven;
                            eleven=handler;
                            deadSpace=11;
                        }
                    }
                    break;

                case 11:

                    if(roller==1)
                    {
                        roller=(int)Math.floor(Math.random()*2);
                        if(roller==1)
                        {
                            handler=eleven;
                            eleven=ten;
                            ten=handler;
                            deadSpace=10;
                        }
                        else
                        {
                            handler=eleven;
                            eleven=fifteen;
                            fifteen=handler;
                            deadSpace=15;
                        }
                    }
                    else
                    {
                        roller=(int)Math.floor(Math.random()*2);
                        if(roller==1)
                        {
                            handler=eleven;
                            eleven=twelve;
                            twelve=handler;
                            deadSpace=12;
                        }
                        else
                        {
                            handler=eleven;
                            eleven=seven;
                            seven=handler;
                            deadSpace=7;
                        }
                    }
                    break;

                case 12:

                    if(roller==1)
                    {
                        handler=twelve;
                        twelve=eleven;
                        eleven=handler;
                        deadSpace=11;
                    }
                    else
                    {
                        roller=(int)Math.floor(Math.random()*2);
                        if(roller==1)
                        {
                            handler=twelve;
                            twelve=sixteen;
                            sixteen=handler;
                            deadSpace=16;
                        }
                        else
                        {
                            handler=twelve;
                            twelve=eight;
                            eight=handler;
                            deadSpace=8;
                        }
                    }
                    break;

                case 13:

                    if(roller==1)
                    {
                        handler=thirteen;
                        thirteen=fourteen;
                        fourteen=handler;
                        deadSpace=14;
                    }
                    else
                    {
                        handler=thirteen;
                        thirteen=nine;
                        nine=handler;
                        deadSpace=9;
                    }
                    break;

                case 14:

                    if(roller==1)
                    {
                        handler=fourteen;
                        fourteen=thirteen;
                        thirteen=handler;
                        deadSpace=13;
                    }
                    else
                    {
                        roller=(int)Math.floor(Math.random()*2);
                        if(roller==1)
                        {
                            handler=fourteen;
                            fourteen=fifteen;
                            fifteen=handler;
                            deadSpace=15;
                        }
                        else
                        {
                            handler=fourteen;
                            fourteen=ten;
                            ten=handler;
                            deadSpace=10;
                        }
                    }
                    break;

                case 15:

                    if(roller==1)
                    {
                        handler=fifteen;
                        fifteen=fourteen;
                        fourteen=handler;
                        deadSpace=14;
                    }
                    else
                    {
                        roller=(int)Math.floor(Math.random()*2);
                        if(roller==1)
                        {
                            handler=fifteen;
                            fifteen=sixteen;
                            sixteen=handler;
                            deadSpace=16;
                        }
                        else
                        {
                            handler=fifteen;
                            fifteen=eleven;
                            eleven=handler;
                            deadSpace=11;
                        }
                    }
                    break;

                case 16:

                    if(roller==1)
                    {
                        handler=sixteen;
                        sixteen=fifteen;
                        fifteen=handler;
                        deadSpace=15;
                    }
                    else
                    {
                        handler=sixteen;
                        sixteen=twelve;
                        twelve=handler;
                        deadSpace=12;
                    }
                    break;
            }
        }

    }



    //top row
    public void topLeft(View view) {
        selected=13;

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        if(selected!=deadSpace)
        {
            previus =13;
        }

        switch (deadSpace)
        {
            case 14:
                view.setBackgroundResource(fourteen);
                topMiddle.setBackgroundResource(thirteen);
                handler=thirteen;
                thirteen=fourteen;
                fourteen=handler;
                deadSpace=selected;
                break;

            case 9:
                view.setBackgroundResource(nine);
                centerLeft.setBackgroundResource(thirteen);
                handler=thirteen;
                thirteen=nine;
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
    }

    public void topMiddle(View view) {

        selected=14;

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        if(selected!=deadSpace)
        {
            previus =14;
        }

        switch (deadSpace)
        {
            case 13:
                view.setBackgroundResource(thirteen);
                topLeft.setBackgroundResource(fourteen);
                handler=thirteen;
                thirteen=fourteen;
                fourteen=handler;
                deadSpace=14;
                break;

            case 10:
                view.setBackgroundResource(ten);
                centerMiddle.setBackgroundResource(fourteen);
                handler=ten;
                ten=fourteen;
                fourteen=handler;
                deadSpace=14;
                break;

            case 15:
                view.setBackgroundResource(fifteen);
                topRight.setBackgroundResource(fourteen);
                handler=fifteen;
                fifteen=fourteen;
                fourteen=handler;
                deadSpace=14;
                break;

            default:
                Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
    }

    public void topRight(View view) {

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        selected=15;


        if(selected!=deadSpace)
        {
            previus =15;
        }

        switch (deadSpace)
        {
            case 14:
                view.setBackgroundResource(fourteen);
                topMiddle.setBackgroundResource(fifteen);
                handler=fourteen;
                fourteen=fifteen;
                fifteen=handler;
                deadSpace=15;
                break;

            case 16:
                view.setBackgroundResource(sixteen);
                topRightTwo.setBackgroundResource(fifteen);
                handler=sixteen;
                sixteen=fifteen;
                fifteen=handler;
                deadSpace=15;
                break;

            case 11:
                view.setBackgroundResource(eleven);
                centerRight.setBackgroundResource(fifteen);
                handler=fifteen;
                fifteen=eleven;
                eleven=handler;
                deadSpace=15;
                break;

            default:
                Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
    }

    public void topRightTwo(View view) {

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        selected=16;


        if(selected!=deadSpace)
        {
            previus =16;
        }

        switch (deadSpace)
        {
            case 15:
                view.setBackgroundResource(fifteen);
                topRight.setBackgroundResource(sixteen);
                handler=sixteen;
                sixteen=fifteen;
                fifteen=handler;
                deadSpace=selected;
                break;

            case 12:
                view.setBackgroundResource(twelve);
                centerRightTwo.setBackgroundResource(sixteen);
                handler=sixteen;
                sixteen=twelve;
                twelve=handler;
                deadSpace=selected;
                break;

            default:
                Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
    }


    //third row from bottom
    public void centerLeft(View view) {

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        selected=9;


        if(selected!=deadSpace)
        {
            previus =9;
        }

        switch (deadSpace)
        {
            case 13:
                view.setBackgroundResource(thirteen);
                topLeft.setBackgroundResource(nine);
                handler=nine;
                nine=thirteen;
                thirteen=handler;
                deadSpace=selected;
                break;

            case 10:
                view.setBackgroundResource(ten);
                centerMiddle.setBackgroundResource(nine);
                handler=nine;
                nine=ten;
                ten=handler;
                deadSpace=selected;
                break;

            case 5:
                view.setBackgroundResource(five);
                bottomLeft.setBackgroundResource(nine);
                handler=nine;
                nine=five;
                five=handler;
                deadSpace=selected;
                break;

            default:
                Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
    }

    public void centerMiddle(View view) {

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        selected=10;


        if(selected!=deadSpace)
        {
            previus =10;
        }

        switch (deadSpace)
        {
            case 9:
                view.setBackgroundResource(nine);
                centerLeft.setBackgroundResource(ten);
                handler=ten;
                ten=nine;
                nine=handler;
                deadSpace=selected;
                break;

            case 11:
                view.setBackgroundResource(eleven);
                centerRight.setBackgroundResource(ten);
                handler=ten;
                ten=eleven;
                eleven=handler;
                deadSpace=selected;
                break;

            case 14:
                Log.d(" swap" + deadSpace+" "+selected, "centerMiddle: Something");
                view.setBackgroundResource(fourteen);
                topMiddle.setBackgroundResource(ten);
                handler=ten;
                ten=fourteen;
                fourteen=handler;
                deadSpace=selected;
                break;

            case 6:
                view.setBackgroundResource(six);
                bottomMiddle.setBackgroundResource(ten);
                handler=ten;
                ten=six;
                six=handler;
                deadSpace=selected;
                break;

            default:
                Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
    }

    public void centerRight(View view) {

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        selected=11;


        if(selected!=deadSpace)
        {
            previus =11;
        }

        switch (deadSpace)
        {
            case 10:
                view.setBackgroundResource(ten);
                centerMiddle.setBackgroundResource(eleven);
                handler=eleven;
                eleven=ten;
                ten=handler;
                deadSpace=selected;
                break;

            case 12:
                view.setBackgroundResource(twelve);
                centerRightTwo.setBackgroundResource(eleven);
                handler=eleven;
                eleven=twelve;
                twelve=handler;
                deadSpace=selected;
                break;

            case 15:
                view.setBackgroundResource(fifteen);
                topRight.setBackgroundResource(eleven);
                handler=eleven;
                eleven=fifteen;
                fifteen=handler;
                deadSpace=selected;
                break;

            case 7:
                view.setBackgroundResource(seven);
                bottomRight.setBackgroundResource(eleven);
                handler=eleven;
                eleven=seven;
                seven=handler;
                deadSpace=selected;
                break;

            default:
                Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
    }

    public void centerRighttwo(View view) {

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        selected=12;


        if(selected!=deadSpace)
        {
            previus =12;
        }

        switch (deadSpace)
        {
            case 11:
                view.setBackgroundResource(eleven);
                centerRight.setBackgroundResource(twelve);
                handler=twelve;
                twelve=eleven;
                eleven=handler;
                deadSpace=selected;
                break;

            case 16:
                view.setBackgroundResource(sixteen);
                topRightTwo.setBackgroundResource(twelve);
                handler=twelve;
                twelve=sixteen;
                sixteen=handler;
                deadSpace=selected;
                break;

            case 8:
                view.setBackgroundResource(eight);
                bottomRightTwo.setBackgroundResource(twelve);
                handler=twelve;
                twelve=eight;
                eight=handler;
                deadSpace=selected;
                break;

            default:
                Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
    }


    //second row from bottom
    public void bottomLeft(View view) {

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        selected=5;


        if(selected!=deadSpace)
        {
            previus =5;
        }

        switch (deadSpace)
        {
            case 6:
                view.setBackgroundResource(six);
                bottomMiddle.setBackgroundResource(five);
                handler=five;
                five=six;
                six=handler;
                deadSpace=selected;
                break;

            case 1:
                view.setBackgroundResource(one);
                fourbottomLeft.setBackgroundResource(five);
                handler=five;
                five=one;
                one=handler;
                deadSpace=selected;
                break;

            case 9:
                view.setBackgroundResource(nine);
                centerLeft.setBackgroundResource(five);
                handler=five;
                five=nine;
                nine=handler;
                deadSpace=selected;
                break;

            default:
                Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
    }

    public void bottomMiddle(View view) {

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        selected=6;


        if(selected!=deadSpace)
        {
            previus =6;
        }

        switch (deadSpace)
        {
            case 5:
                view.setBackgroundResource(five);
                bottomLeft.setBackgroundResource(six);
                handler=six;
                six=five;
                five=handler;
                deadSpace=selected;
                break;

            case 2:
                view.setBackgroundResource(two);
                fourbottomMiddle.setBackgroundResource(six);
                handler=six;
                six=two;
                two=handler;
                deadSpace=selected;
                break;

            case 7:
                view.setBackgroundResource(seven);
                bottomRight.setBackgroundResource(six);
                handler=six;
                six=seven;
                seven=handler;
                deadSpace=selected;
                break;

            case 10:
                view.setBackgroundResource(ten);
                centerMiddle.setBackgroundResource(six);
                handler=six;
                six=ten;
                ten=handler;
                deadSpace=selected;
                break;

            default:
                Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
    }

    public void bottomRight(View view) {

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        selected=7;


        if(selected!=deadSpace)
        {
            previus =7;
        }

        switch (deadSpace)
        {
            case 6:
                view.setBackgroundResource(six);
                bottomMiddle.setBackgroundResource(seven);
                handler=seven;
                seven=six;
                six=handler;
                deadSpace=selected;
                break;

            case 8:
                view.setBackgroundResource(eight);
                bottomRightTwo.setBackgroundResource(seven);
                handler=seven;
                seven=eight;
                eight=handler;
                deadSpace=selected;
                break;

            case 11:
                view.setBackgroundResource(eleven);
                centerRight.setBackgroundResource(seven);
                handler=seven;
                seven=eleven;
                eleven=handler;
                deadSpace=selected;
                break;

            case 3:
                view.setBackgroundResource(three);
                fourbottomRight.setBackgroundResource(seven);
                handler=seven;
                seven=three;
                three=handler;
                deadSpace=selected;
                break;

            default:
                Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
    }

    public void bottomRighttwo(View view) {

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        selected=8;


        if(selected!=deadSpace)
        {
            previus =8;
        }

        switch (deadSpace)
        {
            case 7:
                view.setBackgroundResource(seven);
                bottomRight.setBackgroundResource(eight);
                handler=eight;
                eight=seven;
                seven=handler;
                deadSpace=selected;
                break;

            case 12:
                view.setBackgroundResource(twelve);
                centerRightTwo.setBackgroundResource(eight);
                handler=eight;
                eight=twelve;
                twelve=handler;
                deadSpace=selected;
                break;

            case 4:
                view.setBackgroundResource(four);
                fourbottomRightTwo.setBackgroundResource(eight);
                handler=eight;
                eight=four;
                four=handler;
                deadSpace=selected;
                break;

            default:
                Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
    }




    //bottom four
    public void fourbottomLeft(View view) {

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        selected=1;


        if(selected!=deadSpace)
        {
            previus =1;
        }

        switch (deadSpace)
        {
            case 5:
                view.setBackgroundResource(five);
                bottomLeft.setBackgroundResource(one);
                handler=one;
                one=five;
                five=handler;
                deadSpace=selected;
                break;

            case 2:
                view.setBackgroundResource(two);
                fourbottomMiddle.setBackgroundResource(one);
                handler=one;
                one=two;
                two=handler;
                deadSpace=selected;
                break;

            default:
                Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
    }

    public void fourbottomMiddle(View view) {


        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        selected=2;


        if(selected!=deadSpace)
        {
            previus =2;
        }

        switch (deadSpace)
        {
            case 1:
                view.setBackgroundResource(one);
                fourbottomLeft.setBackgroundResource(two);
                handler=two;
                two=one;
                one=handler;
                deadSpace=selected;
                break;

            case 3:
                view.setBackgroundResource(three);
                fourbottomRight.setBackgroundResource(two);
                handler=two;
                two=three;
                three=handler;
                deadSpace=selected;
                break;

            case 6:
                view.setBackgroundResource(six);
                bottomMiddle.setBackgroundResource(two);
                handler=two;
                two=six;
                six=handler;
                deadSpace=selected;
                break;

            default:
                Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
    }

    public void fourbottomRight(View view) {

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        selected=3;


        if(selected!=deadSpace)
        {
            previus =3;
        }

        switch (deadSpace)
        {
            case 2:
                view.setBackgroundResource(two);
                fourbottomMiddle.setBackgroundResource(three);
                handler=three;
                three=two;
                two=handler;
                deadSpace=selected;
                break;

            case 4:
                view.setBackgroundResource(four);
                fourbottomRightTwo.setBackgroundResource(three);
                handler=three;
                three=four;
                four=handler;
                deadSpace=selected;
                break;

            case 7:
                view.setBackgroundResource(seven);
                bottomRight.setBackgroundResource(three);
                handler=three;
                three=seven;
                seven=handler;
                deadSpace=selected;
                break;

            default:
                Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
    }

    public void fourbottomRighttwo(View view) {

        Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
        selected=4;


        if(selected!=deadSpace)
        {
            previus =4;
        }

        switch (deadSpace)
        {
            case 3:
                view.setBackgroundResource(three);
                fourbottomRight.setBackgroundResource(four);
                handler=four;
                four=three;
                three=handler;
                deadSpace=selected;
                break;

            case 8:
                view.setBackgroundResource(eight);
                bottomRightTwo.setBackgroundResource(four);
                handler=four;
                four=eight;
                eight=handler;
                deadSpace=selected;
                break;

            default:
                Log.d(""+deadSpace+" "+ selected, "topLeft: Default");
                break;
        }
        if(checkForVictory()==true)
        {
            Victory();
        }
    }

    private void Victory()
    {
        fourbottomRightTwo.setBackgroundResource(R.drawable.four_bottomtworighttwo);

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
        //bottom row drawables

        if(one==R.drawable.four_bottomtwoleft && two==R.drawable.four_bottomtwomiddle && three==R.drawable.four_bottomtworight && four==R.drawable.four_black && five==R.drawable.four_bottomleft && six==R.drawable.four_bottommiddle && seven==R.drawable.four_bottomright && eight==R.drawable.four_bottomrighttwo && nine==R.drawable.four_centerleft && ten==R.drawable.four_centermiddle && eleven==R.drawable.four_centerright && twelve==R.drawable.four_centerrighttwo && thirteen==R.drawable.four_topleft && fourteen==R.drawable.four_topmiddle && fifteen==R.drawable.four_topright && sixteen==R.drawable.four_toprighttwo)
        {
            Log.d("You Win", "checkForVictory: Finish");
            return true;
        }
        return false;
    }

}
