package com.sheikh.bean;

import java.util.Map;

public class Book {
	private String bname;
	private String bsubject;
	
	private Map<Id,Writer> details;

	public Book() {
		super();
	}

	public Book(String name, String subject, Map<Id, Writer> details) {
		super();
		this.bname = name;
		this.bsubject = subject;
		this.details = details;
	}
	
	@Override
	public String toString() {
		return "Book [bname=" + bname + ", bsubject=" + bsubject + ", details=" + details + "]";
	}

	public void show() {
		for(Map.Entry<Id, Writer> bd:details.entrySet()) {
			System.out.println(bd.getKey()+" "+bd.getValue());
		}
	}
}
