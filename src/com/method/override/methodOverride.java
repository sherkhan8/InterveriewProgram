package com.method.override;

import com.method.overload.methoOverload;

public class methodOverride extends methoOverload{
	public String print(Object obj) {
		System.out.println("Child Obj: "+obj);
		return obj.toString();
	}
	
	public String print(String s) {
		System.out.println("Child S: "+s);
		return s;
	}
	public void print1(Double d) {
		System.out.println("Child D: "+d);
	}
	public static void main(String[] args) {
		methodOverride mo=new methodOverride();
		mo.print(null);
		mo.print(10);
		mo.print1(20.5);

	}

}
