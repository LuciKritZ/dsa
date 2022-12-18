package com.assignments;

import java.util.Scanner;

/**
 * The {@code Calculator} class performs basic
 * addition, subtraction, division, and multiplication
 * operations when the user provides 2 numbers, and
 * an operator.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        float number1 = takeInput.nextFloat();

        System.out.print("Please enter the second number: ");
        float number2 = takeInput.nextFloat();

        System.out.println("Please specify which operation to perform: ");
        System.out.println("+ Addition");
        System.out.println("- Subtraction");
        System.out.println("* Multiplication");
        System.out.println("/ Division");
        char operation = takeInput.next().charAt(0);

        if (operation == '+') {
            System.out.println("Addition: "+ (number1 + number2));
        }
        else if (operation == '-') {
            System.out.println("Subtraction: "+ (number1 - number2));
        }
        else if (operation == '*') {
            System.out.println("Multiplication: "+ (number1 * number2));
        }
        else if (operation == '/') {
            System.out.println("Division: "+ (number1 / number2));
        } else {
            System.out.println("Please enter a valid operation.");
        }
    }
}
