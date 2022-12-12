package com.sheikh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sheikh.bean.Student;

public class Main {
	public static void main(String[] args) {
		//Constructor Injection With Dependent Classes
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sheikh/config/ap.xml");
		Student st = (Student) context.getBean("st");
		System.out.println(st);
	}
}
