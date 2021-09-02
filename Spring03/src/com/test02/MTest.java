package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Emp heeju =  (Emp)factory.getBean("heeju");
		Emp lee = factory.getBean("lee",Emp.class);
		
		System.out.println(heeju);
		System.out.println(lee);
		
		
	}

}
