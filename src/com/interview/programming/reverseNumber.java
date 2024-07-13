package com.interview.programming;

import java.util.Scanner;


public class reverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int dividend=sc.nextInt();
		int reverse=0;
		int quotient=0;
		int remainder=0;
		int divisor=10;
		while(dividend!=0){
			remainder=dividend%divisor;
			reverse=reverse*10+remainder;
			dividend=dividend/10;
		
		}
	System.out.println(reverse);
	}

}
