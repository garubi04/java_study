package com.edu.bank.test;

import com.edu.bank.Account;
import com.edu.bank.Customer;

public class BankTest {
	public static void main(String[] args) {
		Customer james=  new Customer("James", "NY");
		Customer tomas=  new Customer("Tomas", "Brandon");
		
		james.openAccount(new Account(123, "Toss Bankk", 10000));
		tomas.openAccount(new Account(321, "KaKao Bankk", 0));
		
		Account jamesAccount=james.getAccount();
		System.out.println("입금 20000 원 >> ");
		jamesAccount.deposit(20000.0);
		
		System.out.println("입금 15000 원 >> ");
		jamesAccount.deposit(15000.0);
		
		System.out.println("출금 5000 원 >> ");
		jamesAccount.withdraw(5000.0);
		
		System.out.println("최총 잔액은 >> "+jamesAccount.getBalance()+" 원");
		
	}
}

