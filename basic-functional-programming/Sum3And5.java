package com.company;

public class Main {

    public static void main(String[] args) {
        //Sum 3 and 5 Challenge
        int sum = 0;
        count = 0;

        for (int i=1; i<=1000; i++){
            if ((i%15==0)) {
                count++;
                System.out.println("Number " + i + " can be devided with 3 and 5");
                sum += i;

                if(count == 5) {
                    System.out.println("Sum of all numbers above is: " + sum);
                    break;
                }
            }
        }
    }
}
