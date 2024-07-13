package com.collection.comparable;

public class Student implements Comparable<Student>{
	
	private int rollnum;
	private String sname;
	private String Address;
	
	
	public Student(int rollnum, String sname, String address) {
		super();
		this.rollnum = rollnum;
		sname = sname;
		Address = address;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		sname = sname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public int compareTo(Student obj) {
		// TODO Auto-generated method stub
		
		int rollFinal= obj.getRollnum();
		//Ascending Order based on roll num
		//return rollnum-rollFinal;
		//Discending Order based on rollnum
		return rollFinal-rollnum;
		
		//String name=Sname.toLowerCase();
		//String nameFinal=obj.getSname().toLowerCase();
		
		//return -nameFinal.compareTo(name);
	}
	@Override
	public String toString() {
		return "Student [rollnum=" + rollnum + ", Sname=" + sname
				+ ", Address=" + Address + "]";
	}

}
