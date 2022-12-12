package com.sheikh.bean;

import java.util.Map;

public class Book {
	private int bid;
	private String bname;
	private Map<String, String> details;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bid, String bname, Map<String, String> details) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.details = details;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", details=" + details + "]";
	}
	
	public void show() {
		for(Map.Entry<String, String> m : details.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	
}
