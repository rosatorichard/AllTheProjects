package com.batchmates.android.mvpdagger.view.activities.secondactivity;

import android.content.Intent;
import android.util.Log;

import com.batchmates.android.mvpdagger.BaseView;
import com.batchmates.android.mvpdagger.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android on 7/12/2017.
 */

public class SecondActivityPresenter implements SecondActivityContract.presenter {

    private static final String TAG = "Second Presenter";
    SecondActivityContract.View view;


    public void addview(SecondActivityContract.View view) {
        this.view=view;
    }

    @Override
    public void removeView() {

    }


    @Override
    public void showList(Intent intent) {

        List<Person> personList;
        personList=(List<Person>)intent.getSerializableExtra("PERSONLIST");

        for (int i = 0; i < personList.size(); i++) {
            Log.d(TAG, "onCreate: "+ personList.get(i).getFirstName());

        }
    }

    @Override
    public void fillList(Intent intent) {
        List<Person> personList;
        personList=(List<Person>)intent.getSerializableExtra("PERSONLIST");
        view.recycleListFill(personList);

    }
}
