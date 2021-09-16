package com.belhard.lesson4.classes;

import java.math.BigDecimal;

public class Employee extends Person {

	private String post;
	private BigDecimal salary;

	public Employee(String firstName, String lastName) {
		super(firstName, lastName);
		this.post = post;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

}
