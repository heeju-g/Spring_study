package com.test06;

public class MTest {
	
	public static void main(String[] args) {
		
		BeanFactory factory = new BeanFactory();
		TV tv = (TV) factory.getBean("lg");
		
		tv.powerOn();
		tv.powerDown();
		tv.volumeOn();
		tv.volumeDown();
		
	}

}
