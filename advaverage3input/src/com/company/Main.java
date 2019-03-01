package com.company;

import com.sun.org.apache.xpath.internal.operations.Variable;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//create a program that calculates the average of three numbers entered as input:
//asks for 3 numbers(could be decimal values) using the following prompt each time:
//"Enter a number:"

//add the three numbers together and prints out the result divided by 3 (average) with the following prompt
//"The average is: " followed by the average value.
        Scanner console = new Scanner(System.in);
        System.out.println("enter a number");
        String number1 = console.nextLine();
        System.out.println("enter a number");
        String number2 = console.nextLine();
        System.out.println("enter a number");
        String number3 = console.nextLine();
        double number1D = Double.parseDouble(number1);
        double number2D = Double.parseDouble(number2);
        double number3D = Double.parseDouble(number3);
        double Average = (number1D+ number2D + number3D) / 3;
        System.out.println("the average is: " + Average);
    }
}