package com.belhard.lesson4.classes;

public class Employee extends Person {

	private String post;

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
