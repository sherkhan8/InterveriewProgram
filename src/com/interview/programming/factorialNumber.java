package com.interview.programming;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int orinialNum = sc.nextInt();
		int fact = 1;
		for (int i = 1; i < orinialNum; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
