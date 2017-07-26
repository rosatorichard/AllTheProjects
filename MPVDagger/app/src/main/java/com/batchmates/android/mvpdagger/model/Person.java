package com.batchmates.android.mvpdagger.model;

import java.io.Serializable;

/**
 * Created by Android on 7/12/2017.
 */

public class Person implements Serializable{

    String firstName;
    String lastName;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
