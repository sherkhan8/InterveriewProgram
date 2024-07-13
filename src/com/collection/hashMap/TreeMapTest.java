package com.collection.hashMap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest implements Comparator<TreeMapTest> {

	private int empId;
	private String name;
	private String emailId;
	private String contact;

	public TreeMapTest(int empId, String name, String emailId, String contact) {
		super();
		this.empId = empId;
		this.name = name;
		this.emailId = emailId;
		this.contact = contact;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public int compare(TreeMapTest o1, TreeMapTest o2) {
		return o2.getName().compareTo(o1.getName());
	}

	@Override
	public String toString() {
		return "TreeMapTest [empId=" + empId + ", name=" + name + ", emailId=" + emailId + ", contact=" + contact + "]";
	}

	public static void main(String[] args) {

		TreeMapTest sher = new TreeMapTest(101, "Sher Ali Khan", "sher.khan@wipro.com", "9538717302");
		TreeMapTest taher = new TreeMapTest(102, "Taher Ali Khan", "taher.khan@wipro.com", "9437341024");
		TreeMapTest umar = new TreeMapTest(103, "Umar Ali Khan", "umar.khan@wipro.com", "9538717302");
		TreeMapTest riyaz = new TreeMapTest(104, "Riyaz Ali Khan", "riyaz.khan@wipro.com", "9538717302");
		TreeMapTest paak = new TreeMapTest(105, "Pakeeza Parween", "paak.khan@wipro.com", "9538717302");
		TreeMapTest nag = new TreeMapTest(106, "Nagma Khatoon", "nagma.khan@wipro.com", "9538717302");

		Map<TreeMapTest, Integer> map = new TreeMap<TreeMapTest, Integer>();

		map.put(sher, 1);
		map.put(taher, 2);
		map.put(umar, 3);
		map.put(riyaz, 4);
		map.put(paak, 5);
		map.put(nag, 6);

		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			TreeMapTest tm = (TreeMapTest) it.next();
			int keys = map.get(tm);
			System.out.println("Name: " + tm.getName() + " : " + keys);
		}
	}
}
