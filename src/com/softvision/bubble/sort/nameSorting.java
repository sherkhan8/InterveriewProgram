package com.softvision.bubble.sort;

import java.util.Arrays;
import java.util.Scanner;

public class nameSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {

			// int[] a = { 0, 2, 1, 4, 2, 3, 1, 2, 5 };
			System.out.println("Enter Array Size: ");
			int arrSize = sc.nextInt();
			String[] a = new String[arrSize];
			System.out.println("Enters " + arrSize + " Value into ArrayList");
			for (int k = 0; k < arrSize; k++) {
				a[k] = sc.nextLine();
			}

			int size = a.length;
			System.out.println("You entered Value is :");
			for (int m = 0; m <= arrSize ; ++m) {
				System.out.println(a[m]);
			}

			String temp = null;
			for (int i = 0; i < size ; i++) {
				for (int j = 1; j < size-1; ++j) {
					if (a[i].compareTo(a[j]) > 0) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}

				}
			}
			System.out.println(Arrays.toString(a));
		}
	}

}
