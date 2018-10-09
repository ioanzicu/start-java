package com.company;

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void losehealth(int damage) {
        this.health = this.health - damage;

        if (this.health <=0) {
            System.out.println("Player knocked out");
            // Reduce number of lives reamining for the playes
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
