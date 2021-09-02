package com.test01;



import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
		//today 호출 (오늘날짜)
		
		Date start = factory.getBean("start",Date.class);
		System.out.println(start);
		//객체생성(ApplicationContext)이 먼저 되니까 beanTest가 먼저 출력된 것. syso보다
		BeanTest bean = factory.getBean("beanTest",BeanTest.class);
	}


}
