package com.pikme.common;

public class ExampleBean {
	private String name;
	 
	public void setName(String name) {
		this.name = name;
	}
 
	public void printHello() {
		System.out.println("Hello ! " + name);
	}
}
