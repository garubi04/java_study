package com.edu.bank.test;
import java.util.Scanner;
import com.edu.bank.Account;
import com.edu.bank.Customer;

public class BankTest {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean isNotNeedToExit = true;
	int selectedMenu = 0;
	System.out.println("===============은행 메뉴===============");
	System.out.println("1. 고객 생성 2. 계좌 개설 3. 입금 4. 출금 5. 잔액조회 6. 조객정보조회 7. 종료");
	
	Customer james = null;
	Account jamesAccount = null;
	
	do {
		System.out.println("기능을 선택해주세요.");
		selectedMenu = sc.nextInt();
		if(selectedMenu >= 1 && selectedMenu <= 7) {
			switch(selectedMenu) {
			case 1: 
				System.out.println("고객 정보 생성 기능을 선택하셨습니다.");
				james = new Customer("James", "Seoul");
				System.out.println("고객정보 생성이 완료되었습니다.");
				break;
			case 2:
				System.out.println("계좌 개설 기능을 선택하셨습니다.");
				System.out.println(james.getCustomerInfo() + "\n" );
				james.createAccount(new Account(123, "toss", 1000));
				break;
			case 3:
				System.out.println("입금을 선택하셨습니다.");
				System.out.println("얼마를 입금하시겠습니까?\n");
				double depositAmount = sc.nextDouble();
				jamesAccount = james.getAccount();
				jamesAccount.deposit(depositAmount);
				break;
			case 4:
				System.out.println("출금을 선택하셨습니다.");
				System.out.println("얼마를 출금하시겠습니까?\n");
				double withdrawAmount = sc.nextDouble();
				jamesAccount = james.getAccount();
				jamesAccount.withdraw(withdrawAmount);
				break;
			case 5:
				System.out.println("잔액조회를 선택하셨습니다.");
				System.out.println(james.name + "님의 잔액 : " + jamesAccount.balance );
				break;
			case 6:
				System.out.println("고객 정보 조회 기능을 선택하셨습니다.");
				System.out.println(james.name + "님의 정보 : " + james.getCustomerInfo() + "\n" );
				break;
			case 7:
				System.out.println("감사합니다, 또 다시 이용해주세요");
				isNotNeedToExit = false;
			}
		}
		else {
			System.out.println("1부터 7까지의 숫자를 선택해주세요");
		}
	} while (isNotNeedToExit);	
	
	}	
}
