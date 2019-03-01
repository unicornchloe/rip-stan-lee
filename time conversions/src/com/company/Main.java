package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

You program should ask for the time using the following prompts:
Enter hour for 12 hr time format:
Enter min for 12 hr time format:
Enter sec for 12 hr time format:
Enter AM/PM:

your program should convert and print the given time in 24-hour format.


Example input		Example output

					Enter hour for 12 hr time format:
07
					Enter min for 12 hr time format:
05
					Enter sec for 12 hr time format:
45
					Enter AM/PM:
PM
					19:05:45

Example input		Example output

					Enter hour for 12 hr time format:
12
					Enter min for 12 hr time format:
08
					Enter sec for 12 hr time format:
59
					Enter AM/PM:
AM
					00:08:59
*/

        Scanner console = new Scanner(System.in);
        System.out.println("Enter hour for 12 hr time format:");
        String hour = console.nextLine();
        System.out.println("Enter min for 12 hr time format:");
        String minute = console.nextLine();
        System.out.println("Enter sec for 12 hr time format:");
        String seconds = console.nextLine();
        System.out.println("Enter AM/PM:");
        String amPM = console.nextLine();
        int hourI = Integer.parseInt(hour);
        int minuteI = Integer.parseInt(minute);
        int secondsI = Integer.parseInt(seconds);
        if (hourI == 12) {
            if (amPM.equals("am")) {
                hourI = 00;
            }
        }
        if (hourI != 12 && amPM.equals("pm")) {
            hourI = hourI + 12;

        }
        //System.out.println(hourI + ":" + minute + ":" + seconds);
        //System.out.printf("hours %tH: minutes %tM: seconds %tS%n",);
        System.out.printf("%02d", hourI);
        System.out.print(":");
        System.out.printf("%02d", minuteI);
        System.out.print(":");
        System.out.printf("%02d", secondsI);




    }
}
