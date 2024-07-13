package com.test.altimetrik;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class A {

	/**
	 * @param args
	 */
	
	public static Collection show(){
		Collection sort=new LinkedList();
		
		sort.add("A");
		sort.add("R");
		sort.add("o");
		sort.add("N");
		
		return sort;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	  Set<Integer> s=new HashSet<Integer>();
	  int itr=40;
	  int itr2=50;
	  s.add(itr);
	  s.add(itr);
	  s.add(itr2);
	  s.remove(itr);
	   //itr2=47;
	  s.remove(itr2);
	  
	  System.out.println(s.size()+"");
	  
	  for(Integer i: s)
	  {
		  System.out.println(i);
	  }
	  
		

	}

}
