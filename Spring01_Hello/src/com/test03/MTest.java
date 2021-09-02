package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		//기존방식(지금은 안씀)
		//1.
		//Resource res = new FileSystemResource("src/com/test03/bean.xml");
		//2.
		//Resource res = new ClassPathResource("com/test03/bean.xml");
		//3.현재방식
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/bean.xml");
		//아주 중요한 특징!! 객체를 스프링이 만들기 시작
		MessageBean bean = (MessageBean) factory.getBean("english");
		bean.sayHello("Spring");
		
		bean = (MessageBean) factory.getBean("korean");
		bean.sayHello("스프링");
	}

}
/*
 ApplicationContext, ClassPathXmlApplicationContext
 BeanFactory <- AppliactionContext <- ClassPathXmlApplicationContext(xml경로를 읽어서 applicationcontext객체 만들거야)
 
 ApplicationContext 객체는 스프링 컨테이너의 인스턴스이다
 스프링은 applicationcontext 인터페이스의 몇가지 기본구현을 제공한다
 그 중, classpathxmlapplicationcontext는 xml형식의 독립형 어플리케이션에 적합
 (지정된 classpath 에서 xml파일을 읽어서 객체생성)
 
 ----------
 Container : 담는 그릇(bean을 저장하고 관리하는 객체) 
 Content : 기능
 Context : 기능을 구현하기 위한 정보(설정)
 
 */
