package Java4s.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringToCharArray {
// String Char Array using inbuilt function
	public void StringToCharArray(){
		while(true){
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter Name:");
		String input=sc.nextLine();
		
		char[] ch=input.toCharArray();
		for(char output:ch){
			System.out.println(output);
			}
		}
	}
	// String Char Array without inbuilt function
		public void StringToCharArrayWithout(){
			while(true){
			Scanner sc=new Scanner(System.in);
			System.out.print("Please Enter Name:");
			String input=sc.nextLine();
			
		     char[] chArray = new char[input.length()];

		     for(int i=0; i<input.length(); i++){
		        chArray[i] = input.charAt(i);
		     }

		     for(char ch : chArray){
		        System.out.println(ch);
		     }
		  }
		}
	public static void main(String[] args) {
		StringToCharArray stc=new StringToCharArray();
		
		Scanner reader = new Scanner(System.in);
        System.out.print("Enter 1 for Built-In function, 2 for Non Built-In function");
        // nextDouble() reads the next double from the keyboard

        System.out.print("Please choose (1, 2): ");
        //char operator = reader.next().charAt(0);
        int choose=reader.nextInt();
        switch(choose)
        {
            case 1:
            	stc.StringToCharArray();
                break;
               
            case 2:
            	 stc.StringToCharArrayWithout();
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }
        System.exit(0);
	}

}
