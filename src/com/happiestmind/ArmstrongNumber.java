package com.happiestmind;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int rem = 0;
			System.out.println("Enter Number: ");
			int rev = 0;
			int n = sc.nextInt();
			int temp = n;
			while (n > 0) {
				rem = n % 10;
				n = n / 10;
				rev = rev + (rem * rem * rem);
			}
			if (rev == temp) {
				System.out.println("Amstrong Number: " + temp);
			} else {
				System.out.println("Not Amstrong Number: " + temp);
			}
		}
	}
}
