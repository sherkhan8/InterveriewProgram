package com.create.object;

public class cloneMethod implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	static int k;
	int a;

	public cloneMethod() {
		super();
		System.out.println("Default");
	}

	public String usingNewKeyword(String x) {

		System.out.println("X : " + x);
		a = 10;
		k = 30;
		System.out.println("Non-Static Method K : " + k);
		return x;
	}

	public static int usingNewKeyword1(int y) {

		System.out.println("Y : " + y);
		k = 20;
		System.out.println("Static Method K : " + k);
		return y;
	}

	public static void main(String[] args) {

		cloneMethod cm=new cloneMethod();
		try{
			cloneMethod unk=(cloneMethod)cm.clone();
			  System.out.println(k);
			  System.out.println(unk.a); 
			  unk.usingNewKeyword("ali");
			  usingNewKeyword1(5);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
