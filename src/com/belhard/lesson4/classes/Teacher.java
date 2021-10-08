package com.belhard.lesson4.classes;

import java.math.BigDecimal;

class Teacher extends Employee implements Identifiable {

	private String department;
	private int curatorOfTheGroup;
	private BigDecimal salaryTeacher = new BigDecimal("0");
	public AcademicDegree academicDegree;

	public enum AcademicDegree {
		DOCTOR, CANDIDATE, PROFESSOR, MASTER, ASSISTANT_PROFESSOR, BACHELOR_OF_BUSINES_ADMINISTRATION;
	}

	public Teacher(String firstName, String lastName, int age, String subdivision, AcademicDegree academicDegree,
			Post post, int hoursWorked, String department, int curatorOfTheGroup) {

		super(firstName, lastName, age, subdivision, hoursWorked, post);
		this.department = department;
		this.academicDegree = academicDegree;
		this.curatorOfTheGroup = curatorOfTheGroup;
	}

	public String toString() {
		return "\tTEACHER:\nName:\t\t" + getFirstName() + " " + getLastName() + "\nAge:\t\t" + getAge()
				+ "\nSubdivision:\t" + getSubdivision() + "\n" + "Post:\t\t" + post + "\n" + "Department:\t"
				+ getDepartment() + "\n" + "Academic Degree: " + academicDegree + "\n" + "ID:\t\t" + getId() + "\n"
				+ "Curator Group:\t" + getCuratorOfTheGroup() + "\n" + "Hours Worked:\t" + getHoursWorked() + "\n"
				+ "Salary:\t\t" + getSalaryEmployee() + "\n___________________________________";
	}

	@Override
	public String introduceYourself() {
		return "\nHi! My name is " + getFirstName() + " " + getLastName() + "," + ". I`m " + post
				+ " this University. I'm " + getAge() + " years old.\n";
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

	public int getCuratorOfTheGroup() {
		return curatorOfTheGroup;

	}

	public void setCuratorOfTheGroup(int curatorOfTheGroup) {
		this.curatorOfTheGroup = curatorOfTheGroup;
	}

//	@Override
//	public int hashCode() {
//		long result = curatorOfTheGroup;
//		result = 31 * result + Teacher.getAge();
//		result = 31 * result + (department == null ? 0 : department.hashCode());
//		result = 31 * result + (academicDegree == null ? 0 : academicDegree.hashCode());
//		return (int) result;
//	}

}
