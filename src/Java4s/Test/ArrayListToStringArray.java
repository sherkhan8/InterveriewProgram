package Java4s.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToStringArray {

	public void arrayList(){
		
		List<String> al=new ArrayList<String>();
		al.add("Sher Ali Khan");
		al.add("Bhim");
		al.add("Ali");
		al.add("Khan");
		al.add("Wipro");
		
		String[] strArry=new String[al.size()];
		al.toArray(strArry);
		System.out.println();
		int count=0;
		for (String fetch : strArry) {
			System.out.println(fetch);
		}
	}
 
	public static void main(String[] args) {
	
		ArrayListToStringArray al2sr=new ArrayListToStringArray();
		al2sr.arrayList();
	}

}
