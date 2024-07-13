package com.java8.features;

public class LamdaExpression {

	public static void main(String[] args) {
		Additional add=(int a, int b)-> a+b;
		System.out. println(add.add2Num(4,5));
		
		Additional2 add1=(String name)->{return "Mr Khan ";};
		
		System.out.println(add1.sayHello("Welcome"));
	}

}
