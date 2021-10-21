package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.Identifiable;
import com.belhard.lesson4.classes.model.entities.auxiliary.Address;
import com.belhard.lesson4.classes.model.groups.Group;

import java.math.BigDecimal;
import java.util.Date;

public class Teacher extends Employee implements Identifiable {

    private String department;
    private Group group;
    private BigDecimal salaryTeacher = BigDecimal.ZERO;
    public AcademicDegree academicDegree;

    public enum AcademicDegree {
        DOCTOR("Doctor"),
        CANDIDATE("Candidate"),
        PROFESSOR("Professor"),
        MASTER("Master"),
        ASSISTANT_PROFESSOR("Assistant Professor"),
        BACHELOR_OF_BUSINESS_ADMINISTRATION("Bachelor of Business Administration");

        private final String name;

        AcademicDegree(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    public Teacher(String firstName, String lastName, Date dateOfBirth, Address.Country country, Subdivision subdivision, AcademicDegree academicDegree,
                   Position position, int hoursWorked, String department, Group group) {

        super(firstName, lastName, dateOfBirth, country, subdivision, hoursWorked, position);
        this.department = department;
        this.academicDegree = academicDegree;
        this.group = group;
        group.setTeacher(this);
    }

    public String toString() {
        return String.format("TEACHER:%nName: %20s %s%nDate of Birth: %32s%nSubdivision: %19s%nPost: " +
                        "%22s%nDepartment: %10s%nAcademic Degree: %37s%nID: %34d%nCurator Group: %8s%nHours Worked: " +
                        "%20d%nSalary: %20.2f%n___________________________________", getFirstName(), getLastName(),
                getDateOfBirth(), subdivision, position, getDepartment(), academicDegree, getId(),
                getGroup().getName(), getHoursWorked(), getSalary());
    }

    @Override
    public String introduceYourself() {
        return String.format("%nHi! My name is %s %s. I`m %s this University. I'm %s birth.", getFirstName(),
                getLastName(), position, getDateOfBirth());
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