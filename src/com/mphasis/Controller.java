package com.mphasis;

public class Controller {

	public static void main(String[] args) {
		Address ad = new Address(101, "Nuasahi", "Dhanatola", "Bhadrak", "Odisha", 756100);
		Student st = new Student(1, "Sher Ali Khan", 27, ad);
		Student st1 = new Student(2, "Taher Ali Khan", 26, ad);
		st.show();
		System.out.println("---------------------------------------");
		st1.show();
	}

}
