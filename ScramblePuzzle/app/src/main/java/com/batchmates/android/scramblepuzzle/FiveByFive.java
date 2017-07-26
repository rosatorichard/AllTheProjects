package com.batchmates.android.scramblepuzzle;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class FiveByFive extends AppCompatActivity {

    private int[] drawables= new int[30];
    private int[] winCondition=new int[30];
    private final static int SIZE=5;
    private ImageButton[] imageButtons= new ImageButton[30];
    private int handler=0;
    private int deadspace=5;
    private int below=0;
    private int above=0;
    private int left=0;
    boolean swap;
    private int right=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_by_five);

        imageButtons[1]=(ImageButton)findViewById(R.id.one);
        imageButtons[2]=(ImageButton)findViewById(R.id.two);
        imageButtons[3]=(ImageButton)findViewById(R.id.three);
        imageButtons[4]=(ImageButton)findViewById(R.id.four);
        imageButtons[5]=(ImageButton)findViewById(R.id.five);
        imageButtons[6]=(ImageButton)findViewById(R.id.six);
        imageButtons[7]=(ImageButton)findViewById(R.id.seven);
        imageButtons[8]=(ImageButton)findViewById(R.id.eight);
        imageButtons[9]=(ImageButton)findViewById(R.id.nine);
        imageButtons[10]=(ImageButton)findViewById(R.id.ten);
        imageButtons[11]=(ImageButton)findViewById(R.id.eleven);
        imageButtons[12]=(ImageButton)findViewById(R.id.twelve);
        imageButtons[13]=(ImageButton)findViewById(R.id.thirteen);
        imageButtons[14]=(ImageButton)findViewById(R.id.fourteen);
        imageButtons[15]=(ImageButton)findViewById(R.id.fifteen);
        imageButtons[16]=(ImageButton)findViewById(R.id.sixteen);
        imageButtons[17]=(ImageButton)findViewById(R.id.seventeen);
        imageButtons[18]=(ImageButton)findViewById(R.id.eightteen);
        imageButtons[19]=(ImageButton)findViewById(R.id.nineteen);
        imageButtons[20]=(ImageButton)findViewById(R.id.twenty);
        imageButtons[21]=(ImageButton)findViewById(R.id.twentyOne);
        imageButtons[22]=(ImageButton)findViewById(R.id.twentyTwo);
        imageButtons[23]=(ImageButton)findViewById(R.id.twentyThree);
        imageButtons[24]=(ImageButton)findViewById(R.id.twentyFour);
        imageButtons[25]=(ImageButton)findViewById(R.id.twentyFive);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setShowHideAnimationEnabled(true);

        drawables[1]=R.drawable.five_partone;
        drawables[2]=R.drawable.five_parttwo;
        drawables[3]=R.drawable.five_partthree;
        drawables[4]=R.drawable.five_partfour;
        drawables[5]=R.drawable.four_black;
        drawables[6]=R.drawable.five_partsix;
        drawables[7]=R.drawable.five_partseven;
        drawables[8]=R.drawable.five_parteight;
        drawables[9]=R.drawable.five_partnine;
        drawables[10]=R.drawable.five_partten;
        drawables[11]=R.drawable.five_parteleven;
        drawables[12]=R.drawable.five_parttwelve;
        drawables[13]=R.drawable.five_partthirteen;
        drawables[14]=R.drawable.five_partfourteen;
        drawables[15]=R.drawable.five_partfifteen;
        drawables[16]=R.drawable.five_partsixteen;
        drawables[17]=R.drawable.five_partseventeen;
        drawables[18]=R.drawable.five_parteightteen;
        drawables[19]=R.drawable.five_partnineteen;
        drawables[20]=R.drawable.five_parttwenty;
        drawables[21]=R.drawable.five_parttwentyone;
        drawables[22]=R.drawable.five_parttwenttytwo;
        drawables[23]=R.drawable.five_parttwentythree;
        drawables[24]=R.drawable.five_parttwentyfour;
        drawables[25]=R.drawable.five_parttwentyfive;

        for (int i = 1; i <26 ; i++) {
            winCondition[i]=drawables[i];

        }

        //625
        for (int i = 0; i < 625 ; i++) {

            randomFunction(deadspace);

        }


        for (int i = 1; i <26 ; i++) {
            imageButtons[i].setBackgroundResource(drawables[i]);

        }

    }


    public void randomFunction(int dead)
    {
        below=dead-SIZE;
        above=dead+SIZE;
        left=dead-1;
        right=dead+1;

        if(dead==5 ||dead==10 ||dead==15 || dead==20 || dead==25)
        {
            right=0;
        }
        if(dead==1 || dead==6 ||dead ==11 || dead==16 ||dead ==21)
        {
            left=0;
        }
        if(dead==1 ||dead==2 || dead ==3 || dead== 4 || dead ==5)
        {
            below=0;
        }
        if(dead==21 || dead==22 || dead==23 ||dead==24 || dead==25)
        {
            above=0;
        }


        swap=false;
        int roller=0;
        do {
            roller = (int) Math.floor(Math.random() * 4);

            //Log.d("birth", "randomFunction: roller: " + roller + " left: " + left + " right: " + right + " up: " + above + " below:" + below + " dead: " + dead);
            if (roller == 0 && left != 0) {
//                imageButtons[dead].setBackgroundResource(drawables[left]);
//                imageButtons[left].setBackgroundResource(drawables[dead]);
                handler = drawables[left];
                drawables[left] = drawables[dead];
                drawables[dead] = handler;
                deadspace = left;
                swap=true;
            }

            if (roller == 1 && right != 0) {
//                imageButtons[dead].setBackgroundResource(drawables[right]);
//                imageButtons[right].setBackgroundResource(drawables[dead]);
                handler = drawables[right];
                drawables[right] = drawables[dead];
                drawables[dead] = handler;
                deadspace = right;
                swap=true;
            }

            if (roller == 2 && above != 0) {
//                imageButtons[dead].setBackgroundResource(drawables[above]);
//                imageButtons[above].setBackgroundResource(drawables[dead]);
                handler = drawables[above];
                drawables[above] = drawables[dead];
                drawables[dead] = handler;
                deadspace = above;
                swap=true;
            }

            if (roller == 3 && below != 0) {
//                imageButtons[dead].setBackgroundResource(drawables[below]);
//                imageButtons[below].setBackgroundResource(drawables[dead]);
                handler = drawables[below];
                drawables[below] = drawables[dead];
                drawables[dead] = handler;
                deadspace = below;
                swap=true;
            }
            //Log.d("is true", "randomFunction: "+swap);
        }while(swap==false);
    }
    



    //swap function
    public void swap(int selected, View view)
    {


        below=selected-SIZE;
        above=selected+SIZE;
        left=selected-1;
        right=selected+1;


        //must change for size changes
        if(selected==5 ||selected==10 ||selected==15 || selected==20 || selected==25)
        {
            right=0;
        }
        if(selected==1 || selected==6 ||selected ==11 || selected==16 ||selected ==21)
        {
            left=0;
        }
        if(selected==1 ||selected==2 || selected ==3 || selected== 4 || selected ==5)
        {
            below=0;
        }
        if(selected==21 || selected==22 || selected==23 ||selected==24 || selected==25)
        {
            above=0;
        }

        //Log.d("", "swap: Left"+left+" Right "+right+" up"+above+" below"+below);
        if(above==deadspace)
        {
            view.setBackgroundResource(drawables[above]);
            imageButtons[above].setBackgroundResource(drawables[selected]);
            handler=drawables[above];
            drawables[above]=drawables[selected];
            drawables[selected]=handler;
            deadspace=selected;
        }


        if(right==deadspace)
        {
            view.setBackgroundResource(drawables[right]);
            imageButtons[right].setBackgroundResource(drawables[selected]);
            handler=drawables[right];
            drawables[right]=drawables[selected];
            drawables[selected]=handler;
            deadspace=selected;
        }

        if(left==deadspace)
        {
            view.setBackgroundResource(drawables[left]);
            imageButtons[left].setBackgroundResource(drawables[selected]);
            handler=drawables[left];
            drawables[left]=drawables[selected];
            drawables[selected]=handler;
            deadspace=selected;
        }

        if(below==deadspace)
        {
            view.setBackgroundResource(drawables[below]);
            imageButtons[below].setBackgroundResource(drawables[selected]);
            handler=drawables[below];
            drawables[below]=drawables[selected];
            drawables[selected]=handler;
            deadspace=selected;
        }


        if(win()==true)
        {
            imageButtons[SIZE].setBackgroundResource(R.drawable.five_partfive);
            Toast.makeText(this,"Puzzle Complete",Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    private boolean win() {

        for (int i = 1; i <26 ; i++) {

            if(winCondition[i]!=drawables[i])
            {
                return false;
            }
        }
        return true;
    }

    public void clickBegins(View view) {

        Log.d("this", "clickBegins: "+view.getId());
        switch(view.getId())
        {
            case R.id.one:
                swap(1,view);
                Log.d("one", "clickBegins: "+view.getId());
                break;

            case R.id.two:
                swap(2,view);
                Log.d("two", "clickBegins: "+view.getId());
                break;

            case R.id.three:
                swap(3,view);
                Log.d("three", "clickBegins: "+view.getId());
                break;

            case R.id.four:
                swap(4,view);
                Log.d("four", "clickBegins: "+view.getId());
                break;

            case R.id.five:
                swap(5,view);
                Log.d("five", "clickBegins: "+view.getId());
                break;

            case R.id.six:
                swap(6,view);
                Log.d("six", "clickBegins: "+view.getId());
                break;

            case R.id.seven:
                swap(7,view);
                Log.d("twentyone", "clickBegins: "+view.getId());
                break;

            case R.id.eight:
                swap(8,view);
                Log.d("eight", "clickBegins: "+view.getId());
                break;

            case R.id.nine:
                swap(9,view);
                Log.d("nine", "clickBegins: "+view.getId());
                break;

            case R.id.ten:
                swap(10,view);
                Log.d("ten", "clickBegins: "+view.getId());
                break;

            case R.id.eleven:
                swap(11,view);
                Log.d("eleven", "clickBegins: "+view.getId());
                break;

            case R.id.twelve:
                swap(12,view);
                Log.d("twelve", "clickBegins: "+view.getId());
                break;

            case R.id.thirteen:
                swap(13,view);
                Log.d("thirteen", "clickBegins: "+view.getId());
                break;

            case R.id.fourteen:
                swap(14,view);
                Log.d("fourteen", "clickBegins: "+view.getId());
                break;

            case R.id.fifteen:
                swap(15,view);
                Log.d("fifteen", "clickBegins: "+view.getId());
                break;

            case R.id.sixteen:
                swap(16,view);
                Log.d("sixteen", "clickBegins: "+view.getId());
                break;

            case R.id.seventeen:
                swap(17,view);
                Log.d("seventeen", "clickBegins: "+view.getId());
                break;

            case R.id.eightteen:
                swap(18,view);
                Log.d("eighteen", "clickBegins: "+view.getId());
                break;

            case R.id.nineteen:
                swap(19,view);
                Log.d("nineteen", "clickBegins: "+view.getId());
                break;

            case R.id.twenty:
                swap(20,view);
                Log.d("twenty", "clickBegins: "+view.getId());
                break;


            case R.id.twentyOne:
                swap(21,view);
                Log.d("twentyone", "clickBegins: "+view.getId());
                break;

            case R.id.twentyTwo:
                swap(22,view);
                Log.d("twentytwo", "clickBegins: "+view.getId());
                break;

            case R.id.twentyThree:
                swap(23,view);
                Log.d("twentythree", "clickBegins: "+view.getId());
                break;

            case R.id.twentyFour:
                swap(24,view);
                Log.d("twentyfour", "clickBegins: "+view.getId());
                break;
            case R.id.twentyFive:
                swap(25,view);
                Log.d("twentyfive", "clickBegins: "+view.getId());
                break;



        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void returnedDrawable(int[] draw)
    {
        drawables=draw;
    }

}
