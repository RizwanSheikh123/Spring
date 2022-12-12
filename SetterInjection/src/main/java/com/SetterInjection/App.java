package com.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SetterInjection.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/SetterInjection/ap.xml");
        Employee e = (Employee)context.getBean("emp");
        System.out.println(e);
    }
}
