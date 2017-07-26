package com.batchmates.android.broadreciever;

import android.Manifest;
import android.content.IntentFilter;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        MyReceiver receiver=new MyReceiver();
        IntentFilter intentFilter=new IntentFilter();

        intentFilter.addAction("Thread_Intent2");
//        intentFilter.addCategory(Manifest.permission.SEND_SMS);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            registerReceiver(receiver,intentFilter, Integer.parseInt(Manifest.permission.SEND_SMS));
        }
    }
}
