package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.entities.auxiliary.Address;
import com.belhard.lesson4.classes.model.groups.Chair;
import com.belhard.lesson4.classes.model.groups.Group;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter @Setter
public class Teacher extends Employee {

    private Group group;
    private Chair chair;
    private AcademicDegree academicDegree;

    public Teacher(long id, String firstName, String lastName) {
        super();
    }

    public enum AcademicDegree {
        DOCTOR("Doctor"),
        CANDIDATE("Candidate"),
        PROFESSOR("Professor"),
        MASTER("Master"),
        ASSISTANT_PROFESSOR("Assistant Professor"),
        BACHELOR("Bachelor");

        @Getter
        private final String name;

        AcademicDegree(String name) {
            this.name = name;
        }
    }

    public Teacher(String firstName, String lastName, LocalDate dateOfBirth, Address address, Subdivision subdivision,
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
                getFirstName(), getLastName(), getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                getAddress(), getSubdivision().getName(),
                getPosition().getName(), getChair().getName(), academicDegree.name, getId(), getGroup().getName(),
                getHoursWorked(), getSalary().getCurrency().getSymbol(), getSalary().getAmount(), introduceYourself());
    }

    @Override
    public String introduceYourself() {
        return String.format("%nHi! My name is %s %s.%nI`m %s this University. I'm %s birth.", getFirstName(),
                getLastName(), getPosition().getName(), getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }
}
