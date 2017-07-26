package com.batchmates.android.multiplebutton;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttons(View view) {

        switch(view.getId())
        {
            case R.id.btnOne:
                Log.d(TAG, "buttons: This is btnOne");
                break;

            case R.id.btnTwo:
                Toast toaster= Toast.makeText(this,"This is Two",Toast.LENGTH_SHORT);
                toaster.show();
                break;

            case R.id.btnThree:
                //to be snackbar
                Snackbar snack = Snackbar.make(view,"This is Three",Snackbar.LENGTH_SHORT);
                snack.show();
                break;

            case R.id.btnFour:

                Intent intent =new Intent(MainActivity.this,WebViewActivity.class);
                startActivity(intent);
                break;
        }
    }
}
