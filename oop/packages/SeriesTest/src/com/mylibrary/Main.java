package com.mylibrary;

import com.mylibrary.Series;

public class Main {

    public static void main(String[] args) {

        System.out.println("---Sum---");

        // Sum
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }

        System.out.println("---Factorial---");

        // Factorial
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }

        System.out.println("---Fibonacci---");

        // Fibonacci
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
