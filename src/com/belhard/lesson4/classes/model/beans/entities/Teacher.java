package com.belhard.lesson4.classes.model.beans.entities;

import com.belhard.lesson4.classes.model.beans.groups.Chair;
import com.belhard.lesson4.classes.model.beans.groups.Group;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.format.DateTimeFormatter;

@Data
@EqualsAndHashCode(callSuper = true)
public class Teacher extends Employee {

    private Group group;
    private Chair chair;
    private AcademicDegree academicDegree;

    @Override
    public String getFormattedOutput() {
        return String.format("TEACHER:%nName            | %s %s%nDate of Birth   | %s%nAddress         | %s%n"
                        + "Subdivision     | %s%nPosition        | %s%nChair           | %s%n"
                        + "Academic Degree | %s%nID              | %d%nCurator Group   | %s%nHours Worked    | %d%n"
                        + "Salary          | %s%1.2f%n%s%n__________________________________________________",
                getFirstName(), getLastName(), getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                getAddress(), getSubdivision().getName(),
                getPosition().getName(), getChair().getName(), academicDegree.name, getId(), getGroup().getName(),
                getHoursWorked(), getSalary().getCurrency().getSymbol(), getSalary().getAmount(), introduceYourself());
    }

    private String introduceYourself() {
        return String.format("%nHi! My name is %s %s.%nI`m %s this University. I'm %s birth.", getFirstName(),
                getLastName(), getPosition().getName(), getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM" +
                        ".yyyy")));
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
}
