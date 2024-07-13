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
import java.util.TreeMap;

public class SortByKey {

	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("A", 98);
		hm.put("Z", 85);
		hm.put("C", 91);
		hm.put("D", 95);
		hm.put("T", 79);
		hm.put("K", 80);

		Iterator it = hm.entrySet().iterator();
		// Traversing hasmap
		while (it.hasNext()) {
			Map.Entry<String, Integer> emap = (Map.Entry<String, Integer>) it.next();
			System.out.println(emap.getKey() + " : " + emap.getValue());
		}

		// SortByKeys
		System.out.println("-----------------------SortByKeys--------------------");
		Map<String, Integer> tm = new TreeMap<String, Integer>(hm);
		Iterator tmit = tm.entrySet().iterator();
		while (tmit.hasNext()) {
			Map.Entry<String, Integer> tmmap = (Map.Entry<String, Integer>) tmit.next();
			System.out.println(tmmap.getKey() + " : " + tmmap.getValue());
		}

		// SortByValues
		System.out.println("-----------------------SortByValues--------------------");

		Set entrySet = hm.entrySet();
		List aslist = new ArrayList(entrySet);
		// Collections.sort(aslist,(e1,e2) -> e1.getValue().compareTo(e2.getValue()));

		Collections.sort(aslist, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		Iterator lit = aslist.iterator();
		while (lit.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) lit.next();
			temp.put(entry.getKey(), entry.getValue());
			// System.out.println(temp.getKey() + " : " + temp.getValue());
		}
		Set set2 = temp.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterator2.next();
			System.out.print(me2.getKey() + " : ");
			System.out.println(me2.getValue());
		}

	}

}
