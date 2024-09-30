package com.pluralsight.adding;
import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first integer?");
        int firstInteger = scan.nextInt();

        System.out.println("What is your second integer?");
        int secondInteger = scan.nextInt();

        int finalIntger = firstInteger + secondInteger;
        System.out.println("The sum is: " + finalIntger);
    }
}
