package com.happiestmind;

import java.util.Scanner;

public class fibonaciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter input: ");
			long in = sc.nextLong();

			long n1 = 0, n2 = 1, n3;

			for (long i = 0; i < in; ++i) {
				System.out.print(n1 + " ");
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;

			}
			System.out.println();
		}
	}

}
