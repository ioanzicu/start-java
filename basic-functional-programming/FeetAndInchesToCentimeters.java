package com.company;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6, 0);

        calcFeetAndInchesToCentimeters(10);
    }

    // Return cm
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet <0 || (inches <0 || inches >12))){
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feets + " + inches + " inches = " + centimeters + " centimeters.");
        return  centimeters;
    }

    // Return feet
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches <0){
            System.out.println("Invalid inches parameter");
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " foot and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }
}
