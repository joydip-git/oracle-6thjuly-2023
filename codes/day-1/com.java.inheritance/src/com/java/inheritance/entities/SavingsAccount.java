package com.java.inheritance.entities;

public class SavingsAccount extends Account {
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
}
