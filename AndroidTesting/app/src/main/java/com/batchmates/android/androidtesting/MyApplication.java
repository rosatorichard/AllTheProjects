package com.batchmates.android.androidtesting;

import android.app.Application;
import android.support.annotation.MainThread;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Android on 7/19/2017.
 */

public class MyApplication extends Application {

    private static final String TAG = "MyApplication Tag";


    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: We made an application class");

    }
}
