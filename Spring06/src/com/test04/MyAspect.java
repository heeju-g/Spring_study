package com.test04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	//타겟 실행 전
	@Before("execution(public * *(..))")
	public void before(JoinPoint join) {
		System.out.println("출석카드를 찍는다");
	}
	//타겟호출시 예외 발생하면
	@AfterThrowing("execution(public * *(..))")
	public void throwing(JoinPoint join) {
		System.out.println("쉬는 날이었다");
	}
	//예외없이 정상실행된 이후 리턴값을 받아서
	@AfterReturning(pointcut="execution(public * *(..))",returning="returnVal")
	public void returning(JoinPoint join, Object returnVal) {
		System.out.println(returnVal + "공부하는 날이었다");
		
	}
	//타겟실행 후
	@After("execution(public * *(..))")
	public void after(JoinPoint join) {
		System.out.println("집에 간다");
	}
	

}
