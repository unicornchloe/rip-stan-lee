package com.company;

import com.sun.corba.se.impl.io.TypeMismatchException;
import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
       // boolean match = CheckGuess (1,9);
       // System.out.println(match);
        String input = Input("whats your name");
        System.out.println(input);
       // int Intinput = IntInput("number between 1 - 100");
       // int guessnumber = getGuess();
        //System.out.println(guessnumber);
          //printHint(100, 87);
          int secretnumb = GenerateNumber();
        System.out.println(secretnumb);

    }

        /*Write a guessing game where the user has to guess a secret number, create and use the functions described below for credit.

Keep track of number of guesses
You must use the functions below to recieve credit


All of the functions below should be used in your solution (some may only be used by other functions others will be used in the main function

Your guessing game needs to include the following:
Allow the user to enter their name.
Keep track of the number of guesses it takes to get it right
Generate a random number between 1-100 for the user to guess.
once the user guesses the correct number ask if they would like to play again, exiting if they type "no" restarting if they type"yes"


This program needs the following functions:

*/

/*

To Create a Random Number between 1 and 100 in Java:
import java.util.Random; // this needs to be at the top of the code where other imports are

Random rand = new Random();
int  n = rand.nextInt(100) + 1;
//100 is the maximum and the 1 is our minimum

To Create a Random Number between 1 and 100 in C#:
Random rand = new Random();
int n = rand.Next(1, 100); // creates a number between 1 and 100
*/


    //Function Name: CheckGuess
    //Inputs: theSecretNumber, userGuessedNumber
    //What it should do:
    //check to see if the number the userGuessedNumber was != or == to theSecretNumber
    //if theSecretNumber was != userGuessedNumber then call PrintHint
    //Returns: boolean indicating if it was a match or not
    static boolean CheckGuess  (int theSecretNumber, int userGuessedNumber){
        if (userGuessedNumber == theSecretNumber) {
            return true;
        }
        else {
            printHint(userGuessedNumber,theSecretNumber);
            return false;
        }
    }

    //Function Name: Input
    //Inputs: string to be used as a prompt
    //What it should do:
    //Print the prompt to the screen
    //get input from the user
    //Returns: string containing what the user entered
      static String Input (String prompt){
          System.out.println(prompt);
          Scanner console = new Scanner(System.in);
          String userInput = console.nextLine();
           return userInput;
      }





    //Function Name: IntInput
    //Inputs: string to be used as a prompt
    //What it should do:
    //Print the prompt to the screen (use the input function created above)
    //get input from the user
    //this should continue to reprompt the user and get new input until an integer is entered by the user
    //Returns: the integer that the user entered
     static int  IntInput (String prompt){
          while (true) {
              String userInput = Input(prompt);
              try {
                  int userInputI = Integer.parseInt(userInput);
                  return userInputI;
              } catch (NumberFormatException ex) {

              }
          }
     }




    //Function Name: GenerateNumber
    //Inputs: none
    //What it should do:
    //generate random number between 1 and 100  - see bottom of page for how to do this
    //Returns: the number generated
    static int GenerateNumber(){
        Random rand = new Random();
        int  n = rand.nextInt(100) + 1;
        return n;
    }




    //Function Name: GetGuess
    //Inputs: none
    //What it should do:
    //prompt the user to guess a number between 1 and 100 (use IntInput you created to do this.
    //while the number returned by the function is not valid have it reask for a number
    //Returns: the number the user entered (should be valid integer between 1-100 at this point)

    static int getGuess() {
        boolean valid = false;
        int input;
        while (true) {
            try {
                //input = Integer.parseInt(IntInput("guess a number between 1 and 100"));
                input = IntInput("guess a number between 1 and 100");
                //gets back to while if there's an exception so it doesn't make it valid unless you put in a number
                return (input);
            } catch (Exception e) {


            }
        }
    }


    //Function Name: printHint
    //Inputs: theSecretNumber, userGuessedNumber
    //What it should do:
    //if userGuessedNumber is less than theSecretNumber
    //print your number was too small
    //else if userGuessedNumber is greater than theSecretNumber
    //print your number was too large
    //Returns: nothing
    static void printHint(int theSecretNumber, int userGuessedNumber){
        if (userGuessedNumber < theSecretNumber){
            System.out.println("number too small");
        }
        else if (userGuessedNumber > theSecretNumber){
            System.out.println("number too large");
        }
    }
}

