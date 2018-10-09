package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            // First Bug Solution
            int min = Integer.MAX_VALUE; // 214783647
            int max = Integer.MIN_VALUE; // -214783648

            //Second Bug Solution: Flag for first input
//          int min = 0;
//          int max = 0;
//          boolean first = true;

        while (true) {
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();

                //Second Bug Solution: Flag for first input
//                if(first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number < min)
                    min = number;

                if (number > max)
                    max = number;

            } else {
                System.out.println("Mini number is " + min + " and Max number is " + max);
                break;
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        scanner.close();
    }
}
