package Java4s.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicate {

	public void removeDuplicate(){
		while(true){
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter file size: ");
		int k=sc.nextInt();
		System.out.print("Please Enter "+k+" items: ");
		List li=new ArrayList(k);
		List l1=null;
		for(int i=0 ; i <= k ; i++){
			 
		    if(li.equals("")!=true){
		    	 li.add(sc.nextLine());
		    }
		}
		System.out.println(li);
		/*String finalString=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(finalString);*/
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicate replace=new RemoveDuplicate();
		replace.removeDuplicate();
	}

}
