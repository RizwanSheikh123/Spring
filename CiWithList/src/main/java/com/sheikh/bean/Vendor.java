package com.sheikh.bean;

import java.util.List;

public class Vendor {
	private int vendorId;
	private String vendoreName;
	private String vendoreAddress;
	
	private List<Customer> customer;

	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendor(int vendorId, String vendoreName, String vendoreAddress, List<Customer> customer) {
		super();
		this.vendorId = vendorId;
		this.vendoreName = vendoreName;
		this.vendoreAddress = vendoreAddress;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendoreName=" + vendoreName + ", vendoreAddress=" + vendoreAddress + "]";
	}
	
	public void show(){
		for(Customer c: customer) {
			System.out.println(c);
		}
	}
}
