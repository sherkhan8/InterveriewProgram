package com.siemens;

import java.util.Scanner;

public class alternativeWordMerge {

	public String merge(String one, String two) {
		StringBuffer sb = new StringBuffer();
		int size1 = one.length();
		int size2 = two.length();
		int i = 0, j = 0;
		while (i < size1 && j < size2) {
			sb.append(one.charAt(i++));
			sb.append(two.charAt(j++));
		}
		if (i != size1) {
			sb.append(one.substring(i));
		}
		if (j != size2) {
			sb.append(two.substring(j));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		try {
			while(true){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter First: ");
			String first = sc.nextLine();
			System.out.print("Enter Second: ");
			String second = sc.nextLine();
			alternativeWordMerge awm=new alternativeWordMerge();
			System.out.println("Output: "+awm.merge(first, second));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
