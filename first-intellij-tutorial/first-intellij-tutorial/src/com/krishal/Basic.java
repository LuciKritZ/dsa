package com.krishal;

public class Basic {
    public static void main(String[] args) {
        // if
        int a = 10;
        if (a == 10) {
            System.out.println("Hello world");
        }

        // while
        int count = 1;
        while (count != 5) {
            System.out.println(count);
            count++;
        }

        // for loop
        for (int cnt = 1; cnt != 5; cnt++) {
            System.out.println(cnt);
        }

        // When you don't know how many times the loop is going to run, use `while` loop.
        // When you know how many times the loop is going to run, use `for` loop.
    }
}
