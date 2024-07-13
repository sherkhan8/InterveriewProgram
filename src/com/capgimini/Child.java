package com.capgimini;

public class Child extends Parent{

	/*public String print(String name) {
		System.out.println("return name");
		return name;
	}*/
	protected Object print(String obj) {
		System.out.println("return obj Child");
		return obj;
	}
	public int print(int obj) {
		System.out.println("return int child");
		return 1;
	}
	public static void main(String[] args) {
		Parent p=new Child();
		p.print("Ali");
		p.print(1);
	}

}
