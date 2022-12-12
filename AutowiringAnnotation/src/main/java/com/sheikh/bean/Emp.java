package com.sheikh.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address3")
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(Address address) {
		super();
		System.out.println("inside constructor");
		this.address = address;
	}
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("address setter");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
}