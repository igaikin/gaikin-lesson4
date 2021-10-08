package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.Identifiable;

import java.util.Date;

public class Cleaner extends Employee implements Identifiable {
    private String workingArea;

    public Cleaner(String firstName, String lastName, Date dateOfBirth, String subdivision, Position position, int hoursWorked,
                   String workingArea) {

        super(firstName, lastName, dateOfBirth, subdivision, hoursWorked, position);
        this.workingArea = workingArea;

    }

    public String toString() {//FIXME format
        return "Cleaner:\nName:\t\t" + getFirstName() + " " + getLastName() + " " + "\n" + "Age:\t\t" + getDateOfBirth() + "\n"
                + "Subdivision:\t" + getSubdivision() + "\n" + "Position:\t" + position + "\n" + "Hours Worked:\t"
                + getHoursWorked() + "\n" + "Working Area:\t" + getWorkingArea() + "\n" + "Salary: \t" + ""
                + getSalary() + "\nID:\t\t" + getId() + "\n " + introduceYourself()
                + "I am an employee of the support staff in the position of " + position
                + "\nI love this job because of the adequate schedule and good pay.";
    }

    public String getWorkingArea() {
        return workingArea;
    }

    public void setWorkingArea(String workingArea) {
        this.workingArea = workingArea;
    }

}