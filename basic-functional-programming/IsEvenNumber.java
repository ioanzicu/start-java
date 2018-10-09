package com.company;

public class Main {

    public static void main(String[] args) {
	int number = 4;
	int finishNumber = 20;
        int sum = 0;
    	int count = 0;

	while(number <= finishNumber){
      	    number++;

	    if (!isEvenNumber(number)){
	        continue;
            }

            count++;
            sum +=number;

            System.out.println("Event number " + number);

            if (count == 5) {
                System.out.println("Sum of the " + count + " even numbers above is equal to " +  sum);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number){
        if ((number % 2) == 0)
            return true;
        return false;
    }
}
