package com.test02;

public class MTest {
	public static void main(String[] args) {
		MessageBean bean = new MessageBeanEn();
		bean.sayHello("Spring");
		//인터페이스를 쓰니까 결합도가 낮아졌다
		bean = new MessageBeanKo();
		bean.sayHello("스프링");
	}

}
