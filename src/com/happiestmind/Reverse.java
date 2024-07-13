package com.happiestmind;

import java.util.Scanner;

public class Reverse {

	public void stringReverse(String s) {

		int len = s.length();

		for (int k = len - 1; k >= 0; k--) {
			char ch = s.charAt(k);
			System.out.print(ch);

		}
		System.out.println();
	}

	public void wordReverse(String s) {

		String[] sp = s.split(" ");
		int len = sp.length;
		String rev, temp, out = null;

		for (int k = len - 1; k >= 0; k--) {
			System.out.print(sp[k] + " ");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		String in = sc.nextLine();
		Reverse pc = new Reverse();
		pc.stringReverse(in);
		System.out.println("-------------------------");
		pc.wordReverse(in);

	}

}
