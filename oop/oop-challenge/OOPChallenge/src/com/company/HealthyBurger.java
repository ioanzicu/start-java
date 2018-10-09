package com.company;

public class HealthyBurger extends Hamburger {

    private boolean cucumber; // 1.25$
    private boolean mustar; // 0.75$

    public HealthyBurger() {
        super("Healthy Burger", "Brown Bye Bread", true, 7.00);
        this.cucumber = false;
        this.mustar = false;
    }

    // Add items (2)
    public void addCucumber() {
        super.calculateTotalPrice(1.25);
        this.cucumber = true;
    }

    public void addMustar() {
        super.calculateTotalPrice(0.75);
        this.mustar = true;
    }

    @Override
    public void showPricesList() {
        super.showPricesList();
        System.out.println("Cucumber: 1.25$");
        System.out.println("Mustar: 0.75$");
    }

    @Override
    public void shoppingList() {
        super.shoppingList();

        if(cucumber)
            System.out.println("Adding Cucumber +1.25$");

        if(mustar)
            System.out.println("Adding Mustar +0.75$");
    }

    @Override
    public void showCheck() {
        this.shoppingList();

        super.showTotalAmount();
    }

    @Override
    public double calculateTotalPrice(double price) {
        return super.calculateTotalPrice(price);
    }
}
