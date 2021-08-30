package com.belhard.lesson4.classes;

public class Student {
	private long id;
	private String firstName;
	private String lastName;
	private String fromCity;
	private String faculty;
	private int course;

	public String toString() {
		String str = "Student: -> id - " + id + ", Name - " + firstName + " " + lastName;
		return str;
	}

	public Student(String firstName, String lastName) {
		id = (long) (Math.random() * Long.MAX_VALUE);
		this.firstName = firstName;
		this.lastName = lastName;
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

	public String getFromCity() {
		return fromCity;
	}

	public void setAge(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

}
