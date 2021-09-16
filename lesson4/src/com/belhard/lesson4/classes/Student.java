package com.belhard.lesson4.classes;

import java.math.BigDecimal;

public class Student extends Person {

	private String faculty;
	private int course;
	private BigDecimal scholarship;

	public Student(String firstName, String lastName, int course) {
		super(firstName, lastName);
		this.course = course;
	}

	public String toString() {
		return "Student-> id - " + getId() + ", Name - " + getFirstName() + " " + getLastName();

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
