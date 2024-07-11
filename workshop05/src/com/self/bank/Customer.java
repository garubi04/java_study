package com.self.bank;
import com.self.bank.Customer;
import com.self.bank.Account;

public class Customer {
	private String name;
	private int ssn;
	private Account account;
	private Address address;
	
	public Customer() {}
	
	public Customer(String name, int ssn, Account account, Address address) {
		this.name = name;
		this.ssn = ssn;
		this.account = account;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	
	public int getSsn() {
		return ssn;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public void setAddress(Address adress) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public String toString() {
		return name + ", " + ssn + ", " + account + ", " + address; 
	}
	
}
