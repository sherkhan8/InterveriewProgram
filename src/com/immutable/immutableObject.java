package com.immutable;

public final class immutableObject {

	private final Integer empId;
	private final String name;
	private final Address address;

	private immutableObject(Integer empId, String name, Address address) {
		this.empId = empId;
		this.name = name;
		Address add = new Address();
		add.setId(address.getId());
		add.setCity(address.getCity());
		add.setState(address.getState());
		add.setPin(address.getPin());
		this.address = add;
	}

	private static immutableObject createStaticMethod(Integer empId, String name, Address address) {
		return new immutableObject(empId, name, address);
	}

	public Integer getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "empId=" + empId + ", name=" + name + ", address=" + address;
	}

	private static void trymodified(Integer empId, String name, Address addrss) {
		empId = 201;
		name = "Taher Ali Khan";
		addrss.setId(10);
		addrss.setCity("Bhadrak");
		addrss.setState("Odisha");
		addrss.setPin(756181);
	}

	public static void main(String[] args) {
		Address addrs = new Address();
		addrs.setId(10);
		addrs.setCity("Bangalore");
		addrs.setState("Karnataka");
		addrs.setPin(560076);
		immutableObject ib = immutableObject.createStaticMethod(101, "Sher Ali Khan", addrs);
		System.out.println(ib);
		trymodified(ib.getEmpId(), ib.getName(), addrs);
		System.out.println(ib);

	}
}
