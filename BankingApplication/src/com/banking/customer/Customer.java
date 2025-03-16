package com.banking.customer;

public class Customer {
	
	public int customerId;
	public String name;
	public double balance;
	public String password;
	public long accountid;
	
	
	public Customer() {
		super();
	}

	public Customer(int customerId, String name, double balance, String password, long accountid) {
		this.customerId = customerId;
		this.name = name;
		this.balance = balance;
		this.password = password;
		this.accountid = accountid;
	}
	
}
