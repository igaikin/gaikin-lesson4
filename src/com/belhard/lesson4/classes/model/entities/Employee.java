package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.entities.auxilary.Address.*;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Employee extends Person {
    public Subdivision subdivision;
    private int hoursWorked;
    private BigDecimal salary = BigDecimal.valueOf(0); //FIXME introduce new class Salary { BDecimal amount, Currency currency }
    public Position position;

    public enum Position {
        HEAD_OF_DEPARTMENT, DEPUTY, TEACHER, SENIOR_LECTURER, ASSISTANT, CLEANER
    }

    public enum Subdivision {
        WORK_STAFF, TEACHERS_STAFF
    }

    public Employee(String firstName, String lastName, Date dateOfBirth, Country country,
                    Subdivision subdivision,
                    int hoursWorked,
                    Position position) {
        super(firstName, lastName, dateOfBirth, country);
        this.position = position;
        this.hoursWorked = hoursWorked;
        this.subdivision = subdivision;

    }

    @Override
    public String introduceYourself() {
        return String.format("%nHi! My name is %s %s. I`m %s this University. I''m %s years old.", getFirstName(),
                getLastName(), position, getDateOfBirth());
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}