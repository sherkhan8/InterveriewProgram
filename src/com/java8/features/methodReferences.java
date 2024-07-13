package com.java8.features;

import java.util.ArrayList;
import java.util.List;

public class methodReferences {

	public static void main(String[] args) {
	List<String> name=new ArrayList<String>();
	name.add("Sher");
	name.add("Ali");
	name.add("pakee");
	
	name.forEach(System.out::println);

	}

}
