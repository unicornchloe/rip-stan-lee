package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
     /* for this assigment you are going to practice creating objects and calling methods

Although not needed you may want to look at
https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
https://docs.oracle.com/javase/8/docs/api/java/util/Date.html
https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Random.html

You will need to do this assignment in Java (some of these classes do not exist in C#) Everything in this project should be
the same syntax in C# and Java aside from the print statements. (Java uses System.out.println() instead of Console.WriteLine())
*/


// create a Random object called myRandom
        Random myRandom = new Random();
// create a Random object called anotherRandomGenerator
Random anotherRandomGenerator = new Random();
//call the nextInt method on the myRandom object.
int value = myRandom.nextInt();
//print the value that is returned by the method call
        System.out.println(value);
//call the nextDouble method on the anotherRandomGenerator object.
        double hi= anotherRandomGenerator.nextDouble();
//print the value that is returned by the method call
        System.out.println(hi);
//call the nextInt method on the myRandom object
        int bye = myRandom.nextInt();
//print the value that is returned by the method call
        System.out.println(bye);
//call the nextDouble method on the anotherRandomGenerator object.
        double yes = anotherRandomGenerator.nextDouble();
//print the value that is returned by the method call
        System.out.println(yes);
//create a new ArrayList object called myList that contains integers using the line below:
        ArrayList<Integer> myList = new ArrayList<>();


//call the add method on myList passing in the number 12
myList.add(12);
//print the result of the value returned by calling the size method on myList
        System.out.println(myList.size());
//call the add method on myList passing in the number 14
            myList.add(14);
//print the result of the value returned by calling the size method on myList
        System.out.println(myList.size());
//print the result of the value returned by calling the get method on myList passing in 0 as the input
        System.out.println(myList.get(0));
//print the result of the value returned by calling the get method on myList passing in 1 as the input
        System.out.println(myList.get(1));
//call the set method on myList passing in 0 and 5 as the two inputs
myList.add(0-5);
//print the result of the value returned by calling the get method on myList passing in 0 as the input
        System.out.println(myList.get(0));
//print the result of the value returned by calling the get method on myList passing in 1 as the input
        System.out.println(myList.get(1));
//call the clear method on myList
            myList.clear();
//print the result of the value returned by calling the size method on myList
        System.out.println(myList.size());

// create a Date object called currentDate
// create a Date object called anotherDate


// call the toString method on currentDate and put it into a string variable called curDateString
            
// print curDateString
        System.out.println();
// call the setTime method for anotherDate passing in 123478 as its input.
// call the before method on currentDate passing in anotherDate
//if this returns true print "current date is before another date",
//else if it returns false print "current date is after another date"


    }
}
