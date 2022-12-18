package com.assignments;

import java.util.Scanner;

/**
 * The {@code Greetings} class greets a user when
 * they provide their name.
 */
public class Greetings {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = takeInput.nextLine();

        System.out.println("Hi "+ name + ", have an amazing time coding here!");
    }
}
