package com.sheikh.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Demo {
	private String subject;

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	//Note that the below annotation is a  part of Java EE and is deprecated
	//in java 9 onwards. To use this annotation java9 onwards we have to used
	//their dependencies
	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ending method");
	}
}
