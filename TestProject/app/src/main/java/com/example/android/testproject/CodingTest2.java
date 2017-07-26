package com.example.android.testproject;

/**
 * Created by Android on 6/20/2017.
 */

public class CodingTest2 {

    public static void main(String[] args)
    {
        String s="have a nice day";
        reverse(s);

    }

    public static void reverse(String s)
    {
        int n=s.length();
        int count=0;
        int trueCount=0;
        char[] word=new char[20];
        char[] newString=new char[20];
        char blank=' ';
        for (int i = 0; i <n ; i++)
        {
            count++;
            trueCount++;
            if(s.charAt(i)!=blank)
            {
                word[i]=s.charAt(i);

            }
            else
            {
                for (int j = 0; j <=count ; j++)
                {
                    newString[n - trueCount + j] = word[j];
                }
                count=0;
                System.out.println(newString);
            }

        }
        System.out.println(newString);
    }

}
