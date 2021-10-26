package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.entities.auxiliary.Address;
import com.belhard.lesson4.classes.model.groups.Chair;

import java.util.Date;

public class Cleaner extends Employee {
    private Chair chair;

    public Cleaner(String firstName, String lastName, Date dateOfBirth, Address address,
                   Subdivision subdivision, Position position, int hoursWorked, Chair chair) {
        super(firstName, lastName, dateOfBirth, address, subdivision, hoursWorked, position);
        this.chair = chair;
        chair.setCleaner(this);
    }

    public String toString() {
        return String.format("\tCLEANER:%nName          |%s %s%nDate of Birth |%s%nAddress       |%s%n"
                        + "Subdivision   |%s%nPosition      |%s%nHours Worked  |%d%nService zone  |%s%n"
                        + "ID:           |%d%nSalary        |%.2f%n%s%n"
                        + "I am an employee of the support staff in the position of %s.%n"
                        + "I love this job because of the adequate schedule and good pay.",
                getFirstName(), getLastName(), getDateOfBirth(), getAddress(), subdivision.getName(), position.getName(),
                getHoursWorked(), getChair().getName(), getId(), getSalary(), introduceYourself(), position.getName());
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
