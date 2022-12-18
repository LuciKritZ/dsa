package com.assignments;

import java.util.Scanner;

/**
 * The {@code EvenOrOdd} class contains a function that checks
 * whether a number is even or odd.
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
