package com.company;

public class Hamburger {
    private String name;
    // Standard
    private String rollType;
    private boolean meat;
    // Additional
    private boolean lettence; // 1.00$
    private boolean tomato; // 1.50$
    private boolean carrot; // 1.00$
    private boolean cheese; // 2.00$
    private double price = 0.00;
    private double totalPrice;

    public Hamburger(String name, String rollType, boolean meat, double price) {
        System.out.println("New " + name);
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
        this.lettence = false;
        this.tomato = false;
        this.carrot = false;
        this.cheese = false;
        this.totalPrice += price;
    }

    public void showPricesList() {
        System.out.println("Base price for " + name + ": " + price + "0$");
        System.out.println("Lettence: 1.00$");
        System.out.println("Tomato: 1.50$");
        System.out.println("Carrot: 1.00$");
        System.out.println("Cheese: 2.00$");
    }

    public void shoppingList() {
        if(lettence)
            System.out.println("Adding Lettence +1.00$");

        if(tomato)
            System.out.println("Adding Tomato +1.50$");

        if(carrot)
            System.out.println("Adding Carrot +1.00$");

        if(cheese)
            System.out.println("Adding Cheese +2.00$");
    }

    public void showCheck() {
        this.shoppingList();

        this.showTotalAmount();
    }

    public void showTotalAmount() {
        System.out.println("Total: " + totalPrice + "$");
    }

    public double calculateTotalPrice(double price) {
        return this.totalPrice += price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isLettence() {
        return lettence;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isCheese() {
        return cheese;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Add items (4)
    public void addLettence() {
        this.calculateTotalPrice(1.00);
        this.lettence = true;
    }

    public void addTomato() {
        this.calculateTotalPrice(1.50);
        this.tomato = true;
    }

    public void addCarrot() {
        this.calculateTotalPrice(1.00);
        this.carrot = true;
    }

    public void addCheese() {
        this.calculateTotalPrice(2.00);
        this.cheese = true;
    }
}
