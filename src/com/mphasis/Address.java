package com.mphasis;

public class Address {

	private int aid;
	private String at;
	private String road;
	private String city;
	private String state;
	private long pin;
	public Address(int aid, String at, String road, String city, String state, long pin) {
		super();
		this.aid = aid;
		this.at = at;
		this.road = road;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAt() {
		return at;
	}
	public void setAt(String at) {
		this.at = at;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	
	
	
}
