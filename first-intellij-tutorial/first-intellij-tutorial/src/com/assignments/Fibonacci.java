package com.assignments;

import java.util.Scanner;

/**
 * The {@code Fibonacci} class calculates the Fibonacci
 * series upto `n` numbers.
 * `n` is taken as an input from the user.
 */

public class Fibonacci {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = takeInput.nextInt();

        while (firstNumber <= number) {
            System.out.print(firstNumber + ", ");

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
