package com.capgimini;

public class Parent {

	protected Object print(String obj) {
		System.out.println("return obj");
		return obj;
	}
	public int print(int obj) {
		System.out.println("return int");
		return 1;
	}
}
