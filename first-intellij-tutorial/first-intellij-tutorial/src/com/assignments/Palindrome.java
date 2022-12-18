package com.assignments;

import java.util.Scanner;

/**
 * The {@code Palindrome} class checks whether
 * a string provided by user is a palindrome
 * or not.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String str = takeInput.next();

        int leftMostElement = 0;
        int rightMostElement = str.length() - 1;
        boolean isPalindrome = true;
        while (leftMostElement < rightMostElement) {
            if (str.charAt(leftMostElement) != str.charAt(rightMostElement)) {
                isPalindrome = false;
            }
            leftMostElement++;
            rightMostElement--;
        }

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
