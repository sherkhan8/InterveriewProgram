package com.mphasis;

public class singletonClass {

	private static singletonClass sc;

	private singletonClass() {
		super();
	}

	static {
		sc = new singletonClass();
	}

	public static singletonClass getInstance() {
		if (sc == null) {
			sc = new singletonClass();
		}
		return sc;
	}

	public void show() {
		System.out.println("Demo");
	}

	public static void main(String[] args) {
		singletonClass scc1 = singletonClass.getInstance();
		singletonClass scc2 = singletonClass.getInstance();
		System.out.println(scc1.hashCode());
		System.out.println(scc2.hashCode());
	}

}
