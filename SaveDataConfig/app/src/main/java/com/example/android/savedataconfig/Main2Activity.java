package com.example.android.savedataconfig;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    private TextView tvText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvText2 =(TextView)findViewById(R.id.tvText2);


        Intent intent = getIntent();
        String string =intent.getStringExtra("tvText");

        tvText2.setText(string);
    }

    public void sendText(View view) {

        String string =tvText2.getText().toString();
        Intent sendIntent = new Intent();

        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT,string);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}
