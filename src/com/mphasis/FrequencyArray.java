package com.mphasis;

import java.util.HashMap;
import java.util.Map;

public class FrequencyArray {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int arr[] = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };

		for (int k : arr) {
			if (map.containsKey(k)) {
				map.put(k, map.get(k) + 1);
			} else
				map.put(k, 1);
		}
		System.out.println(map);
	}

}
