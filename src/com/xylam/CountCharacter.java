package com.xylam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String in = sc.nextLine();
		char[] ch = in.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for(char op:ch) {
			if(map.containsKey(op)){
				map.put(op,map.get(op)+1);
			}
			else{
				map.put(op, 1);
			}
		}
		System.out.println(map);
	}

}
