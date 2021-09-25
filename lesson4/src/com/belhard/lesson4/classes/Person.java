package com.belhard.lesson4.classes;

abstract class Person {

	private long id;
	private String firstName;
	private String lastName;
	private static int age;
	private String nationality;
	private long numberCard;

	public Person(String firstName, String lastName, int age) {
		numberCard = (long) ((Math.random() * Long.MAX_VALUE));
		this.firstName = firstName;
		this.lastName = lastName;
		Person.age = age;
	}

	public abstract String introduceYourself();

	public long getId() {
		return id;

	}

	public static int getAge() {
		return age;
	}

	public void setAge(int age) {
		Person.age = age;
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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public long getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(long numberCard) {
		this.numberCard = numberCard;
	}

	public long myNumberCard() {
		return 0;
	}
}
