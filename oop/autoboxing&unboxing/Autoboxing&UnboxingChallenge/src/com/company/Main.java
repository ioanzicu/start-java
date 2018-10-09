package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Deutsch Bank");

        if(bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch creadet");
        }

        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 154.02);
        bank.addCustomer("Adelaide", "Mark", 2543.04);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Brod", 541.09);

        bank.addCustomer("Adelaide", "Tim", 5.45);
        bank.addCustomer("Adelaide", "Mark", 15.02);
        bank.addCustomer("Adelaide", "Mark", 43.04);

        bank.listCustomer("Adelaide", true);
        bank.listCustomer("Sydney", true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Meldbourne branch does not exist");
        }

        if(!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Adelaide", "Tim", 25.01)) {
            System.out.println("Customer Tim already exists");
        }
    }
}
