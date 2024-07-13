package com.happiestmind;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter input: ");
			String in = sc.nextLine();

			String rev = "", temp = "";
			temp = in;
			int len = in.length();
			for (int i = len - 1; i >= 0; i--) {
				rev = rev + in.charAt(i);
			}
			// System.out.println(rev);

			if (rev.equalsIgnoreCase(temp)) {
				System.out.println("Palindrom :" + rev);
			} else {
				System.out.println("NoPalindrom :" + rev);
			}
		}
	}
}
