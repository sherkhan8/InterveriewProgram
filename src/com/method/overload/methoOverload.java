package com.method.overload;

public class methoOverload {

	public String print(Object obj) {
		System.out.println("Obj: "+obj);
		return obj.toString();
	}
	
	public String print(String s) {
		System.out.println("S: "+s);
		return s;
	}
	public int print(int k) {
		System.out.println("K: "+k);
		return k;
	}
}
