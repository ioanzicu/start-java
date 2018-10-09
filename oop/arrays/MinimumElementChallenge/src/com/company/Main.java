package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many elements do you want to enter?");

        int count = inputValidator();

        System.out.println("Minimum element in array is: " + findMin(readIntegers(count)));

        scanner.close();
    }

    private static int[] readIntegers(int count) {

        System.out.println("Enter " + count + " numbers");

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            int number = inputValidator();
            array[i] = number;
        }

        return array;

    }

    private static void printIntegers(int[] array) {

        System.out.println("Was entered next integers:");

        for(int i=0; i<array.length ; i++) {
            System.out.println(array[i]);
        }
    }

    private static int findMin(int[] array) {

        for (int i=0; i<array.length; i++) {
            if(array[0] > array[i])
                array[0] = array[i];
        }

        return array[0];
    }

    private static int inputValidator() {

        boolean isAnInt = scanner.hasNextInt();

        while (!isAnInt) {
            System.out.println("Invalid Number");
            scanner.nextLine();
            isAnInt = scanner.hasNextInt();
        }

        int number = scanner.nextInt();

        return number;
    }
}
