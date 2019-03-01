package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        {
        /*Create a program that takes two numbers as inputs and prints out all of the prime numbers (in increasing value) between those two numbers(inclusive).
                Prompt for two numbers using the following prompt twice:
        enter a number:

        Remember: A prime number is a [positive whole] number that is only divisible by it self and 1. Also 1 is not a prime number.

                Example Input		Example Output

        enter a number:
        1
        enter a number:
        7
        2
        3
        5
        7

        Example Input		Example Output

        enter a number:
        14
        enter a number:
        7
        7
        11
        13
        */
            // im gonna take 2 numbers as inputs
            Scanner console = new Scanner(System.in);
            System.out.println("enter a low positive whole number:");
            String firstNumber = console.nextLine();
            int firstNumberI = 0;
            try {
                firstNumberI = Integer.parseInt(firstNumber);

            } catch (NumberFormatException ex) {
                System.out.println("what you entered was not an integer");
                return;
            }

            System.out.println("enter a high positive whole number:");
            String secondNumber = console.nextLine();

            int secondNumberI = 0;


            try {

                secondNumberI = Integer.parseInt(secondNumber);

            } catch (NumberFormatException ex) {
                System.out.println("what you entered was not an integer");
                return;
            }

            //if the first number is bigger than second number than you gotta flip it
            if (firstNumberI > secondNumberI) {
                int tempNumberI = firstNumberI;
                firstNumberI = secondNumberI;
                secondNumberI = tempNumberI;
            }
                //int convert input into interagers
                // we would check the number of input and flip them if they are in wrong order
                // try if the number is neg replace it with 2
                if (firstNumberI < 0) {
                    firstNumberI = 2;
                }

                // catch statement
                //int i = 1st input;
                int i = firstNumberI;

                // while (i<=2nd input){
                while (i <= secondNumberI) {
                    //some code that you want to do each iteration

                    //boolean isPrime = true {
                    boolean isPrime = true;
                    //for(int c=2;c<i;c++) {
                    for (int c = 2; c < i; c++) {
                        //if(i%c==0){
                        if (i % c == 0) {
                            ////boolean isPrime = false
                            isPrime = false;
                            // you would break
                            break;
                            //}
                            //if System.out.println(isPrime);
                        }

                        }
                    if (isPrime) {
                        System.out.println(i);

                        //i = i +1; // or i++;  - where you increment the iterator variable (i)
                    }
                    i = i + 1;


                }
            }
        }
    }



