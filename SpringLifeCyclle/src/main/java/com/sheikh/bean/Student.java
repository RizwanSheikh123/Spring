package com.sheikh.bean;

public class Student {
	private int roll;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		System.out.println("property roll set");
		this.roll = roll;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + "]";
	}

	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
}
