package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.entities.auxiliary.Address;
import com.belhard.lesson4.classes.model.entities.auxiliary.Money;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Setter @Getter
public abstract class Employee extends Person {

    private Subdivision subdivision;
    private int hoursWorked;
    private Money salary = new Money(BigDecimal.ZERO, Money.Currency.USD);
    private Position position;

    public Employee() {
        super();
    }

    public enum Position {
        HEAD_OF_DEPARTMENT("Head of department"), DEPUTY("Deputy"), TEACHER("Teacher"),
        SENIOR_LECTURER("Senior Lecturer"), ASSISTANT("Assistant"), CLEANER("Cleaner");
        @Getter
        private final String name;

        Position(String name) {
            this.name = name;
        }

    }

    public enum Subdivision {
        WORK_STAFF("Worker"), TEACHERS_STAFF("Teacher");

        @Getter
        private final String name;

        Subdivision(String name) {
            this.name = name;
        }

    }

    public Employee(String firstName, String lastName, LocalDate dateOfBirth, Address address, Subdivision subdivision,
                    int hoursWorked, Position position) {
        super(firstName, lastName, dateOfBirth, address);
        this.position = position;
        this.hoursWorked = hoursWorked;
        this.subdivision = subdivision;
    }

    @Override
    public String introduceYourself() {
        return String.format("%nHi! My name is %s %s.%nI`m %s this University. I'm %s birth.", getFirstName(),
                getLastName(), position.getName(), getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }
}
