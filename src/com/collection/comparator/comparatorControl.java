package com.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparatorControl {

	public static void main(String[] args) {
		employee emp1=new employee(101, "Sher Ali Khan", "11-04-1991", "bangalore");
		employee emp2=new employee(108, "Taher Ali Khan", "11-04-1992", "Bhadrak");
		employee emp3=new employee(99, "Nagma Ali Khan", "11-04-1996", "bangalore");
		employee emp4=new employee(55, "Riyaz Ali Khan", "11-04-1999", "bangalore");
		List<employee> aslist=new ArrayList<employee>();
		aslist.add(emp1);
		aslist.add(emp2);
		aslist.add(emp3);
		aslist.add(emp4);
		
		   /*Sorting based on Employee Num */
		   System.out.println("Employee ID Sorting:");
		   Collections.sort(aslist, employee.eNo);

		   for(employee emp: aslist){
				System.out.println(emp);
		   }
		   
		   /*Sorting based on Employee Name */
		   System.out.println("Employee Name Sorting:");
		   Collections.sort(aslist, employee.eName);

		   for(employee emp: aslist){
				System.out.println(emp);
		   }
		   
		   System.out.println("Employee Age sorting");
		   Collections.sort(aslist, employee.eAge);
		   for(employee age:aslist){
			   System.out.println(age);
		   }
	}

}
