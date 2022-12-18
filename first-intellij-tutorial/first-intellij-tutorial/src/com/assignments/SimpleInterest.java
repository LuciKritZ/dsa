package com.assignments;

import java.util.Scanner;

/**
 * The {@code SimpleInterest} class calculates simple interest
 * for them, when they provide P (Principal amount),
 * r (rate of interest per year), and t (time period in years).
 *
 * Formula: A = P*R*T/100
 */
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Please enter the principal amount: ");
        int principal = takeInput.nextInt();

        System.out.print("Please enter the rate of interest: ");
        float rateOfInterest = takeInput.nextFloat();

        System.out.print("Please enter the duration in years: ");
        int durationInYears = takeInput.nextInt();

        float annualInterest = principal * rateOfInterest * durationInYears / 100;
        System.out.println("Simple interest: " + annualInterest);
    }
}
