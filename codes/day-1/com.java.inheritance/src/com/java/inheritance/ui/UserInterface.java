package com.java.inheritance.ui;

import com.java.inheritance.entities.*;

public class UserInterface {

	public static void main(String[] args) {

		/*
		 * CurrentAccount anilCurrentAccount = null; Account subhamCurrentAccount =
		 * null; SavingsAccount sunilSavingsAccount = null; Account sawantSavingsAccount
		 * = null;
		 * 
		 * anilCurrentAccount = new CurrentAccount(1234, "anil kumar", 10000.00,
		 * 1000.00); // up-casting => implicit subhamCurrentAccount = new
		 * CurrentAccount(1234, "subham kumar", 10000.00, 1000.00); sunilSavingsAccount
		 * = new SavingsAccount(1345, "sunil", 20000.00, 50000.00); sawantSavingsAccount
		 * = new SavingsAccount(1345, "sawant", 20000.00, 50000.00); // down-casting =>
		 * explicit CurrentAccount subhamAcc = (CurrentAccount) subhamCurrentAccount;
		 * 
		 * Account[] accounts = new Account[2]; accounts[0] = anilCurrentAccount;
		 * accounts[1] = sunilSavingsAccount; accounts[2] = subhamCurrentAccount;
		 * accounts[3] = sawantSavingsAccount;
		 */

		System.out.println("1. Current\n2. Savings");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("enter choice[1/2]: ");

		Account accountInstanceRef = null;
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			accountInstanceRef = new CurrentAccount(1234, "anil kumar", 10000.00, 1000.00);
			break;

		case 2:
			accountInstanceRef = new SavingsAccount(1345, "sunil", 20000.00, 50000.00);
			break;

		default:
			break;
		}

		// System.out.println(accountInstanceRef.printAccountInfo());
		Print(accountInstanceRef);

		if (accountInstanceRef instanceof CurrentAccount) {
			CurrentAccount currentAcc = (CurrentAccount) accountInstanceRef;
			// System.out.println(currentAcc.printCurrentAccountInfo());
			Print(currentAcc);
		}
		if (accountInstanceRef instanceof SavingsAccount) {
			SavingsAccount savingsAcc = (SavingsAccount) accountInstanceRef;
			// System.out.println(savingsAcc.printSavingsAccountInfo());
			Print(savingsAcc);
		}
		sc.close();

		// variable
		final int y = 20;
		System.out.println(y);
	}

	static void Print(CurrentAccount currentAcc) {
		System.out.println(currentAcc.printAccountInfo());
	}

	static void Print(SavingsAccount savingsAcc) {
		System.out.println(savingsAcc.printAccountInfo());
	}

	static void Print(Account account) {
		System.out.println(account.printAccountInfo());
	}
}
