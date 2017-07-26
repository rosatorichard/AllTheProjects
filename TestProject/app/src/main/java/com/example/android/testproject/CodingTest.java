package com.example.android.testproject;

/**
 * Created by Android on 6/20/2017.
 */

public class CodingTest {

    public static void main(String[] args)
    {
        fib();
    }

    public static void fib()
    {
        int lastN=0;
        int currentN= 1;
        int middle=0;
        for (int i = 0; i <20 ; i++) {

            System.out.printf(currentN +", ");
            middle=currentN;
            currentN=lastN+currentN;
            lastN=middle;


        }
    }

}
