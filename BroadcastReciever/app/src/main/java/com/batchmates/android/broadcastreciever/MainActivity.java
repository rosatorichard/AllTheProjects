package com.batchmates.android.broadcastreciever;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String EXTRA = "EXTRA_DOIT";
    private EditText editText;
    private MyReceiver myReceiver;
    private IntentFilter intentFilter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.etEdit);
        myReceiver=new MyReceiver();
        intentFilter=new IntentFilter();
    }

    public void recieve(View view) {

        Intent intent=new Intent();
        intent.setAction("com.batchmates.android.broadcastreciever");
        intent.putExtra(EXTRA,editText.getText().toString());
        sendBroadcast(intent);
        Log.d("ButtonLove", "recieve: Yay Button");

    }

    @Override
    protected void onStart() {
        super.onStart();
        intentFilter.addAction("Not_Manifest");
        registerReceiver(myReceiver,intentFilter);
    }


    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(myReceiver);
    }


    public void notManifest(View view) {
        Intent intent=new Intent("Not_Manifest");
        intent.setAction("Not_Manifest");
        intent.putExtra(EXTRA,editText.getText().toString());
        sendBroadcast(intent);

    }

    public void threadClicker(View view) {

        Threader threader=new Threader(this,editText);
        //Thread thread=new Thread();
        threader.start();
        Snackbar.make(findViewById(R.id.linearLayout),"Snack",Snackbar.LENGTH_SHORT).show();
    }

    public void getFromReciever(String s)
    {
        Snackbar.make(findViewById(R.id.linearLayout),s,Snackbar.LENGTH_SHORT);
    }

}
