package com.collection.hashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		hm.put("A", 98);
		hm.put("Z", 85);
		hm.put("C", 91);
		hm.put("D", 95);
		hm.put("T", 79);
		hm.put("K", 80);

		Set set = hm.entrySet();

		Iterator it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> map = (Map.Entry<String, Integer>) it.next();
			System.out.println(map.getKey() + " : " + map.getValue());
		}
		List list = new ArrayList(set);

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		LinkedHashMap<String, Integer> hm1 = new LinkedHashMap<String, Integer>();
		Iterator it1 = list.iterator();
		while (it1.hasNext()) {
			Map.Entry<String, Integer> map1 = (Map.Entry<String, Integer>) it1.next();
			hm1.put(map1.getKey(), map1.getValue());
		}

		Set set1 = hm1.entrySet();
		System.out.println("----------------------------------SortByValue-----------------------------------");
		Iterator it2 = hm1.entrySet().iterator();
		while (it2.hasNext()) {
			Map.Entry<String, Integer> map2 = (Map.Entry<String, Integer>) it2.next();
			System.out.println(map2.getKey() + " : " + map2.getValue());
		}
	}
}
