package com.happiestmind;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter input: ");
			int in = sc.nextInt();

			int temp, rev = 0, out = 0;
			temp = in;
			while (in != 0) {
				out = in % 10;
				rev = rev * 10 + out;
				in = in / 10;
			}
			if (rev == temp) {
				System.out.println("Palindrom: " + rev);
			} else {

				System.out.println("Not Palindrom: " + rev);
			}
		}
	}

}
