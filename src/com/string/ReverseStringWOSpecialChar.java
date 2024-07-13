package com.string;

import java.util.Scanner;

public class ReverseStringWOSpecialChar {

	public void reverse(String input) {
		char[] ch = input.toCharArray();
		int r = ch.length - 1, l = 0;
		while (l < r) {
			if (!Character.isAlphabetic(ch[l]))
				l++;
			else if (!Character.isAlphabetic(ch[r]))
				r--;
			else {
				char tmp = ch[l];
				ch[l] = ch[r];
				ch[r] = tmp;
				l++;
				r--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Characters: ");
		
		String input=sc.nextLine();
		ReverseStringWOSpecialChar cc=new ReverseStringWOSpecialChar();
	
		System.out.println("Input string: " + input);
		cc.reverse(input);

	}

}
