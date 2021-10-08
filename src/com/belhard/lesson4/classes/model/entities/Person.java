package com.belhard.lesson4.classes.model.entities;

public abstract class Person {

    private long id;
    private String firstName;
    private String lastName;
    private int age;

    public abstract String introduceYourself();

    public Person(String firstName, String lastName, int age) {
        id = (long) (Math.random() * Long.MAX_VALUE);
        this.firstName = firstName;
        this.lastName = lastName;
        this.setAge(age);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}