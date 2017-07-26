package com.batchmates.android.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    private static final String TAG = "Reciever";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.d(TAG, "onReceive: "+ "Hit the button");

        switch (intent.getAction())
        {
            case "com.batchmates.android.broadcastreciever":
                break;

            case "Thread_Intent":
                Log.d(TAG, "onReceive: Thread_Intent");
                String data=intent.getStringExtra("EXTRA_DOIT");
                Toast.makeText(context,data,Toast.LENGTH_SHORT).show();
                break;
        }
        //String data=intent.getStringExtra("EXTRA_DOIT");

        //Toast.makeText(context,data,Toast.LENGTH_SHORT).show();
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
