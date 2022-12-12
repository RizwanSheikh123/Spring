package com.sheikh.bean;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerAddress;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerName, String address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + customerAddress + "]";
	}
	
}
