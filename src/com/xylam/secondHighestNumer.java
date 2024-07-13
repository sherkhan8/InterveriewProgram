package com.xylam;

import java.util.Scanner;

public class secondHighestNumer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ch = { 2, 3, 1, 4, 3 ,10,23,50};
		int max = 0;
		int secMax = 0;
		int len = ch.length;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			if (ch[i] > max) {
				secMax = max;
				max = ch[i];
			} else if (ch[i] > secMax) {
				secMax = ch[i];

			}
		}
		System.out.println(secMax);
	}

}
