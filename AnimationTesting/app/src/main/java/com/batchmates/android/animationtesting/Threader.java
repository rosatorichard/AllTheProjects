package com.batchmates.android.animationtesting;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

/**
 * Created by Android on 7/8/2017.
 */

public class Threader extends Thread{


    Context context;
    ImageView imageView;
    int direction;
    Handler handler=new Handler(Looper.getMainLooper());

    public Threader(Context context, ImageView imageView, int direction) {
        this.context = context;
        this.imageView = imageView;
        this.direction=direction;
    }

    @Override
    public void run() {
        super.run();

        switch (direction)
        {

            case 0:
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        imageView.animate().translationYBy(-200);

                    }
                });
                break;

            case 1:
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        imageView.animate().translationXBy(-200);
                    }
                });

                break;

            case 2:
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        imageView.animate().translationXBy(200);
                    }
                });
                break;

            case 3:
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        imageView.animate().translationYBy(200);
                    }
                });

                break;
        }

    }
}
