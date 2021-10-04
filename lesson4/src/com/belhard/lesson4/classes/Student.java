package com.belhard.lesson4.classes;

public class Student extends Person implements Identifiable {
	private String faculty;
	private int course;
	private int group;

	public Student(String firstName, String lastName, int age, int course, String faculty, int group) {

		super(firstName, lastName, age);
		this.course = course;
		this.faculty = faculty;
		this.group = group;

	}

	public String toString() {
		return "Student:\n" + "Name:\t\t" + getFirstName() + " " + getLastName() + "\n" + "Age:\t\t" + getAge() + "\n"
				+ "Course:\t\t" + getCourse() + "\n" + "Faculty:\t" + getFaculty() + "\n" + "Group:\t\t" + getGroup()
				+ "\n" + "ID:\t\t" + getId() + "\n" + " - - - - - - - - - - - - - - - - - - - ";

	}

	@Override
	public String introduceYourself() {
		return "\nHi! My name is " + getFirstName() + " " + getLastName() + ".\nI am a university student, I am "
				+ getCourse() + " year student of the Faculty of " + getFaculty() + " in group number " + getGroup()
				+ ".\n";
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

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

}
