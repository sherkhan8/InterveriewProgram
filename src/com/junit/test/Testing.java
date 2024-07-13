package com.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testing {
	
	@Test
	public void getMsg() {
		
		String s="I am Sher Ali Khan";
		assertEquals("I am Sher Ali Khan", s);
	}

}
