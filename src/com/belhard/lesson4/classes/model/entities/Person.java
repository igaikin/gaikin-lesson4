package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.entities.auxiliary.Address;

import java.util.Date;

public abstract class Person {
    private long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    public abstract String introduceYourself();

    public Person(String firstName, String lastName, Date dateOfBirth, Address.Country country) {
        id = (long) (Math.random() * Long.MAX_VALUE);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}