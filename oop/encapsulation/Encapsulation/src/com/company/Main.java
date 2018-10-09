package com.company;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//	    player.fullName = "Tim";
//	    player.health = 20;
//	    player.weapon = "Sword";
//
//        int damage = 10;
//        player.losehealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.losehealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Grog", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
