package com.edu.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Triangle extends Shape {
	@Autowired
	public Triangle() {
	}
	
	public Triangle(String title, int data1, int data2) {
		super(title, data1, data2);
	}

	@Override
	public void viewSize() {
		System.out.println(title + "의 넓이 : " + ((double)(data1*data2))/2);
	}
}
