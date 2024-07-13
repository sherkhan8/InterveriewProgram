package com.collection.fail.fast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class failFast {

	public static void main(String[] args) {
		List l=new ArrayList();
		//CopyOnWriteArrayList l=new CopyOnWriteArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		
		Iterator it=l.listIterator();
		while(it.hasNext()){
			int get=(Integer)it.next();
			System.out.println(get);
			l.add(4);
		}

	}

}
