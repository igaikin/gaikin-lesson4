package com.belhard.lesson4.classes.model.entities;

import com.belhard.lesson4.classes.model.Identifiable;
import com.belhard.lesson4.classes.model.entities.auxiliary.Address;
import lombok.Data;

import java.time.LocalDate;

@Data
public abstract class Person implements Identifiable {

    private long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Address address;

    public Person(String firstName, String lastName, LocalDate dateOfBirth, Address address) {
        id = (long) (Math.random() * Long.MAX_VALUE);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public Person() {
    }

    public abstract String introduceYourself();
}
