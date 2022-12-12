package com.sheikh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("ap.xml");
       Demo d=context.getBean("demo",Demo.class);
       System.out.println(d);
       
       SpelExpressionParser spel = new SpelExpressionParser();
       Expression ex=spel.parseExpression("22+44");
       System.out.println(ex.getValue());
    }
}
