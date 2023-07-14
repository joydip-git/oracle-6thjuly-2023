package com.java.inheritance.entities;

public class Account {
	/*protected int accountId;
	protected String accountHolderName;
	protected double accountBalance;*/
	private int accountId;
	private String accountHolderName;
	private double accountBalance;
	
	//by default the default constructor of Account class will be invoked 
	//from child class constructor by runtime implicitly
	public Account() {
		System.out.println("default ctor of Account");
	}
	
	public Account(int accountId, String accountHolderName, double accountBalance) {
		System.out.println("parameterized ctor of Account");
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void deposit() {}
	public void withdraw() {}
	
}
