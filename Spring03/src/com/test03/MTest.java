package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	//이순신과 홍길동 호출
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		Emp lee = (Emp)factory.getBean("lee");
		Emp hong = factory.getBean("hong",Emp.class);
		
		System.out.println(lee);
		System.out.println(hong);

	}


}
