package com.company;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Barni");
	    dog.breathe();
	    dog.eat();

        System.out.println("============================");

        Tukkany tukkany = new Tukkany("Tukkany");
	    tukkany.breathe();
	    tukkany.eat();
	    tukkany.fly();

        System.out.println("============================");;

        Pinguin pinguin = new Pinguin("Empreror");
        pinguin.fly();
    }
}
