package com.java.inheritance.entities;

public class CurrentAccount extends Account {
	private double ovredraftLimit;

	// public Account() {}
	public CurrentAccount() {
		// super();
		// super(0,null,0);
		System.out.println("default ctor of CurrentAccount");
	}

	public CurrentAccount(int accountId, String accountHolderName, double accountBalance, double ovredraftLimit) {
		// explicitly invoking Account class's parameterized constructor and passing 3
		// parameters there
		super(accountId, accountHolderName, accountBalance);
		System.out.println("parameterized ctor of CurrentAccount");
		/*
		 * this.accountId = accountId; this.accountBalance = accountBalance;
		 * this.accountHolderName = accountHolderName;
		 */
		this.ovredraftLimit = ovredraftLimit;
	}

	public double getOvredraftLimit() {
		return ovredraftLimit;
	}

	public void setOvredraftLimit(double ovredraftLimit) {
		this.ovredraftLimit = ovredraftLimit;
	}

	@Override
	public String printAccountInfo() {
		return super.printAccountInfo() + ", " +this.ovredraftLimit;
	}
}
