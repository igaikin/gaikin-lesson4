package com.belhard.lesson4.classes;

import java.math.BigDecimal;

abstract class Employee extends Person {
	private String subdivision;
	private int hoursWorked;
	private BigDecimal salaryEmployee;
	public Post post;

	public enum Post {
		HEAD_OF_DEPARTMENT, DEPUTY, TEACHER, SENIOR_LECTURER, ASSISTANT, CLEANER;

	}

	public Employee(long id, String firstName, String lastName, int age, String subdivision, int hoursWorked, Post post,
			BigDecimal salaryEmployee) {

		super(id, firstName, lastName, age);
		this.post = post;
		this.hoursWorked = hoursWorked;
		this.salaryEmployee = salaryEmployee;
		this.subdivision = subdivision;

	}

	@Override
	public String introduceYourself() {
		return "\nHi! My name is " + getFirstName() + " " + getLastName() + "," + ". I`m " + post
				+ " this University. I'm " + getAge() + " years old.\n";

	}

	public BigDecimal getSalaryEmployee() {
		return salaryEmployee;
	}

	public void setSalaryEmployee(BigDecimal salaryEmployee) {
		this.salaryEmployee = salaryEmployee;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;

	}

	public String getSubdivision() {
		return subdivision;
	}

	public void setSubdivision(String subdivision) {
		this.subdivision = subdivision;
	}

}