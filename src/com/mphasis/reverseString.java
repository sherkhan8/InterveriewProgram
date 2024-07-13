package com.mphasis;

import java.util.Scanner;

public class reverseString {

	public static void revser(String str) {
		int len = str.length() - 1;
		String temp = str;
		System.out.println(temp);
		String rev = "";
		for (int i = len; i >= 0; i--) {
			char ch = str.charAt(i);
			rev = rev + ch;
		}
		if (rev.equals(temp)) {
			System.out.println("Palindrom: " + rev);
		} else {
			System.out.println("Not Palindrom: " + rev);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text :");
		String text = sc.nextLine();
		revser(text);

	}

}
