package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int arrSize = sc.nextInt();
		String[] a = new String[arrSize];
		System.out.println("Enters " + arrSize + " Value into ArrayList");
		for (int k = 0; k < arrSize; k++) {
			a[k] = sc.nextLine();
		}

		int size = a.length;
		System.out.println("You entered Value is :");
		for (int m = 0; m < size ; m++) {
			System.out.println(a[m]);
		}
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		for(String str:a ) {
			
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}
			else {
				map.put(str,1);
			}
		}
		System.out.println(map);
	}

}
