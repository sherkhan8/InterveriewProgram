package com.mphasis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<String, Integer> map=new HashMap<String, Integer>();
		System.out.println("Enter Message: ");
		String input=sc.nextLine();
		
		String[] sp=input.split(" ");
		for(String str:sp) {
			
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}
			else {
				map.put(str, 1);
			}
		}
		System.out.println(map);

	}

}
