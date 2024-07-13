package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class studentController {

	public static void main(String[] args) {
	Student st1=new Student(1, "Sher Ali ", "Bangalore");
	Student st2=new Student(5, "Taher Ali ", "Bhubaneswar");
	Student st3=new Student(3, "Umar Ali ", "Bhadrak");
	Student st4=new Student(2, "Nagma Ali ", "Chennei");
	Student st5=new Student(4, "Riyaz Ali ", "Nuasahi");
	
	List<Student> aslist=new ArrayList<Student>();
	aslist.add(st1);
	aslist.add(st2);
	aslist.add(st3);
	aslist.add(st4);
	aslist.add(st5);
	
	Collections.sort(aslist);
	for(Student s:aslist){
		System.out.println(s);
		
	}
	}

}
