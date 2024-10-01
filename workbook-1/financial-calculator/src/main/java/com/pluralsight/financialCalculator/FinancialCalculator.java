package com.pluralsight.financialCalculator;
import java.util.Scanner;

//init variables as doubles
/*
        Margin of Overflow error
*/

public class FinancialCalculator {

    public static double[] mortgageCalculator(double principal, double interestRate, int years) {
        // Initial interest is in years :(
        double monthlyPayment = 0.00;
        double totalInterest = 0;
        double monthlyInterestRate = interestRate / 12;
        int months = years * 12;

        //Monthly Compounding Formula
        monthlyPayment = principal * ((monthlyInterestRate) / (1 - Math.pow((1 + monthlyInterestRate), -1 * months)));
        totalInterest = monthlyPayment * months - principal;

        double[] returnValue = {monthlyPayment, totalInterest};
        return returnValue;
    }

    public static double[] futureValueCalculator(double deposit, double interestRate, int years) {
        // Initial interest rate is yearly
        double futureValue = 0;
        double totalInterest = 0;
        int daily = years * 365;

        //Daily Compounding formula
        futureValue = deposit * (Math.pow(1 + interestRate / 365, daily));
        totalInterest = futureValue - deposit;


        double[] returnValue = {futureValue, totalInterest};
        return returnValue;
    }

    public static double presentValueCalculator(double monthlyPayout, double interestRate, int years) {
        double presentValue = 0;
        int numOfPeriods = years * 12;
        double monthlyInterest = interestRate / 12;

        //Annuity for present value formula
        presentValue = monthlyPayout * ((1 - (Math.pow(1 + monthlyInterest, -numOfPeriods))) / monthlyInterest);

        return presentValue;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String calculatorChoice = "";
        String continueLoop = "y";
        while(continueLoop.contains("y")) {
            System.out.println("Which calculator would you like you use?   mc/fv/pv");
            calculatorChoice = scan.next();


            if (calculatorChoice.contains("mc")) {
                // User Input
                System.out.println("What is your principal?");
                double principal = scan.nextDouble();
                System.out.println("What is you interest rate? (As percentage)");
                double interestRate = scan.nextDouble() / 100;
                System.out.println("How many years is the loan for?");
                int years = scan.nextInt();

                //Spitting output
                double[] mortgageValues = mortgageCalculator(principal, interestRate, years);
                System.out.printf("your monthly payment is $%.0f \n", mortgageValues[0]);
                System.out.printf("your total amount of interest is $%.2f", mortgageValues[1]);
            } else if (calculatorChoice.contains("fv")) {
                // User Input
                System.out.println("What is your deposit?");
                double deposit = scan.nextDouble();
                System.out.println("What is your interest? (As percentage)");
                double interest = scan.nextDouble() / 100;
                System.out.println("How many years?");
                int years = scan.nextInt();

                //Spitting output
                double[] futureValue = futureValueCalculator(deposit, interest, years);
                System.out.printf("your future value is $%.2f \n", futureValue[0]);
                System.out.printf("your total amount of interest is $%.2f", futureValue[1]);
            } else if (calculatorChoice.contains("pv")) {
                // User Input
                System.out.println("What is your monthly payout?");
                double monthly = scan.nextDouble();
                System.out.println("What is your expected interest rate? (As percentage)");
                double interestRate = scan.nextDouble() / 100;
                System.out.println("How many years is it going to take to payout?");
                int years = scan.nextInt();

                //Spitting output
                double presentValue = presentValueCalculator(monthly, interestRate, years);
                System.out.printf("The present value that you would have to pay is $%.2f", presentValue);
            }

            System.out.println("\nWould you like to use another calculation?  (y/n)");
            continueLoop = scan.next();
        }
    }
}
