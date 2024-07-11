package com.edu.test;
import com.edu.vo.Customer;
import com.edu.vo.Product;
import com.edu.service.OutletService;

public class OutletServiceTest3 {
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
		Customer c3 = new Customer(333, "제니", "방배동");
				
		Customer[ ] customers = {c1, c2, c3};
		customers[0].buyProducts(products1);
		customers[1].buyProducts(products2);
		

		//System.out.println(customers[0]);
		
		//1
		System.out.println("=========="+customers[0].getName()+" 님이 구매하신 상품정보입니다========\n");
		OutletService service = new OutletService();
		Product[] pros = service.getAllProduct(customers[0]);
		for(Product product : pros) System.out.println(product.getDetails());
		
		//2
		System.out.println("=========="+customers[0].getName()+" 님이 구매하신 상품maker입니다========\n");
		String[] makers = service.getMakerInfo(customers[0]);
		for(String maker : makers) System.out.println(maker);
		
		//3
		System.out.println("==========222 고객님 검색 결과입니다========\n");
		Customer customer = service.findCustomer(customers, 222);
		System.out.println(customer.getCustomerInfo());
		
		//4
		System.out.println("==========같은 동네 거주하는 고객 정보입니다.========\n");
		Customer[] addrCustomers = service.findCustomer(customers, "방배동");
		for(Customer c : addrCustomers) {
			if(c==null) break;
			System.out.println(c.getCustomerInfo());
		}
		
		//5
		System.out.println("=========="+customers[0].getName()+" 님이 구매하신 물품중 최고가 입니다.========\n");
		System.out.println(service.getMaxPriceProduct(customers[1]));
		
		//6
		
				
	}
}
