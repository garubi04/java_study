package com.edu.capsule;

public class MyDate {
	private int month;
	private int day;
	
	/*
	 * 1~12에 해당하는 월 값이 들어올 때만 필드에 값을 할당
	 * 아니면 에러메시지 출력
	 */
	
	public boolean setMonth(int month) {
		if (month >=1 && month <= 12) {
			this.month = month;
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	/*
	 * 1,3,5,7,8,10,12 -> 1~31
	 * 2월 -> 1~28
	 * 4,6,9,11 -> 1~30
	 */
	
	public boolean setDay(int day) {
		if (day >=1 && day <= 31) {
			switch (day) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 12:
				this.day = day;
				return true;
			case 4:
			case 6:
			case 9:
			case 11:
				if(day <= 30) {
					this.day = day;
					return true;
				
				}
				else {
					return false;
				}
			default:
				if(day <= 28) {
					this.day = day;
					return true;
				}
				else {
					return false;
				}
			}
		}
			
			else
				return false;
	}
	
	public int getDay() {
		return day;
	}
	
	private void errorMsg() {
		System.out.println("[에러] Invalid Value... ");
	}
}
