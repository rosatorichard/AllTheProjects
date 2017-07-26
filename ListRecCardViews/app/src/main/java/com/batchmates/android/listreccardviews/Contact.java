package com.batchmates.android.listreccardviews;

/**
 * Created by Android on 6/27/2017.
 */

public class Contact {

    String name;
    String phone;
    String birthday;

    public Contact(String name, String phone, String birthday) {
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthday() {
        return birthday;
    }

}
