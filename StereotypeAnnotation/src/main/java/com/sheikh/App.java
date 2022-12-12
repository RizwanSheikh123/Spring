package com.sheikh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void  main( String[] args )
    {
    	//Spring container creates a single instance per IoC container  
        ApplicationContext context=new ClassPathXmlApplicationContext("ap.xml");
		/*
		 * Student st1 = (Student)context.getBean("st",Student.class);
		 * System.out.println(st1.hashCode()); Student st2 =
		 * (Student)context.getBean("st",Student.class);
		 * System.out.println(st2.hashCode());
		 * 
		 * ApplicationContext context1=new ClassPathXmlApplicationContext("ap.xml");
		 * Student st3 = (Student)context1.getBean("st",Student.class);
		 * System.out.println(st3.hashCode()); Student st4 =
		 * (Student)context1.getBean("st",Student.class);
		 * System.out.println(st4.hashCode());
		 */
        
        Teacher t1 = (Teacher)context.getBean("teach");
        System.out.println(t1.hashCode());
        
        Teacher t2 = (Teacher)context.getBean("teach");
        System.out.println(t2.hashCode());
    }
}
