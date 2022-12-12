package com.sheikh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sheikh.bean.User;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
		/* BeanFactory */
    	
    	Resource resource = new ClassPathResource("com/sheikh/bean/applicationContext.xml");
    	BeanFactory fac =  new XmlBeanFactory(resource);
    	User user = (User) fac.getBean("user");
    	System.out.println(user.getUserId()+" "+user.getUserName()+" "+user.getUserAddress());
    	
    	/* ApplicationContext */
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/sheikh/bean/applicationContext.xml");
    	User user1 = (User) fac.getBean("user");
    	System.out.println(user.getUserId()+" "+user.getUserName()+" "+user.getUserAddress());
    }
}
