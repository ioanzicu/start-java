package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount johanAccount = new BankAccount();//"150", 0.00, "Johan Smith", "exemple@gmail.com", "(412) 544-120");
        System.out.println(johanAccount.getNumber());
        System.out.println(johanAccount.getBalance());

        System.out.println("============================");

        // Deposit & Withdraw
        johanAccount.withdrawal(100.0);
        johanAccount.deposit(50.0);
        johanAccount.withdrawal(100.0);
        johanAccount.deposit(51.0);
        johanAccount.withdrawal(100.0);

        BankAccount grongsAccount = new BankAccount("Grong", "gronge@mail.com", "124355");
        System.out.println(grongsAccount.getNumber() + " name " + grongsAccount.getCustomerName());

        System.out.println("============================");

        VipCustomer personOne = new VipCustomer("Siri", 80.00,"siri@mail.com");
        System.out.println(personOne.getCreditLimit());
        System.out.println(personOne.getEmailAddress());
        System.out.println(personOne.getName());

        System.out.println("============================");

        VipCustomer personeTwo = new VipCustomer("Bob", 25000.00);
        System.out.println(personeTwo.getCreditLimit());
        System.out.println(personeTwo.getEmailAddress());
        System.out.println(personeTwo.getName());

        System.out.println("============================");

        VipCustomer personeThree = new VipCustomer();
        System.out.println(personeThree.getCreditLimit());
        System.out.println(personeThree.getEmailAddress());
        System.out.println(personeThree.getName());
    }
}
