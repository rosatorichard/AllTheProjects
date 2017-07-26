package com.example.android.sharingdataviaintent;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Android on 6/22/2017.
 */

public class ParciliblePerson implements Parcelable{

    String name;
    int age;
    String gender;

    public ParciliblePerson(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    protected ParciliblePerson(Parcel in) {
        name = in.readString();
        age = in.readInt();
        gender = in.readString();
    }

    public static final Creator<ParciliblePerson> CREATOR = new Creator<ParciliblePerson>() {
        @Override
        public ParciliblePerson createFromParcel(Parcel in) {
            return new ParciliblePerson(in);
        }

        @Override
        public ParciliblePerson[] newArray(int size) {
            return new ParciliblePerson[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
        dest.writeString(gender);
    }
}
