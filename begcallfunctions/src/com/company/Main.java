package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //call MyMathFunction Passing in 5 for A, 6 for B, and 7 for C
        //call MyMathFunction2 Passing in 6 for A, 9 for B, and 12 for C
        // create a variable called var1 and put the value 12.8 into it
        // create a variable called var2 and put the value 123.5 into it
        // create a variable called var3 and put the value 45.1 into it
        //call MyMathFunction Passing in var1 for A, var2 for B, and var3 for C
        //call MyMathFunction2 Passing in var1 for A, var2 for B, and var3 for C

        //call the PrintStuff function

        //call MinVal and and pass in  7 for A, 12 for B, and 4 for C
        //call MinVal and and pass in  1 for A, 12 for B, and 4 for C
        //call MinVal and and pass in  12 for A, 4 for B, and 999 for C

        //Create a MaxVal function that returns the maximum value from three inputs
        //Do this outside of the main function.

        //call MaxVal and and pass in  7 for A, 12 for B, and 4 for C
        //call MaxVal and and pass in  1 for A, 12 for B, and 4 for C
        //call MaxVal and and pass in  12 for A, 4 for B, and 999 for C
    }
    static double MyMathFunction(double A, double B, double C)
    {
        double answer = A * B + C / A;
        return answer;
    }
    static double MyMathFunction2(double A, double B, double C)
    {
        double answer = (A + B + C) / A;
        return answer;
    }
    static double MinVal(double A, double B, double C)
    {
        if (A <= B && A <= C)
        {
            return A;
        }
        else if (B<=A && B<=C)
        {
            return B;
        }
        else
        {
            return C;
        }
    }
    static void PrintStuff()
    {
        Console.WriteLine("Why do Ghosts love elevators?");
        Thread.Sleep(1000);
        Console.WriteLine("because they lift their spirits!");
        Thread.Sleep(1000);
        Console.WriteLine("Why did the hipster burn his mouth?");
        Thread.Sleep(1000);
        Console.WriteLine("Because he sipped his coffee before it was cool.");
    }
    }
}
