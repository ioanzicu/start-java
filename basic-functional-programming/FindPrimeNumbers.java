package com.company;

public class Main {

    public static void main(String[] args) {

        // Find Prime Numbers
        int count = 0;

        for(int i=2; i<20; i++){

            if(isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                count++;
                if (count == 5) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }

        for(int i=2; i<=(long) Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}
