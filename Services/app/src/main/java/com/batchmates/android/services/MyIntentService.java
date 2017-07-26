package com.batchmates.android.services;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class MyIntentService extends IntentService {


    private String s;
    private static final String TAG = "Intent Service";

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        for (int i = 0; i <10 ; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            s=intent.getStringExtra("Extra");
            Log.d(TAG, "onStartCommand: "+ "Sleep at "+ i +" Intent Service");

        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        stopSelf();
    }
}
