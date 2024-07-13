package com.collection.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class hashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		System.out.println(map.size());

		map.put(null, "null");
		map.put(5, "Ho");
		map.put(2, "He");
		map.put(6, "Ha");
		map.put(7, "Hu");
		map.put(6, "Hi");
		map.put(null, null);
		map.put(2, null);
		System.out.println(map);
		System.out.println(map.size());
		//map.clear();
		//Set s=map.entrySet();
		System.out.println("Before Sorting :");
		Iterator it=map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry emap=(Map.Entry)it.next();
			System.out.println("Key : "+emap.getKey()+" , "+"Values : "+emap.getValue());
		}
		/*Map<Integer, String> tmap=new TreeMap<Integer, String>(map);
		Set s1=tmap.entrySet();
		System.out.println("After Sorting :");
		Iterator it2=s1.iterator();
		while(it2.hasNext()){
			Map.Entry map1=(Map.Entry)it2.next();
			System.out.println("Key : "+map1.getKey()+" , "+"Values : "+map1.getValue());
		}*/
		

		Set entrySet = map.entrySet();
		List aslist = new ArrayList(entrySet);
		System.out.println("After Sorting :");
		Iterator it2=aslist.iterator();
		while(it2.hasNext()){
			Map.Entry map1=(Map.Entry)it2.next();
			System.out.println("Key : "+map1.getKey()+" , "+"Values : "+map1.getValue());
		}
	}

}
