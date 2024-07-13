package com.collection.comparator;

import java.util.Comparator;
import java.util.Date;

public class employee{

	private int empNo;
	private String empName;
	private String age;
	private String address;

	public employee(int empNo, String empName, String age, String address) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.address = address;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//sorting based on empNO
	 public static Comparator<employee> eNo = new Comparator<employee>() {

			public int compare(employee no1, employee no2) {

			   int rollno1 = no1.getEmpNo();
			   int rollno2 = no2.getEmpNo();

			   /*For ascending order*/
			   return rollno1-rollno2;

			   /*For descending order*/
			   //rollno2-rollno1;
		   }};
		   
		 //sorting based on empNO
			 public static Comparator<employee> eName = new Comparator<employee>() {

					public int compare(employee no1, employee no2) {

					   String name1 = no1.getEmpName().toLowerCase();
					   String name2 = no2.getEmpName().toLowerCase();

					   /*For ascending order*/
					   return name1.compareTo(name2);

					   /*For descending order*/
					   //rollno2-rollno1;
				   }};
	public static Comparator<employee> eAge=new Comparator<employee>(){
		public int compare(employee o1, employee o2){
		
			String age1=o1.getAge().toString();
			String age2=o2.getAge().toString();
			
			return age1.compareTo(age2);
	}};
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", age="
				+ age + ", address=" + address + "]";
	}
	
}
