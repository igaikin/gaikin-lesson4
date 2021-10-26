package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.entities.auxiliary.Address;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Employee extends Person {
    public Subdivision subdivision;
    private int hoursWorked;
    private BigDecimal salary = BigDecimal.valueOf(0); //FIXME introduce new class Salary { BDecimal amount, Currency currency }
    public Position position;

    public enum Position {
        HEAD_OF_DEPARTMENT("Head of department"), DEPUTY("Deputy"), TEACHER("Teacher"),
        SENIOR_LECTURER("Senior Lecturer"), ASSISTANT("Assistant"), CLEANER("Cleaner");
        private final String name;

        Position(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public enum Subdivision {
        WORK_STAFF("Worker"), TEACHERS_STAFF("Teacher");

        private final String name;

        Subdivision(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public Employee(String firstName, String lastName, Date dateOfBirth, Address address, Subdivision subdivision,
                    int hoursWorked, Position position) {
        super(firstName, lastName, dateOfBirth, address);
        this.position = position;
        this.hoursWorked = hoursWorked;
        this.subdivision = subdivision;
    }

    @Override
    public String introduceYourself() {
        return String.format("%nHi! My name is %s %s.%nI`m %s this University. I'm %s birth.", getFirstName(),
                getLastName(), position.getName(), getDateOfBirth());
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
