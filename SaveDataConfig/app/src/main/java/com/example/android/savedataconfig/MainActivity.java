package com.example.android.savedataconfig;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText edText;
    private TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edText = (EditText)findViewById(R.id.etTextOne);
        tvText= (TextView)findViewById(R.id.tvText);

    }

    public void ChangeText(View view) {

        tvText.setText(edText.getText().toString());
        Intent intent =new Intent(MainActivity.this,Main2Activity.class);

        intent.putExtra("tvText", tvText.getText().toString());
        startActivity(intent);

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        String string=tvText.getText().toString();
        outState.putString("tvText",string);
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        tvText.setText(savedInstanceState.getString("tvText"));
    }
}
