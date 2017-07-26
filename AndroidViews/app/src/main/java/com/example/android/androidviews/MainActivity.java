package com.example.android.androidviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private Button updateName;
    private EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.tvUpdateName);
        updateName = (Button) findViewById(R.id.buttonUpdate);
        et = (EditText)findViewById(R.id.etName);

//        updateName.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String data= et.getText().toString();
//                text.setText(data);
//            }
//        });


    }

    public void ColorChange(View view) {

        String data= et.getText().toString();
        text.setText(data);
    }
}
