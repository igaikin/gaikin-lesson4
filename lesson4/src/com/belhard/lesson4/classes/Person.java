package com.belhard.lesson4.classes;

public class Person {
	private long id;
	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName) {
		id = (long) (Math.random() * Long.MAX_VALUE);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person(String firstName) {
	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
