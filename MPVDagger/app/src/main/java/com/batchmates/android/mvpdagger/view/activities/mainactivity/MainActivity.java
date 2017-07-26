package com.batchmates.android.mvpdagger.view.activities.mainactivity;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.batchmates.android.mvpdagger.R;
import com.batchmates.android.mvpdagger.injection.mainactivity.DaggerMainActivityComponent;
import com.batchmates.android.mvpdagger.model.Person;
import com.batchmates.android.mvpdagger.view.activities.secondactivity.SecondActivity;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    @Inject MainActivityPresenter presenter;

    TextInputEditText firstName,lastName;
    TextView input;
    String theFirstName;
    String theLastName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName=(TextInputEditText)findViewById(R.id.etFirstName);
        lastName=(TextInputEditText)findViewById(R.id.etLastName);
        input=(TextView)findViewById(R.id.tvInput);

        setupDaggerComponent();


        presenter.addview(this);
    }

    private void setupDaggerComponent() {
        DaggerMainActivityComponent.create().inject(this);
    }


    @Override
    public void showError(String error) {

    }

    @Override
    public void setFullName(String fullName) {

        input.setText(fullName);
    }

    @Override
    public void sendPersonList(List<Person> personList) {
        Intent intent=new Intent(this, SecondActivity.class);
        intent.putExtra("PERSONLIST", (Serializable) personList);
        startActivity(intent);
    }

    public void enterName(View view) {

        theFirstName=firstName.getText().toString();
        theLastName=lastName.getText().toString();

        presenter.getFullName(theFirstName,theLastName);

    }

    public void addPerson(View view) {
        theFirstName=firstName.getText().toString();
        theLastName=lastName.getText().toString();

        presenter.addPerson(new Person(theFirstName,theLastName));
        Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show();

    }

    public void gotoSecond(View view) {

        presenter.sendToSecondActivity();
    }
}
