package com.self.bank;

public class Address {
	private int zipCode;
	private String region;
	private String city;
	
	public Address() {}
	
	public Address(int zipCode, String region, String city) {
		this.zipCode = zipCode;
		this.region = region;
		this.city = city;
	}
	
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public int getZipCode() {
		return zipCode;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}

	public String getRegion() {
		return region;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public String toString() {
		return zipCode + ", "+ region + ", " + city;
	}
}