package com.interview.programming;

import java.util.Scanner;

public class fibonaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int f1 = 0;
		int f2 = 1;
		int sum = 0;
		int i = 1;
		// using for loop
		/*
		 * for (int i = 0; i < n; i++) { sum=f1+f2; f1=f2; f2=sum;
		 * System.out.print(f1+","); }
		 */

		// using while loop
		while (i <= n) {
			sum = f1 + f2;
			f1 = f2;
			f2 = sum;
			System.out.print(f1 + ",");
			i++;

		}

	}

}
