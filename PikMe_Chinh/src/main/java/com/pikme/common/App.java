package com.pikme.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
 
		ExampleBean obj = (ExampleBean) context.getBean("exampleBean");
		obj.printHello();
    }
}
