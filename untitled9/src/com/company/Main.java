package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //copy the following code to a new project and
        //fix the errors in the conversions below
        //also answer each of the questions in comments.

        String myString = "1";//"1"
        float myFloat = 10.7f;
        double myDouble = 10.9123457890;
        boolean myBool = true;
        long myLong = 123123;
        int myInt = 12;

        myDouble = myFloat;
        myDouble = myInt;
        myDouble = myLong;
        myDouble = myString;

        //How come only the string needs to be converted.

        myString = "1";//"1"
        myFloat = 10.7f;
        myDouble = 10.9123457890;
        myBool = true;
        myLong = 123123;
        myInt = 12;

        myFloat = myDouble;
        myFloat = myInt;
        myFloat = myLong;
        myFloat = myString;
        //why does the double need to be cast/converted to a float but it did not need to be done in the opposite direction


        myString = "1";//"1"
        myFloat = 10.7f;
        myDouble = 10.9123457890;
        myBool = true;
        myLong = 123123;
        myInt = 12;

        myInt = myDouble;
        myInt = myFloat;
        myInt = myLong;
        myInt = myString;
        //what is the value of myInt after the conversion from myDouble?  why is it not the same value of myDouble


        myString = "1";//"1"
        myFloat = 10.7f;
        myDouble = 10.9123457890;
        myBool = true;
        myLong = 123123;
        myInt = 12;

        myLong = myDouble;
        myLong = myFloat;
        myLong = myInt;
        myLong = myString;


        myString = "1";//"1"
        myFloat = 10.7f;
        myDouble = 10.9123457890;
        myBool = true;
        myLong = 123123;
        myInt = 12;

        myString = myDouble;
        myString = myFloat;
        myString = myInt;
        myString = myLong;
    }
}
