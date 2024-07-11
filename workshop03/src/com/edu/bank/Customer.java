package com.edu.bank;
import com.edu.bank.Account;

public class Customer {
	public String name;
	public String address;
	Account account;
	
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getCustomerInfo() {
		return name+","+address;
	}
	
	public void createAccount(Account account) {
		this.account = account;
	}
	
	public Account getAccount() {
		return account;
	}
}
