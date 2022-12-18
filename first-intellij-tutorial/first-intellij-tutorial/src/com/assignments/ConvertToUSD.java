package com.assignments;

import java.util.Scanner;

/**
 * The {@code ConvertToUSD} class takes an input
 * as an amount in rupees, and converts it into
 * USD.
 */
public class ConvertToUSD {
    public static void main(String[] args) {
        float USD_RATE_RATIO = 0.012f;
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Please enter the amount in rupees: ");
        float inr = takeInput.nextFloat();

        float usd = inr * USD_RATE_RATIO;

        System.out.println("Amount in USD: " + usd);
    }
}
