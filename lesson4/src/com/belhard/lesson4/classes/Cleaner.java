package com.belhard.lesson4.classes;

import java.math.BigDecimal;

public class Cleaner extends Employee {
	private String room;

	public Cleaner(String firstName, String lastName, int age, String subdivision, String post, int hoursWorked,
			BigDecimal salaryEmployee, String workingArea) {

		super(firstName, lastName, age, subdivision, post, hoursWorked, salaryEmployee);
		this.room = workingArea;

	}

	public String toString() {
		return "Cleaner:\nName:\t\t" + getFirstName() + " " + getLastName() + ";\n" + "Age:\t\t" + getAge() + ";\n"
				+ "Subdivision:\t" + getSubdivision() + ";\n" + "Post:\t\t" + getPost() + ";\n" + "Hours Worked:\t"
				+ getHoursWorked() + ";\n" + "Working Area:\t" + getRoom() + ";\n" + "ID:\t\t" + getNumberCard() + ";\n"
				+ "SALARY:\t\t" + getSalaryEmployee() + ";\n";
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String workingArea) {
		this.room = workingArea;
	}

}
