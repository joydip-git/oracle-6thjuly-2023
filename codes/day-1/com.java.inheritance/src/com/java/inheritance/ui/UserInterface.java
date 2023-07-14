package com.java.inheritance.ui;

import com.java.inheritance.entities.*;

public class UserInterface {

	public static void main(String[] args) {

		CurrentAccount anilCurrentAccount = new CurrentAccount(1234, "anil kumar", 10000.00, 1000.00);
		SavingsAccount sunilSavingsAccount = new SavingsAccount(1345, "sunil", 20000.00, 50000.00);

		Account subhamCurrentAccount = new CurrentAccount(1234, "subham kumar", 10000.00, 1000.00);
		Account sawantSavingsAccount = new SavingsAccount(1345, "sawant", 20000.00, 50000.00);

		Account[] accounts = new Account[2];
		accounts[0] = anilCurrentAccount;
		accounts[1] = sunilSavingsAccount;
		accounts[2] = subhamCurrentAccount;
		accounts[3] = sawantSavingsAccount;
	}

}
