package com.belhard.lesson4.classes;

public class Teacher extends Employee {

	private String faculty;

	private String academicDegree;

	public Teacher(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public String toString() {
		return "Teacher: -> id - " + getId() + "Name - " + getFirstName() + " " + getLastName();

	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getAcademicDegree() {
		return academicDegree;
	}

	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}
}
