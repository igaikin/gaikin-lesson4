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

    public abstract String getFormattedOutput();
}
