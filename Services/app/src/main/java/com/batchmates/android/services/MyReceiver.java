package com.batchmates.android.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyReceiver extends BroadcastReceiver {

    private TextView text;
    private String s;


    public MyReceiver(TextView text) {
        this.text = text;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        s=intent.getStringExtra("Extra");
        Log.d("MyReciever", "onReceive: "+s);

        text.setText(s);
//        MainActivity main=new MainActivity();
//        text=(TextView)main.findViewById(R.id.tvToChange);
//        text.setText(s);
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
