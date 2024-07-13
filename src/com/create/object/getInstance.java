package com.create.object;

import java.lang.reflect.Constructor;

public class getInstance {

	static int k;
	int a;

	public getInstance() {
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
			Constructor<getInstance> cons=getInstance.class.getConstructor();
			getInstance unk=(getInstance)cons.newInstance();
			  System.out.println(k);
			  System.out.println(unk.a); 
			  unk.usingNewKeyword("ali");
			  usingNewKeyword1(5);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
