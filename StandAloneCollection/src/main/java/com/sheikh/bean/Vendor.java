package com.sheikh.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Vendor {
	private int vendorId;
	private String vendorName;
	private String vendorAddress;
	
	private List<String> customer;
	private Map<String,Integer> charges;
	private Properties properties;
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getCharges() {
		return charges;
	}

	public void setCharges(Map<String, Integer> charges) {
		this.charges = charges;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public List<String> getCustomer() {
		return customer;
	}

	public void setCustomer(List<String> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress
				+ ", customer=" + customer + "]";
	}
	
	
}
