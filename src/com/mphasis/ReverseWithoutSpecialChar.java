package com.mphasis;

public class ReverseWithoutSpecialChar {

	public static void checker(char[] str) {

		int l = str.length - 1, r = 0;

		while (r < l) {
			if (!Character.isAlphabetic(str[r])) {
				r++;
			} else if (!Character.isAlphabetic(str[l])) {
				l--;
			} else {
				char temp = str[r];
				str[r] = str[l];
				str[l] = temp;
				r++;
				l--;
			}
		}
	}

	public static void main(String[] args) {
		String s = "Sher@Ali@Khan";

		char[] ch = s.toCharArray();
		checker(ch);
		String rev = new String(ch);
		System.out.println("Output string: " + rev);
	}

}
