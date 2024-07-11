package com.edu.service;
import com.edu.vo.Product;
import com.edu.vo.Customer;


//Outlet 에서 상품을 구매하는 고객의 기능을 정의하고 있는 클래스...
//서비스 클래스는 기능만으로 이뤄지는 클래스
//vo, test, service클래스를 작성하게 되면 드디어 구조적인 Application을 자바 SE기반으로 작성

public class OutletService {
	//1. 특정 고객이 구입한 상품을 반환하는 기능
	public Product[] getAllProduct(Customer customer) {
		return customer.getProducts();
	}
	
	//2. 특정 고객이 구입한 상품의 MAKER들 만을 반환하는 기능
	public String[ ] getMakerInfo(Customer vo) {
		String[ ] temp = new String[vo.getProducts().length]; // 사이즈 명시
		int idx = 0;
		for(Product p : vo.getProducts())
			temp[idx++] = p.getMaker();
		return temp;
	}
	
	//3. Outlet안에 있는 고객중에서 특정한 고객을 검색하는 기능
	public Customer findCustomer(Customer[ ] customers, int ssn) {
		Customer customer = null;
		for(Customer c : customers) {
			if(c.getSsn() == ssn) 
				customer = c;
		}
		return customer;
	}
	
	//4. Outlet안에 있는 고객중에서 동일한 주소를 가지고 고객들을 반환
	public Customer[] findCustomer(Customer [ ] customers, String address) {
		Customer[] temp  = new Customer[customers.length];
		int idx=0;
		for(Customer c : customers) {
			if(c.getAddress().equals(address))
				temp[idx++] = c;
		}
		return temp;
	}
	
	//5. 특정 고객이 구입한 물건 중에서 최고가에 해당하는 물건의 가격을 리턴하는 기능
	public int getMaxPriceProduct(Customer vo) {
		int max = 0;
		Product[] pr = vo.getProducts();
		for(Product p : pr) {
			if(p.getPrice() > max) {
				max=p.getPrice();
			}
		}
		return max;
	}
	
	//6. 모든 고객이 구입한 물건중 특정 가격 이상이 되는 제품들을 반환하는 기능
	public   Product[ ] getMorePriceProduct(Customer[ ] customers, int price){
		int size = 0;
		for(Customer c : customers) {
			if(c.getProducts() !=null)
				size += c.getProducts().length;
		}
		Product[] temp = new Product[size];
		int idx = 0;
		//상품을 구매하지않은 제니를 위한 구문
		for(Customer c : customers) {
			if(c.getProducts() == null) continue;
			for(Product p : c.getProducts()) {
				if( p.getPrice() >= price)
					temp[idx++] = p;
			}
		}
		return temp;
	}
}
