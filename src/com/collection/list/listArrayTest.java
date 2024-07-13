package com.collection.list;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class listArrayTest {

	public void listMethod() {
		List<String> aslist = new ArrayList<String>();
		aslist.add("Ali");
		aslist.add("Khan");
		aslist.add("Taher");
		aslist.add("Boss");
		aslist.add("Coch");
		aslist.set(2, "Toss");
		aslist.add(2, "Joss");
		aslist.add("Page");
		aslist.add("Facebook");
		aslist.set(3, "Thoos");
		aslist.add(1, "Bhoom");
		aslist.remove("Facebook");
		System.out.println("Before Sorting");
		System.out.println(aslist);

		System.out.println("After Sorting");
		//Collections.sort(aslist);
		
		//Reverse
		Collections.sort(aslist, Collections.reverseOrder());
		System.out.println(aslist);

		// Iterator
		System.out.println("*******Iterator loop*******");
		Iterator<String> it = aslist.iterator();
		if (it.hasNext()) {
			String st = it.next();
			System.out.println(st);
		}
		// Enumaration
		System.out.println("*******Enumaration loop*******");
		Enumeration<String> em = Collections.enumeration(aslist);
		if (em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}

		// For loop
		System.out.println("*******For loop*******");
		for (int i = 0; i < aslist.size(); i++) {
			System.out.println(aslist.get(i));
		}
		// Adv for loop
		System.out.println("*******Adv for loop*******");
		for (String s : aslist) {
			System.out.println(s);
		}
		//While loop
		
		System.out.println("*******While loop*******");
		int k = 0;
		while (aslist.size() > k) {
			System.out.println(aslist.get(k));
			k++;
		}
	}

	public static void main(String[] args) {
		listArrayTest lat = new listArrayTest();
		lat.listMethod();

	}
}
