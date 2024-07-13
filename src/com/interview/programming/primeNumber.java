package com.interview.programming;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int prime = sc.nextInt();

		boolean flag = false;
		int i = 2;
		while (i <= prime / 2) {
			if (prime % i == 0) {
				flag = true;
				break;
			}
			i++;
		}
		if (!flag) {
			System.out.println("True ");
		} else {
			System.out.println("False ");
		}
	}

}
