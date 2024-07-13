package com.string;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class countCharacters {

	public void countOccurence(String input){
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		char[] ch=input.toCharArray();
		for(char op: ch){
			if(map.containsKey(op)){
				map.put(op,map.get(op)+1);
			}
			else{
				map.put(op, 1);
			}
			
		}

		System.out.println(map);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(true) {
		
		System.out.println("Enter Name: ");
		
		String input=sc.nextLine();
		countCharacters cc=new countCharacters();
		cc.countOccurence(input);
		}
	}

}
