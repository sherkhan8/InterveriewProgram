package Java4s.Test;

import java.util.Scanner;

public class ReplaceUnwantedCharacter {


	public void unwantedCharacter(){
		while(true){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please Enter Anything: ");
		String s=sc.nextLine();
		String finalString=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(finalString);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceUnwantedCharacter replace=new ReplaceUnwantedCharacter();
		replace.unwantedCharacter();
	}

}
