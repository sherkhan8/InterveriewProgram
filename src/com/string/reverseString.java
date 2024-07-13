package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class reverseString {

	
	public void reverseString(String input){

		String[] sp=input.split(""); 
		int len=sp.length;
		String rev="";
		for(int i=len-1; i>=0 ; i--){
			rev=rev+input.charAt(i);
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Characters: ");
		
		String input=sc.nextLine();
		reverseString cc=new reverseString();
		cc.reverseString(input);
	}
}
