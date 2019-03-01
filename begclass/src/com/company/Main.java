package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Learning Targets:

        //I can create a class.
        //Learn how to create instance variables, methods and constructors in a class.

        //Create a class called: "Animal"

        //The class should have the following properties:

        //species (String)
        //name    (String)
        //color 	(String)
        //age     (int)


        //The class should have a constructor that takes in 3 strings (Color,Name,Species) and
        //initializes species, name and color to be the values of the inputs of the constructor.
        //Age should be initialized to 0;

        //The class should have the following methods  (they all should return nothing):

        //MakeSound()  - Prints the message: "Grrrrr" to the screen

        //SetAge(int newAge) -> sets the age property to be the value of newAge

        //PrintDescription() -> prints: name +" is a "+year+" year old, "+color+" "+species

    }
    public class animal {
        //properties
        String species;
        String name;
        String  color;
        int   age;

        public animal (){
            species = "Ford";
             color  = "Escape";
            name  = 0;
            age  = 0 ;

}
