package com.batchmates.android.androidtesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity Tag";
    public static final String EXTRA_KEY = "KEY";
    private EditText edEditText;
    private TextView tvTextView;
    private Button btnButton;


    @BindView(R.id.tvTextView)
    TextView textView;

    @BindView(R.id.etEditText)
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        ButterKnife.bind(this);
    }


    @OnClick(R.id.btnButton)
    public void doMagic() {
        textView.setText(editText.getText().toString());
    }

    @OnClick(R.id.btnIntentButton)
    public void doIntent() {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra(EXTRA_KEY, editText.getText().toString());
        startActivity(intent);
    }
}
