package com.java.inheritance.entities;

public class SavingsAccount extends Account {
	//final int x = 10;
	private double minBalance;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int accountId, String accountHolderName, double accountBalance, double minBalance) {
		super(accountId, accountHolderName, accountBalance);
		this.minBalance = minBalance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	//this method can't be overriden any further in the child classes of this class
	@Override
	public final String printAccountInfo() {
		return super.printAccountInfo() + ", " + this.minBalance;
	}
}
