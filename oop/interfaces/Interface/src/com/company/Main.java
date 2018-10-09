package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone grogsPhone;
	    grogsPhone = new DeskPhone(6565656);
	    grogsPhone.powerOn();
	    grogsPhone.callPhone(6565656);
	    grogsPhone.answer();

		grogsPhone = new MobilePhone(131313);
		grogsPhone.powerOn();
		grogsPhone.callPhone(131313);
		grogsPhone.answer();
    }
}
