package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class removingWhiteSpace {

	public void removingSpace(String input){
		//String op=input.replaceAll("\\s+", "");
		StringBuilder op=new StringBuilder();
		String[] sp=input.split(" ");
		for(String s:sp){
			op.append(s);
		}
		System.out.println(op);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Characters: ");
		
		String input=sc.nextLine();
		removingWhiteSpace cc=new removingWhiteSpace();
		cc.removingSpace(input);
	}
}
