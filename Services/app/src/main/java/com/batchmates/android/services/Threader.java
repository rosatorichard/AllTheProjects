package com.batchmates.android.services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Android on 7/6/2017.
 */

public class Threader extends Thread{

    Context context;


    public Threader(Context context) {
        this.context = context;
    }

    @Override
    public void run() {
        super.run();

        Intent intent=new Intent(context,MyService.class);
        MyService service=new MyService();

        service.startActivity(intent);

    }
}
