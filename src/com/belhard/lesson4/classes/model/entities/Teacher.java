package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.entities.auxiliary.Address;
import com.belhard.lesson4.classes.model.groups.Chair;
import com.belhard.lesson4.classes.model.groups.Group;

import java.util.Date;

public class Teacher extends Employee {
    private Group group;
    private Chair chair;
    private AcademicDegree academicDegree;

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

    public Teacher(String firstName, String lastName, Date dateOfBirth, Address address, Subdivision subdivision,
                   AcademicDegree academicDegree, Position position, int hoursWorked, Chair chair, Group group) {
        super(firstName, lastName, dateOfBirth, address, subdivision, hoursWorked, position);
        this.academicDegree = academicDegree;
        this.group = group;
        this.chair = chair;
        group.setTeacher(this);
        chair.removeTeacher(this);
        chair.addTeacher(this);
    }

    public String toString() {
        return String.format("TEACHER:%nName            | %s %s%nDate of Birth   | %s%nAddress         | %s%n"
                        + "Subdivision     | %s%nPosition        | %s%nChair           | %s%n"
                        + "Academic Degree | %s%nID              | %d%nCurator Group   | %s%nHours Worked    | %d%n"
                        + "Salary          | %s%1.2f%n%s%n__________________________________________________",
                getFirstName(), getLastName(), getDateOfBirth(), getAddress(), getSubdivision().getName(),
                getPosition().getName(), getChair().getName(), academicDegree.name, getId(), getGroup().getName(),
                getHoursWorked(), getSalary().getCurrency().getSymbol(), getSalary().getAmount(), introduceYourself());
    }

    @Override
    public String introduceYourself() {
        return String.format("%nHi! My name is %s %s.%nI`m %s this University. I'm %s birth.", getFirstName(),
                getLastName(), getPosition().getName(), getDateOfBirth());
    }

    public AcademicDegree getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(AcademicDegree academicDegree) {
        this.academicDegree = academicDegree;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
