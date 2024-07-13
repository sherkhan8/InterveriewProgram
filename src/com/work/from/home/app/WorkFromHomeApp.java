package com.work.from.home.app;

import java.util.Scanner;

public class WorkFromHomeApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("#1 for WFH: ");
			System.out.println("#2 for WFO: ");
			System.out.print("Select Your Choice: ");
			int option = scan.nextInt();

			switch (option) {

			case 1:
				System.out.println("You are safety");
				break;

			case 2:
				System.out.println("You are Not safety");
				break;
			}

		}
	}

}
