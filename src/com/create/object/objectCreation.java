package com.create.object;

public class objectCreation {

	static int k;
	int a;

	public objectCreation() {
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
		try {
			// TODO Auto-generated method stub
			// Using new Keyword
			
			//  objectCreation unk=new objectCreation(); 
			
			// using forName()
			Class obj = Class.forName("com.create.object.objectCreation");
			objectCreation unk=(objectCreation)obj.newInstance();
			  System.out.println(k);
			  System.out.println(unk.a); 
			  unk.usingNewKeyword("ali");
			  usingNewKeyword1(5);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
