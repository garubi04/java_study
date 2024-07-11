package com.edu.test;
import com.edu.vo.Product;
import com.edu.vo.Customer;

public class ProductArrayTest2 {
	/*
	 * Test Class의 기능
	 * 객체 생성하기 위한 Test class
	 * Application을 호출하기 위한 start class
	 */
	public static void main(String[] args) {
		
		Product[ ] products1 = {
			new Product("신라면", 1200, 5, "농심"),
			new Product("삼다수 생수", 1000, 10, "농심"),
			new Product("하이타이", 14000, 5, "엘지"),
			new Product("짐빔", 130000, 5, "JIM")
		};
		
		Product[ ] products2 = {
				new Product("Terra", 2200, 5, "농심"),
				new Product("맥심커피", 20000, 10, "농심"),
				new Product("휘센 에어콘", 334000, 5, "대우"),
			};
		Customer c1 = new Customer(111, "이정재", "방배동");
		Customer c2 = new Customer(222, "정우성", "신사동");
	
		c1.buyProducts(products1);
		c2.buyProducts(products2);
		
		System.out.println("==== 1. 정우성이 구입한 물건중에서 30만원 이상 제품을 출력 ====\n");
		for(Product product : c2.getProducts()) {
			if(product.getPrice() >= 300000) {
				System.out.println(product.getDetails());
			}
		}
		
		System.out.println("==== 2. 이정재가 구입한 물건의 모든 maker를 출력 ====\n");
		for(Product product : c1.getProducts()) {
			System.out.println(product.getCompany());
		}
		
		System.out.println("==== 1. 이정재가 구입한 물건들의 총 가격을 출력 ====\n");
		int sum = 0;
		for(Product product : c1.getProducts()) {
			sum += product.getPrice() * product.getQuantity();
		}
		System.out.println(sum);
	}
}
