package com.mylibrary;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Version 1
        X x = new X();
	    int number = x.readInt();
	    x.printTimesTable(number);

        System.out.println("******************");

	    // Verion 2
        X2 x2 = new X2(new Scanner(System.in));
        x2.x();
    }
}
