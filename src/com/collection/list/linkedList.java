package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



public class linkedList {

	public static void main(String[] args) {
	
	List<Employee> aslist=new LinkedList<Employee>();
	Employee emp1=new Employee(101, "Sher Ali Khan", "11-04-1991", "bangalore");
	Employee emp2=new Employee(108, "Taher Ali Khan", "11-04-1992", "Bhadrak");
	Employee emp3=new Employee(99, "Nagma Ali Khan", "11-04-1996", "bangalore");
	Employee emp4=new Employee(55, "Riyaz Ali Khan", "11-04-1999", "bangalore");
	
	aslist.add(emp1);
	aslist.add(emp2);
	aslist.add(emp3);
	aslist.add(emp4);
	
	//System.out.println(aslist);
	//Collections.sort(aslist,Collections.reverseOrder());
	
	for(Employee list:aslist){
		String name= list.getEmpName();
		int id=list.getEmpNo();
		String dob=list.getAge();
		String addr=list.getAddress();
		
		System.out.println("Name: "+name+"-EmpID: "+id+"-DOB: "+dob+"-addr: "+addr);
	}
	}

}
