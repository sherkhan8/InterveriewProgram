package com.collection.list;

public class Employee {
	private int empNo;
	private String empName;
	private String age;
	private String address;

	public Employee(int empNo, String empName, String age, String address) {
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

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", age="
				+ age + ", address=" + address + "]";
	}

}
