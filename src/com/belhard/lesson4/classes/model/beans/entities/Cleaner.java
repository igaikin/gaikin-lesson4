package com.belhard.lesson4.classes.model.beans.entities;

import com.belhard.lesson4.classes.model.beans.groups.Chair;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.format.DateTimeFormatter;

@Data
@EqualsAndHashCode(callSuper = true)
public class Cleaner extends Employee {
    private Chair chair;

    @Override
    public String getFormattedOutput() {
        return String.format("\tCLEANER:%nName          | %s %s%nDate of Birth | %s%nAddress       | %s%n"
                        + "Subdivision   | %s%nPosition      | %s%nHours Worked  | %d%nService zone  | %s%n"
                        + "ID:           | %d%nSalary        | %s%.2f%n%s%n"
                        + "I am an employee of the support staff in the position of %s.%n"
                        + "I love this job because of the adequate schedule and good pay.",
                getFirstName(), getLastName(), getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                getAddress(), getSubdivision().getName(), getPosition().getName(), getHoursWorked(),
                getChair().getName(), getId(), getSalary().getCurrency().getSymbol(), getSalary().getAmount(),
                super.getFormattedOutput(), getPosition().getName());
    }

}
