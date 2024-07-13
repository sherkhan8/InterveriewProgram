package com.interview.programming;

import java.util.Scanner;

public class plaindromNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int orinialNum = sc.nextInt();
		int palindrom = orinialNum;
		int i = 0;
		int reverse = 0;
		while (orinialNum != 0) {
			int result = orinialNum % 10;
			reverse = reverse * 10 + result;
			orinialNum = orinialNum / 10;
		}
		if (reverse == palindrom) {
			System.out.println("Palindrom: ");
		} else {
			System.out.println("Not Palindrom");
		}

	}

}
