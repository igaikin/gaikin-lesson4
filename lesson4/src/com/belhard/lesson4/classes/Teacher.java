package com.belhard.lesson4.classes;

import java.math.BigDecimal;

public class Teacher extends Employee {

	private String department;
	private String academicDegree;
	private int curatorOfTheGroup;

	public Teacher(String firstName, String lastName, int age, String subdivision, String position, int hoursWorked,
			BigDecimal salaryEmployee, String department, String academicDegree, int curatorOfTheGroup) {

		super(firstName, lastName, age, subdivision, position, hoursWorked, salaryEmployee);
		this.department = department;
		this.academicDegree = academicDegree;
		this.curatorOfTheGroup = curatorOfTheGroup;

	}

	public String toString() {
		return "\tTEACHER: \nName:\t\t" + getFirstName() + " " + getLastName() + ";\nAge:\t\t" + getAge()
				+ ";\nSubdivision:\t" + getSubdivision() + "; \n" + "Post:\t\t" + getPost() + "; \n" + "Department:\t"
				+ getDepartment() + "; \n" + "Academic Degree: " + getAcademicDegree() + "; \n" + "ID:\t\t"
				+ getNumberCard() + "; \n" + "Curator Group:\t" + getCuratorOfTheGroup() + ";\n" + "Hours Worked:\t"
				+ getHoursWorked() + ";\n" + "SALARY:\t\t" + getSalaryEmployee()
				+ ";\n___________________________________";
	}

	public String getDepartment() {
		return department;

	}

	public void setDepartment(String department) {
		this.department = department;

	}

	public String getAcademicDegree() {
		return academicDegree;

	}

	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}

	public int getCuratorOfTheGroup() {
		return curatorOfTheGroup;

	}

	public void setCuratorOfTheGroup(int curatorOfTheGroup) {
		this.curatorOfTheGroup = curatorOfTheGroup;
	}
}
