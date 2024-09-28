package com.pluralsight.financialCalculator;

import java.util.Scanner;
//init variables as doubles
/*
    TODO: Create Mortgage Calculator
        accept the principal, interest rate, and loan length
        display monthly payment and total interest paid
        uses compounded interest formula


    TODO: Create a calculator that determines future value of a one time deposit
         would accept deposit, interest rate, number of years
         display future value and total interest earned
         Uses daily compounding formula

     TODO: Create a calculator that determines present value of a ordinary annuity (WHAT???)
        would accept monthly payout, expected interest rate, and years to payout
        display present value of that annuity (WHAT X2 ?????)


        Margin of Overflow error


 */

public class FinancialCalculator {

    public static double[] mortgageCalculator(double principal, double interestRate, int years) {
        double monthlyPayment = 0.00;
        double totalPayment = principal;
        int months = years * 12;
        double interestRateDecimal = interestRate / 100;

        double compoundInterest = (Math.pow(1 - (1 + interestRateDecimal / 12), -1 * (years * 12)));
        System.out.println(compoundInterest);

        monthlyPayment = totalPayment / years;

        double[] returnValue = {monthlyPayment};

        return returnValue;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String calculatorChoice = "mc";
//
//        System.out.println("Which calculator would you like you use?   mc/fv/pv");
//        calculatorChoice = scan.next();


        if (calculatorChoice.contains("mc")) {
//            System.out.println("What is your principal?");
//            double principal = scan.nextDouble();
//            System.out.println("What is you interest rate?");
//            double interestRate = scan.nextDouble();
//            System.out.println("How many years is the loan for?");
//            int years = scan.nextInt();
//            double[] mortgageValues = mortgageCalculator(principal, interestRate, years);
            double[] mortgageValues = mortgageCalculator(53000, 7.625, 15);

//            System.out.println(mortgageValues[0]);
//            System.out.printf("your monthly payment is %.2f \n", mortgageValues[0]);
//            System.out.printf("your total payment is %.2f", mortgageValues[1]);


        }

    }
}
