package com.softvision.bubble.sort;

import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){

		//int[] a = { 0, 2, 1, 4, 2, 3, 1, 2, 5 };
		System.out.println("Enter Array Size: ");
		int arrSize=sc.nextInt();
		int[] a=new int[arrSize];
		System.out.println("Enters "+arrSize+" Value into ArrayList");
		for(int k=0;k<arrSize;k++){
			a[k]=sc.nextInt();
		}
		
		int size = a.length;
		System.out.println("You entered Value is :");
		for(int m=0;m<size;m++){
			System.out.println(a[m]);
		}
		

		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < size - i; j++) {
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}

			}

		}
		System.out.println("After Sorting : ");
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		}
		
	}


}
