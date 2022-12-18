package com.assignments;

import java.util.Scanner;

/**
 * The {@code Armstrong} class finds the
 * Armstrong number between two numbers
 * provided by the user.
 */
public class Armstrong {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        long number1 = takeInput.nextInt();
        System.out.print("Please enter second number: ");
        long number2 = takeInput.nextInt();

        while (number1 != number2 + 1) {
            long n = number1;
            int length = String.valueOf(number1).length();
            long armstrong = 0;
            while (n != 0) {
                long temp = n % 10;
                temp = (long)(Math.pow(temp, length));
                armstrong = armstrong + temp;
                n = n/10;
            }
            if (armstrong == number1) {
                System.out.println(number1 + ", ");
            }
            number1++;
        }
    }
}
