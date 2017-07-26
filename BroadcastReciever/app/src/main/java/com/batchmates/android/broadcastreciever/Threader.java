package com.batchmates.android.broadcastreciever;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.EditText;

/**
 * Created by Android on 7/5/2017.
 */

public class Threader extends Thread{
    private Context context;
    private EditText editText;


    public Threader(Context context, EditText editText) {
        this.context = context;
        this.editText = editText;
    }

    @Override
    public void run() {
        super.run();

        MyReceiver receiver=new MyReceiver();
        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction("Thread_Intent");
        context.registerReceiver(receiver,intentFilter);

        Intent intent=new Intent("Thread_Intent2");
        intent.putExtra("EXTRA_DOIT",editText.getText().toString());
//        intent.addCategory(Manifest.permission.SEND_SMS);
        context.sendBroadcast(intent,Manifest.permission.SEND_SMS);



    }
}
