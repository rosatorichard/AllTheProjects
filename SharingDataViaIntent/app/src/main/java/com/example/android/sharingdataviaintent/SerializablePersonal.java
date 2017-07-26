package com.example.android.sharingdataviaintent;

import java.io.Serializable;

/**
 * Created by Android on 6/22/2017.
 */

public class SerializablePersonal implements Serializable{

    String name;
    int age;
    String gender;

    public SerializablePersonal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
