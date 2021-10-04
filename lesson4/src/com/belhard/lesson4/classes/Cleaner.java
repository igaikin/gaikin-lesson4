package com.belhard.lesson4.classes;

class Cleaner extends Employee implements Identifiable {
	private String workingArea;

	public Cleaner(String firstName, String lastName, int age, String subdivision, Post post, int hoursWorked,
			String workingArea) {

		super(firstName, lastName, age, subdivision, hoursWorked, post);
		this.workingArea = workingArea;

	}

	public String toString() {
		return "Cleaner:\nName:\t\t" + getFirstName() + " " + getLastName() + " " + "\n" + "Age:\t\t" + getAge() + "\n"
				+ "Subdivision:\t" + getSubdivision() + "\n" + "Position:\t" + post + "\n" + "Hours Worked:\t"
				+ getHoursWorked() + "\n" + "Working Area:\t" + getWorkingArea() + "\n" + "Salary: \t" + ""
				+ getSalaryEmployee() + "\nID:\t\t" + getId() + "\n " + introduceYourself()
				+ "I am an employee of the support staff in the position of " + post
				+ "\nI love this job because of the adequate schedule and good pay.";
	}

	public String getWorkingArea() {
		return workingArea;
	}

	public void setWorkingArea(String workingArea) {
		this.workingArea = workingArea;
	}

}