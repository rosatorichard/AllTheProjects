package com.batchmates.android.services;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private MyReceiver myReciever;
    IntentFilter intentFilter=new IntentFilter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView)findViewById(R.id.tvToChange);
        myReciever= new MyReceiver(text);
    }

    public void serviceStarter(View view) {

        Intent intent=new Intent(this,MyService.class);
        startService(intent);
    }

    public void startIntentService(View view) {

        Intent intent=new Intent(this,MyIntentService.class);
        intent.putExtra("Extra","We passed properly");
        startService(intent);
//        Threader threader=new Threader(this);
//        threader.start();
    }

    public void stopService(View view) {

        Log.d("Clicked", "stopService: Clicked");
        Intent intent=new Intent(this,IntentServiceTry.class);
        intent.putExtra("Extra","We passed properly");;
        startService(intent);


    }

    @Override
    protected void onStart() {
        super.onStart();
        intentFilter.addAction("com.batchmates.android.services");
        registerReceiver(myReciever,intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(myReciever);
    }

    public void updateText(String s)
    {
        text.setText(s);
    }

}
