package com.company;

public class DeluxHamburger extends Hamburger {
    private boolean chips; // 2.75$
    private boolean drinks; // 3.00$

    public DeluxHamburger() {
        super("Delux Hamburger", "Standard", true, 9.00);
        this.chips = false;
        this.drinks = false;
    }

    // Add items (2)
    public void addChips() {
        super.calculateTotalPrice(2.75);
        this.chips = true;
    }

    public void addDrinks() {
//        System.out.println("Adding Drinks +3.00$");
        super.calculateTotalPrice(3.00);
        this.drinks = true;
    }

    @Override
    public void showPricesList() {
        System.out.println("Base price for " + super.getName() + ": " + super.getPrice() + "0$");
        System.out.println("Chips: 2.75$");
        System.out.println("Drinks: 3.00$");
    }

    @Override
    public void shoppingList() {
        if (chips)
            System.out.println("Adding Chips +2.75$");

        if (drinks)
            System.out.println("Adding Drinks +3.00$");
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
