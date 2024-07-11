package com.edu.bank;

public class Customer {
	String name;
	String address;
	
	Account account;
	
	public Customer() {}
	public Customer(String name, String address) {		
		this.name = name;
		this.address = address;
	}
	
	public void openAccount(Account account) {
		this.account = account;
	}
	public Account getAccount() {
		return account;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
	
}
