package com.sheikh.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		//Constructor Injection With Collection With Predefined Classes
		ApplicationContext context = new ClassPathXmlApplicationContext("ap.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		emp.display();
	}
}
