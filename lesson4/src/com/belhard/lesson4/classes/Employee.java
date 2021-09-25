package com.belhard.lesson4.classes;

import java.math.BigDecimal;

abstract class Employee extends Person {
	private String subdivision;
	private String position;
	private int hoursWorked;
	private BigDecimal salaryEmployee;

	public Employee(String firstName, String lastName, int age, String subdivision, String position, int hoursWorked,
			BigDecimal salaryEmployee) {

		super(firstName, lastName, age);
		this.subdivision = subdivision;
		this.position = position;
		this.hoursWorked = hoursWorked;
		this.salaryEmployee = salaryEmployee;

	}

	@Override
	public String introduceYourself() {
		return "\nHi! My name is " + getFirstName() + "," + getLastName() + "," + ". I`m " + getPost()
				+ " this University. I'm " + getAge() + "years old.\n";

	}

	public BigDecimal getSalaryEmployee() {
		return salaryEmployee;
	}

	public void setSalaryEmployee(BigDecimal salaryEmployee) {
		this.salaryEmployee = salaryEmployee;
	}

	public String getSubdivision() {
		return subdivision;
	}

	public void setSubdivision(String subdivision) {
		this.subdivision = subdivision;
	}

	public String getPost() {
		return position;
	}

	public void setPost(String position) {
		this.subdivision = position;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;

	}

}