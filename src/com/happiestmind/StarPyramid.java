package com.happiestmind;

import java.util.Scanner;

public class StarPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter input: ");
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i = n-1; i > 0; i--) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
