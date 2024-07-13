package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class checkStringList {

	public static void main(String[] args) {
		List<String> aslist1 = new ArrayList<String>();
		aslist1.add("Hellow");
		aslist1.add("Sher");
		aslist1.add("Khan");
		aslist1.add("How Are You");
		aslist1.add("Good Job");
		
		List<String> aslist2 = new ArrayList<String>();
		
		aslist2.add("Toss");
		aslist2.add("Joss");
		aslist2.add("Khan");
		aslist2.add("Facebook");
		aslist2.add("Sher");
		
		List<String> aslist3 = new ArrayList<String>();
		
		for(String check:aslist1){
			aslist3.add(aslist2.contains(check)? "Yes" : "No");
			
		}
		System.out.println(aslist3);
	}

}
