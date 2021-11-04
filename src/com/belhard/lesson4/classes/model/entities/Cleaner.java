package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.entities.auxiliary.Address;
import com.belhard.lesson4.classes.model.groups.Chair;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Cleaner extends Employee {

    @Setter @Getter
    private Chair chair;

    public Cleaner(String firstName, String lastName, LocalDate dateOfBirth, Address address,
                   Subdivision subdivision, Position position, int hoursWorked, Chair chair) {
        super(firstName, lastName, dateOfBirth, address, subdivision, hoursWorked, position);
        this.chair = chair;
        chair.setCleaner(this);
    }

    public String toString() {
        return String.format("\tCLEANER:%nName          | %s %s%nDate of Birth | %s%nAddress       | %s%n"
                        + "Subdivision   | %s%nPosition      | %s%nHours Worked  | %d%nService zone  | %s%n"
                        + "ID:           | %d%nSalary        | %s%.2f%n%s%n"
                        + "I am an employee of the support staff in the position of %s.%n"
                        + "I love this job because of the adequate schedule and good pay.",
                getFirstName(), getLastName(), getDateOfBirth(), getAddress(), getSubdivision().getName(),
                getPosition().getName(), getHoursWorked(), getChair().getName(), getId(),
                getSalary().getCurrency().getSymbol(), getSalary().getAmount(), introduceYourself(),
                getPosition().getName());
    }
}
