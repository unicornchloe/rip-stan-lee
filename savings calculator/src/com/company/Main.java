package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Create a program that will simulate savings in the stock market.
The program should prompt for several input using the following prompts:
Enter Starting Balance:
Enter Yearly Contribution:
Enter Average Return On Investment as %:
Enter Number of years:
The program should calculate the balance at the end of each year.

Sample input:		Sample Output:
					Enter Starting Balance in dollars
1000
					Enter Yearly Contribution in dollars
100
					Enter Average Return on Investment as %
5
					Enter Number of years for the report.
3
					Year 0: 1000.00
					Year 1: 1155.00
					Year 2: 1317.75
					Year 3: 1488.64
*/
        Scanner Console= new Scanner(System.in );
        System.out.println("Enter Starting Balance:");
        String startingBalance = Console.nextLine();
        System.out.println("Enter Yearly Contribution:");
        String yearlyContribution  = Console.nextLine();
        System.out.println("Enter Average Return On Investment as %:");
        String averageReturn  = Console.nextLine();
        System.out.println("Enter Number of years:");
        String Years  = Console.nextLine();

        double startingBalanceD = Double.parseDouble(startingBalance);
        double yearlyContributionD = Double.parseDouble(yearlyContribution);
        int averageReturnI = Integer.parseInt(averageReturn);
        int YearsI = Integer.parseInt(Years);

        System.out.print("year 0: " );
        System.out.printf("%.2f", startingBalanceD);
        System.out.println();

        int i = 0;
        while (i<YearsI) {
            double subtotal = startingBalanceD + yearlyContributionD;
            double Interest = subtotal * averageReturnI / 100;
             startingBalanceD = Interest + subtotal;
            i = i + 1;
            System.out.print("year " + i + ": ");
            //System.out.println("year " + i + ": " + startingBalanceD);
            System.out.printf("%.2f", startingBalanceD);
            System.out.println();
        }

        }
}
