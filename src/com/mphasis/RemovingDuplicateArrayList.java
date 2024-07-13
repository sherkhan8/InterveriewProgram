package com.mphasis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RemovingDuplicateArrayList {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Ali");
		al.add("Sher");
		al.add("Khan");
		al.add("Ali");
		al.add("Taher");
		al.add("Umer");
		al.add("Khan");

		/*
		 * System.out.println(al); Set<String> hs=new HashSet<String>(); hs.addAll(al);
		 * al.clear(); al.addAll(hs); Collections.sort(al); System.out.println(al);
		 */

		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i).equals(al.get(j))) {
					al.remove(j);
					j--;
				}
			}
		}
		System.out.println(al);

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < al.size(); i++) {
			map.put(al.get(i), i + 1);
		}
System.out.println(map);
		// displaying the occurrence of elements in the arraylist

	}

}
