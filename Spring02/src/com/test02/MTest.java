package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		//bean으로 등록된 2명 출력
		//address로 형변환 안해주면 에러가 뜸. 큰타입(오브젝트)를 작은타입으로 해주려면 명시적 형번환해야함
		//그냥 id가 heeju인 오브젝트를 가져오는 것
		Address heeju = (Address) factory.getBean("heeju");
		Address jamin = (Address) factory.getBean("jamin");
		
		System.out.println(heeju);
		System.out.println(jamin);
	}

}
