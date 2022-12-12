package com.sheikh.bean;


import java.util.List;

public class Employee {
	private int eid;
	private String ename;
	private String ejob;
	
	private List<String> address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, String ejob, List<String> address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ejob = ejob;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ejob=" + ejob + "]";
	}

	public void display() {
		for(String s : address) {
			System.out.println(s);
		}
	}
}
