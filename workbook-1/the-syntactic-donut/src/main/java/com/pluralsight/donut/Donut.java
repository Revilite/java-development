package com.pluralsight.donut;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Donut {
    static double price = .25;

    public static double getTotalPrice(int numberOfDonuts) {
        return price * numberOfDonuts;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Scanner inputScanner = new Scanner(System.in);
//        System.out.printf("Welcome! How many donuts do you want? :");
//        int numberOfDonuts = inputScanner.nextInt();
//        inputScanner.nextLine();
//
//        double priceOfDonuts = getTotalPrice(numberOfDonuts);
//        System.out.printf("Your donuts cost: $%.2f\n", priceOfDonuts);
//        System.out.printf("A dozen donuts cost: $%.2f\n", getTotalPrice(12));

//        System.out.printf("$" + getTotalPrice(12));
//        System.out.printf("This is my format string\n");
//        System.out.printf("In dollars, that would be $%.2f \n", priceOfDonuts);
//        System.out.printf("The square root of 5 is %8.15f\n", Math.sqrt(5.0));

    }
}


//we LOVE our delimiters!
//we LIKE our indentation!!
//we Like our OPERATORS
//we use upper and lower case because we should ...

/*
    { } Curly braces
        Surround:
            Method body
            Class declaration
            Array initializer
    [ ] Square brackets
            Array declarations
            Array Access
    < > Pointy brackets
            Template parameter lists
    ( ) Parentheses
            Parameter lists for a method
    ;   Semicolon
            Ends a statement
    "" Double quotes

    ' ' Single quotes


 */
