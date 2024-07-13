package com.mphasis;

public final class Student {

	private int id;
	private String name;
	private int age;
	private Address address;

	public Student(int id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	public void show() {
		System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
		System.out.println("AT: " + address.getAt() + ", Road: " + address.getRoad() + ", City: " + address.getCity()
				+ ", State: " + address.getState() + ", Pin: " + address.getPin());
	}
}
