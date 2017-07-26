package com.batchmates.android.broadreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.NotificationCompat;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    private static final String TAG = "The Second Reciever";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        String s=intent.getStringExtra("EXTRA_DOIT");
        Log.d(TAG, "onReceive: We Have Connection"+s);
//        NotificationCompat.Builder builder=(NotificationCompat.Builder) new NotificationCompat.Builder(this).setContentTitle("Other App")
//                .setContentText("Come to us").setSmallIcon(R.mipmap.ic_launcher);
//
//        Intent intent1=new Intent();
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
