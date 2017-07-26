package com.batchmates.android.databinding;

import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;

import java.util.Observable;

/**
 * Created by Android on 7/25/2017.
 */

public class Person {
    ObservableField<String> fname=new ObservableField<>();
    ObservableField<String> lname=new ObservableField<>();


    String firstName;
    String lastName;

    public TextWatcher textWatcherFirstName=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        @Override
        public void afterTextChanged(Editable editable) {

            fname.set(editable.toString());
        }
    };



    public TextWatcher textWatcherLastName=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        @Override
        public void afterTextChanged(Editable editable) {

            lname.set(editable.toString());
        }
    };

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public ObservableField<String> getFname() {
        return fname;
    }

    public ObservableField<String> getLname() {
        return lname;
    }
}
