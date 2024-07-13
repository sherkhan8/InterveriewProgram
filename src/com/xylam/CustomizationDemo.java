package com.xylam;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizationDemo implements Serializable {
	
	public static long serialVersionUID=21873287L;
	
	private int id;
	private String username;
	transient private String password;
	
	
	public CustomizationDemo(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void writeObject(ObjectOutputStream oos)throws Exception{
		
		oos.defaultWriteObject();
		String pwd="123"+password;
		oos.writeObject(pwd);
	}
	
	public void readObject(ObjectInputStream ois)throws Exception{
		
		ois.defaultReadObject();
		String pwd=(String)ois.readObject();
		password=pwd.substring(3);
	}

}
