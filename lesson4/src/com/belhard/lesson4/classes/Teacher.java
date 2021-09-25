package com.belhard.lesson4.classes;

import java.math.BigDecimal;

class Teacher extends Employee implements Identifiable {

	private String department;
	private String academicDegree;
	private int curatorOfTheGroup;
	private BigDecimal salaryTeacher = new BigDecimal("0");

	public Teacher(String firstName, String lastName, int age, String subdivision, String position, int hoursWorked,
			String department, String academicDegree, int curatorOfTheGroup, BigDecimal salaryTeacher) {

		super(firstName, lastName, age, subdivision, position, hoursWorked, salaryTeacher);
		this.department = department;
		this.academicDegree = academicDegree;
		this.curatorOfTheGroup = curatorOfTheGroup;
		this.salaryTeacher = salaryTeacher;
	}

	public String toString() {
		return "\tTEACHER:\nName:\t\t" + getFirstName() + " " + getLastName() + "\nAge:\t\t" + getAge()
				+ "\nSubdivision:\t" + getSubdivision() + "\n" + "Post:\t\t" + getPost() + "\n" + "Department:\t"
				+ getDepartment() + "\n" + "Academic Degree: " + getAcademicDegree() + "\n" + "ID:\t\t" + getId() + "\n"
				+ "Curator Group:\t" + getCuratorOfTheGroup() + "\n" + "Hours Worked:\t" + getHoursWorked() + "\n"
				+ "SALARY:\t\t" + getSalaryTeacher() + "\n___________________________________";
	}

	public BigDecimal getSalaryTeacher() {
		return salaryTeacher;
	}

	public void setSalaryTeacher(BigDecimal salaryTeacher) {
		this.salaryTeacher = salaryTeacher;
	}

	public String getDepartment() {
		return department;

	}

	public void setDepartment(String department) {
		this.department = department;

	}

	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}

	public String getAcademicDegree() {
		return academicDegree;

	}

	public int getCuratorOfTheGroup() {
		return curatorOfTheGroup;

	}

	public void setCuratorOfTheGroup(int curatorOfTheGroup) {
		this.curatorOfTheGroup = curatorOfTheGroup;
	}

	@Override
	public long myNumberCard() {
		return getNumberCard();
	}

	@Override
	public int hashCode() {
		long result = curatorOfTheGroup;
		result = 31 * result + Teacher.getAge();
		result = 31 * result + (department == null ? 0 : department.hashCode());
		result = 31 * result + (academicDegree == null ? 0 : academicDegree.hashCode());
		return (int) result;
	}
}
