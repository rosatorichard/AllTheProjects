package com.batchmates.android.testredohelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView)findViewById(R.id.ivImage);

        imageView.setBackgroundResource(R.mipmap.ic_launcher);
        imageView.setImageResource(R.mipmap.ic_launcher);
    }
}
