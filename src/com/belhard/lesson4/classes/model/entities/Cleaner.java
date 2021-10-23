package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.entities.auxiliary.Address;

import java.util.Date;

public class Cleaner extends Employee {
    private String workingArea;

    public Cleaner(String firstName, String lastName, Date dateOfBirth, Address address,
                   Subdivision subdivision, Position position, int hoursWorked, String workingArea) {
        super(firstName, lastName, dateOfBirth, address, subdivision, hoursWorked, position);
        this.workingArea = workingArea;

    }

    public String toString() {
        return String.format("Cleaner:%nName: %s %s%nDate of Birth: %s%nSubdivision: %s%n" +
                        "Position: %s%nHours Worked: %d%nWorking Area: %s%nSalary:%.2f%nID: %d%n%s%nI am an " +
                        "employee of the support staff in the position of %s %nI love this job because of the " +
                        "adequate schedule and good pay.", getFirstName(), getLastName(), getDateOfBirth(),
                subdivision, position, getHoursWorked(), getWorkingArea(), getSalary(), getId(),
                introduceYourself(), position);
    }

    public String getWorkingArea() {
        return workingArea;
    }

    public void setWorkingArea(String workingArea) {
        this.workingArea = workingArea;
    }

}
