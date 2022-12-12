package com.sheikh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sheikh.Student;
import com.sheikh.Teacher;

@Configuration
//The @ComponentScan annotation is used only if we are using a 
//component based annotation(@Component) on a class.
//@ComponentScan(basePackages = "com.sheikh")
public class JavaConfig {
	/* This is the alternative to @Component and <bean></bean> */
	//Creating a new object. Since we are using @Bean annotation
	//There is no need for @ComponentScan annotation
	@Bean
	public Student getStudent() {	//method name will be bean id
		Student st = new Student(getTeacher());
		return st;
	}

	//@Bean("teach")		//user provide bean name in paranthesis
	@Bean(name= {"con","don","phone","teach"})
	public Teacher getTeacher() {	//method name will be bean id
		Teacher t = new Teacher();
		return t;
	}
}
