/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dharik Amin
 */
package org.example;

import java.util.Scanner;
public class App 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result = 0.0;

       System.out.println("How many euros are you exchanging? ");

        double euros = sc.nextDouble();

        System.out.println("What is the exchange rate? ");

        double exchangeRate = sc.nextDouble();

        double dollars = currencyConverter(euros, exchangeRate,result);
        int x = (int) euros;
        System.out.println(x + " euros at an exchange rate of " + exchangeRate + " is ");
        System.out.printf("%.2f", dollars);
        System.out.print(" U.S Dollars. ");

        sc.close();
    }

    private static double currencyConverter(double euros, double exchangeRate,double result) {
        return result = euros * exchangeRate;

    }
}
