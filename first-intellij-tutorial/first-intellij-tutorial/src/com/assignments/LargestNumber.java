package com.assignments;

import java.util.Scanner;

/**
 * The {@code LargestNumber} class takes 2 numbers
 * as an input from the user, and shows the largest
 * number from both of them.
 */
public class LargestNumber {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int number1 = takeInput.nextInt();

        System.out.print("Please enter second number: ");
        int number2 = takeInput.nextInt();

        if (number1 == number2) {
            System.out.println("Please enter different numbers.");
        } else if (number1 > number2) {
            System.out.println(number1 + " is larger than "+ number2);
        } else if (number2 > number1) {
            System.out.println(number2 + " is larger than "+ number1);
        }
    }
}
