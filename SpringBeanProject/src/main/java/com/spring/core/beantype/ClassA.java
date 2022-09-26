package com.spring.core.beantype;

public class ClassA {

	ClassB b;
	public ClassA() {
		super();
		System.out.println("Inside class A Constructor");
	}

	public void getValue() {
		System.out.println("Inside class A Method");
	}
}
