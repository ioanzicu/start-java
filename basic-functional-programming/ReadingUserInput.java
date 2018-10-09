package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Reading User Input Challenge
        System.out.println("Ente 10 numbers");
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while(true){

            int order = count + 1;
            System.out.println("Enter number #"+order);

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){

                int inputNumber = scanner.nextInt();
                count++;
                sum += inputNumber;
                if (count == 10){
                    System.out.println("Sum of all numbers is = " + sum);
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); // handle end of line (enter key)
        }
        scanner.close();
    }
}
