package com.test01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
public class MyAdvice {
	@Before("execution(public * *(..))")
	public void beforeSaying(JoinPoint join) {
		System.out.println("당신의 이름은 무엇입니까?");
	}
	
	
	@AfterReturning(pointcut="execution(public * *(..))")
	public void afterReturnSaying(JoinPoint join) {
		System.out.println("직업이 무엇입니까?");
		
	}
	
	@After("execution(public * *(..))")
	public void afterSaying(JoinPoint join) {
		System.out.println("이름이 멋지시네요");
	}
	

}
