package com.xylam;

import java.io.Serializable;

public class SerlizationDemo implements Serializable {
	
	public static long serialVersionUID=21873287L;
	
	private int id;
	private String username;
	transient private String password;
	
	
	public SerlizationDemo(int id, String username, String password) {
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
	
	

}
