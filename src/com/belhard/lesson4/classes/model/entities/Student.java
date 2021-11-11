package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.groups.Group;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Student extends Person {

    private String faculty;
    private int course;
    private Group group;


    @Override
    public String getFormattedOutput() {
        String formattedDate = getDateOfBirth() != null
                ? getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
                : "not defined";
        String groupName = getGroup() != null
                ? getGroup().getName()
                : "not defined";
        return String.format("Student:%nName          | %s %s%nDate of birth | %s%nAddress       | %s%n"
                        + "Course        | %d%nFaculty       | %s%nGroup         | %s%nID            | %d%n%"
                        + "s%n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - ",
                getFirstName(), getLastName(), formattedDate, getAddress(), getCourse(), getFaculty(),
                groupName, getId(), introduceYourself());
    }

    private String introduceYourself() {
        return String.format("%nHi! My name is %s %s.%nI am a student of the university.%nI am %s course student of "
                        + "the %s faculty %sth groups.",
                getFirstName(), getLastName(), getCourse(), getFaculty(), "STUB");
    }
}
