package com.pikme.common.bean;

public class ExampleBean {
	private String name;
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 
	public void printHello() {
		System.out.println("Hello ! " + name);
	}
}
