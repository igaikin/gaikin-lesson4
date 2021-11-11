package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.entities.auxiliary.Money;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;


@Data
@EqualsAndHashCode(callSuper = true)
public abstract class Employee extends Person {

    private Subdivision subdivision;
    private int hoursWorked;
    private Money salary = new Money(BigDecimal.ZERO, Money.Currency.USD);
    private Position position;

    @Override
    public String getFormattedOutput() {
        return String.format("%nHi! My name is %s %s.%nI`m %s this University. I'm %s birth.", getFirstName(),
                getLastName(), position.getName(), getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
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
}
