package com.mylibrary;

import java.util.Scanner;

public class X {

    private Scanner x = new Scanner(System.in);

    public int readInt() {
        System.out.println("Enter an integer number between 1 and 12");
        return inputValidator();
    }

    public void printTimesTable(int x) {
        if(x < 1 || x > 12) {
            System.out.println("The table run from 1 to 12. Try again...");
            return;
        }

        System.out.println("Times Table of " + x);
        for(int i=1; i<=12; i++) {
            System.out.println(i + " * " + x + " = " + (i * x));
        }
    }

    private int inputValidator() {

        boolean isAnInt = this.x.hasNextInt();

        while (!isAnInt) {
            System.out.println("Invalid Number");
            this.x.nextLine();
            isAnInt = this.x.hasNextInt();
        }

        int number = this.x.nextInt();

        return number;
    }
}