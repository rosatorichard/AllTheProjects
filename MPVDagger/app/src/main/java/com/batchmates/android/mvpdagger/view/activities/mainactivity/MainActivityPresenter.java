package com.batchmates.android.mvpdagger.view.activities.mainactivity;

import com.batchmates.android.mvpdagger.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android on 7/12/2017.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter{


    MainActivityContract.View view;

    List<Person> personList=new ArrayList<>();


    public void addview(MainActivityContract.View view) {

        this.view=view;
    }

    @Override
    public void removeView() {
        this.view=null;
    }

    @Override
    public void getFullName(String firstName, String lastName) {
        view.setFullName(firstName+" "+lastName);
    }

    @Override
    public void addPerson(Person person) {

        personList.add(person);
    }

    @Override
    public void sendToSecondActivity() {
        view.sendPersonList(personList);
    }
}
