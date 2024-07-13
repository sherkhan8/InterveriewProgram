package com.string;

public class stringPoolConcept {

	public static void main(String[] args) {
		String a = new String("xya");
		// String b=a;
		// String s = "Hello";
		// String s4 = "Hello";
		// String str = "Java";
		// String str2 = s.concat(str);
		// String str3=str2;
		// String str1 = "Hello".concat("Java");
		// System.out.println("Output1 : "+str1==str2);
		// System.out.println("Output2 : "+str2==str3);
		// System.out.println("3 : "+a==b);
		// System.out.println("4 : "+s==s4);
		// System.out.println(str2);
		// System.out.println(str1);
		// System.out.println(str2.hashCode()==str1.hashCode());
		// System.out.println(str2.hashCode());
		// System.out.println(str1.hashCode());

		// System.out.println(str2.equals(str1));

		a.concat("abc");
		System.out.println(a);
		String s = "Hello";
		String s1 = new String("Hello");
		String s2 = new String("Hello").intern();
		System.out.println(s == s1);

		System.out.println(s1 == s2);
		System.out.println(s == s2);

	}

}
