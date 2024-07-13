package com.interview.programming;

import java.util.Scanner;

public class evenOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Even: " + num);
		} else {
			System.out.println("Odd: " + num);
		}
	}

}
