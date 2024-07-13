package com.string;

import java.util.HashMap;
import java.util.Map;

public class countNumber {

	public static void main(String[] args) {
		int[] a = { 2, 1, 2, 5, 4, 3 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count=0;
		for (int op : a) {
			if (map.containsKey(op)) {
				map.put(op, map.get(op) + 1);
			} else {
				map.put(op, 1);
			}
		}
		System.out.println(map);
		
	}

}
