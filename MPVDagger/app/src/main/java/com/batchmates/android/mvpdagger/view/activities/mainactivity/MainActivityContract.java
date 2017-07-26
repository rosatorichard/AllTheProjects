package com.batchmates.android.mvpdagger.view.activities.mainactivity;

import com.batchmates.android.mvpdagger.BasePresenter;
import com.batchmates.android.mvpdagger.BaseView;
import com.batchmates.android.mvpdagger.model.Person;

import java.util.List;

/**
 * Created by Android on 7/12/2017.
 */

public interface MainActivityContract {

    interface View extends BaseView
    {
        void setFullName(String fullName);
        void sendPersonList(List<Person> personList);

    }


    interface  Presenter extends BasePresenter<View>
    {
        void getFullName(String firstName, String lastName);
        void addPerson(Person person);
        void sendToSecondActivity();
    }

}
