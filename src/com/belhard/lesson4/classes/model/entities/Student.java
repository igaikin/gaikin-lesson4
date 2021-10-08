package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.Identifiable;
import com.belhard.lesson4.classes.model.groups.Group;

import java.util.Date;

public class Student extends Person implements Identifiable {
    private String faculty;
    private int course;
    private Group group;

    public Student(String firstName, String lastName, Date dateOfBirth, int course, String faculty, Group group) {
        super(firstName, lastName, dateOfBirth);
        this.course = course;
        this.faculty = faculty;
        this.group = group;
        group.removeStudent(this);
        group.addStudent(this);

    }

    @Override
    public String toString() {//FIXME format indentations
        return String.format("Student:%n Name: %s %s%nAge: %s%nCourse: %d%nFaculty: %s%nGroup: %s%nID: %d%n "
                        + "- - - - - - - - - - - - - - - - - - - ", getFirstName(), getLastName(), getDateOfBirth(),
                getCourse(), getFaculty(), getGroup().getName(), getId());
    }

    @Override
    public String introduceYourself() {//FIXME format
        return "\nHi! My name is " + getFirstName() + " " + getLastName() + ".\nI am a university student, I am "
                + getCourse() + " year student of the Faculty of " + getFaculty() + " in group number " + getGroup()
                + ".\n";
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
