package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.Identifiable;
import com.belhard.lesson4.classes.model.groups.Group;

import java.math.BigDecimal;
import java.util.Date;

public class Teacher extends Employee implements Identifiable {

    private String department;
    private Group group;
    private BigDecimal salaryTeacher = BigDecimal.ZERO;
    public AcademicDegree academicDegree;

    public enum AcademicDegree {
        DOCTOR, CANDIDATE, PROFESSOR, MASTER, ASSISTANT_PROFESSOR, BACHELOR_OF_BUSINESS_ADMINISTRATION
    }

    public Teacher(String firstName, String lastName, Date dateOfBirth, String subdivision, AcademicDegree academicDegree,
                   Position position, int hoursWorked, String department, Group group) {

        super(firstName, lastName, dateOfBirth, subdivision, hoursWorked, position);
        this.department = department;
        this.academicDegree = academicDegree;
        this.group = group;
    }

    public String toString() {
        return "\tTEACHER:\nName:\t\t" + getFirstName() + " " + getLastName() + "\nAge:\t\t" + getDateOfBirth()
                + "\nSubdivision:\t" + getSubdivision() + "\n" + "Post:\t\t" + position + "\n" + "Department:\t"
                + getDepartment() + "\n" + "Academic Degree: " + academicDegree + "\n" + "ID:\t\t" + getId() + "\n"
                + "Curator Group:\t" + getGroup().getName() + "\n" + "Hours Worked:\t" + getHoursWorked() + "\n"
                + "Salary:\t\t" + getSalary() + "\n___________________________________";
    }

    @Override
    public String introduceYourself() {
        return "\nHi! My name is " + getFirstName() + " " + getLastName() + "," + ". I`m " + position
                + " this University. I'm " + getDateOfBirth() + " years old.\n";
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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
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
