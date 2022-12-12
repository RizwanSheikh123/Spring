package com.sheikh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sheikh.bean.Demo;
import com.sheikh.bean.Student;
import com.sheikh.bean.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/sheikh/ap.xml");
        //Student st = (Student)context.getBean("student",Student.class);
        //System.out.println(st);
        //Note that destroy method jab tak call nahi hogi jab tak hum pre shoutdown hook
        //enable nahi kar dete. registerShutdownHook() method AbstractApplicationContext interface me 
        //hai. To isliye hum ApplicationContext ki jagah AbstracApplicationContext ko use 
        //karenge
        context.registerShutdownHook();
        //init aur destroy ke naam bhi change karke dekh lena bean aur configuration file me.
        //Teacher t = (Teacher)context.getBean("teacher",Teacher.class);
        //System.out.println(t);
        Demo d = (Demo)context.getBean("demo",Demo.class);
        System.out.println(d);
    }
}
