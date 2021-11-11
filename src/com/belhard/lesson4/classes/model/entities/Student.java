package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.entities.auxiliary.Address;
import com.belhard.lesson4.classes.model.groups.Group;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter @Setter
public class Student extends Person {

    private String faculty;
    private int course;
    private Group group;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, Address address, int course,
                   String faculty,
                   Group group) {
        super(firstName, lastName, dateOfBirth, address);
        this.course = course;
        this.faculty = faculty;
        this.group = group;
        group.removeStudent(this);
        group.addStudent(this);
    }

    @Override
    public String toString() {
        return String.format("Student:%nName          | %s %s%nDate of birth | %s%nAddress       | %s%n"
                        + "Course        | %d%nFaculty       | %s%nGroup         | %s%nID            | %d%n%"
                        + "s%n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - ",
                getFirstName(), getLastName(), getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")), getAddress(), getCourse(), getFaculty(),
                getGroup().getName(), getId(), introduceYourself());
    }

    @Override
    public String introduceYourself() {
        return String.format("%nHi! My name is %s %s.%nI am a student of the university.%nI am %s course student of "
                        + "the %s faculty %sth groups.",
                getFirstName(), getLastName(), getCourse(), getFaculty(), group.getName());
    }
}
