package com.batchmates.android.services;

import android.app.IntentService;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Android on 7/6/2017.
 */

public class IntentServiceTry extends IntentService {

    private String s;
    public IntentServiceTry() {
        super("IntentServiceTry");
    }

    @Override
    protected void onHandleIntent( Intent intent) {


        Log.d("Heere i am", "onHandleIntent: MAde IT");
        s=intent.getStringExtra("Extra");


        Intent intent1=new Intent("com.batchmates.android.services");
        intent1.putExtra("Extra",s);
        sendBroadcast(intent1);

//        unregisterReceiver(myReceiver);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
