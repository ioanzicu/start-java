package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Standard Hamburger", "thin", true, 5.00);
        hamburger.showPricesList();
        hamburger.showCheck();
        System.out.println("=============================");
        hamburger.addCarrot();
	    hamburger.addCheese();
	    hamburger.addLettence();
        hamburger.showPricesList();
        hamburger.showCheck();
        System.out.println("=============================");

        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.showPricesList();
        healthyBurger.showCheck();
        System.out.println("=============================");
        healthyBurger.addMustar();
        healthyBurger.addCucumber();
        healthyBurger.addCarrot();
        healthyBurger.addCheese();
        healthyBurger.addTomato();
        healthyBurger.addLettence();
        healthyBurger.showPricesList();
        healthyBurger.showCheck();
        System.out.println("=============================");

        DeluxHamburger deluxHamburger = new DeluxHamburger();
        deluxHamburger.showPricesList();
        deluxHamburger.addChips();
        deluxHamburger.showCheck();
    }
}
