package com.company;

public class Main {

    public static void main(String[] args) {
        // Digit Sum Challenge
        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number 1 is " + sumDigits(1));
        System.out.println("The sum of the digits in number -1 is " + sumDigits(-1));
    }

    public static int sumDigits(int number){
        if(number < 10)
            return -1;

//	  HARD DUMM WAY :)

//        int numThree = number % 10;
//        int discard = number / 10;
//        int numTwo = discard % 10;
//        int numOne = discard / 10;
//        return numOne + numTwo + numThree;

        int sum = 0;
        while (number > 0){
            // Extract the lest-significant digit
            int digit = number % 10;
            sum += digit;

            // Drop the least-significant digit
            number /= 10;
        }

        return sum;
    }
}
