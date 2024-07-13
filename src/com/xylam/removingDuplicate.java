package com.xylam;

import java.util.Scanner;

public class removingDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ch = { 2, 3, 1, 4, 3, 10, 23, 50 };

		int len = ch.length;
		int[] temp = new int[len];
		int j = 0;
		for (int i = 0; i < len - 1; i++) {

			if (ch[i] != ch[i + 1]) {
				temp[j++] = ch[i];

			}
			
		}
		temp[j++] = ch[len - 1];
		for (int i = 0; i < j; i++) {
			ch[i]=temp[i];
		}
		
		for (int i = 0; i < len; i++) {
			System.out.print(ch[i]+",");
		}

	}

}
