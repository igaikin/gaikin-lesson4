package com.belhard.lesson4.classes;

import java.math.BigDecimal;

class Cleaner extends Employee implements Identifiable {
	private String workingArea;
	private BigDecimal salaryCleaner;

	public Cleaner(long id, String firstName, String lastName, int age, String subdivision, Post post, int hoursWorked,
			String workingArea, BigDecimal salaryCleaner) {

		super(id, firstName, lastName, age, subdivision, hoursWorked, post, salaryCleaner);
		this.workingArea = workingArea;
		this.salaryCleaner = salaryCleaner;

	}

	public String toString() {
		return "Cleaner:\nName:\t\t" + getFirstName() + " " + getLastName() + " " + "\n" + "Age:\t\t" + getAge() + "\n"
				+ "Subdivision:\t" + getSubdivision() + "\n" + "Position:\t" + post + "\n" + "Hours Worked:\t"
				+ getHoursWorked() + "\n" + "Working Area:\t" + getWorkingArea() + "\n" + "ID:\t\t" + getId() + "\n "
				+ introduceYourself() + "I am an employee of the support staff in the position of " + post
				+ "\nI love this job because of the adequate schedule and good pay.";
	}

	public BigDecimal getSalaryCleaner() {
		return salaryCleaner;
	}

	public void setSalaryCleaner(BigDecimal salaryCleaner) {
		this.salaryCleaner = salaryCleaner;
	}

	public String getWorkingArea() {
		return workingArea;
	}

	public void setWorkingArea(String workingArea) {
		this.workingArea = workingArea;
	}

}