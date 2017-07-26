package com.batchmates.android.androidtesting;

/**
 * Created by Android on 7/17/2017.
 */

public class Calculation {

    int first = 1;
    int second = 2;
    Multiplication mul = new Multiplication();

    public Calculation(Multiplication multiplication) {
        this.mul = multiplication;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int addition() {
        return (first + second);
    }

    public double divide() {
        double one = first;
        double two = second;
        one = one / two;
        return (one);
    }


    public int times() {
        return (first * second);
    }

    public double multiplyDouble() {
        double come=1.2;
        return mul.multuiplyFloat(3.4, 5.4) + come;
    }

    public int minus() {
        return (first - second);
    }

    public int pow() {
        int returnNum = 1;
        for (int i = 0; i < second; i++) {
            returnNum = returnNum * first;
        }
        return returnNum;
    }

}
