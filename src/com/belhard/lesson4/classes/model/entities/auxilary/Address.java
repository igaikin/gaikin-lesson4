package com.belhard.lesson4.classes.model.entities.auxilary;

public class Address {

    private Country country;
    private String city;
    private String street;
    private int house;
    private String block;
    private int flat;

    public Address(Country country, String city, String street, int house) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public Address(Country country, String city, String street, int house, String block) {
        this(country, city, street, house);
        this.block = block;
    }

    public Address(Country country, String city, String street, int house, int flat) {
        this(country, city, street, house);
        this.flat = flat;
    }

    public Address(Country country, String city, String street, int house, String block, int flat) {
        this(country, city, street, house, block);
        this.flat = flat;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public enum Country {
        BLR("Republic of Belarus"),
        POL("Poland"),
        LTU("Lithuania"),
        LVA("Latvia"),
        DEU("Germany"),
        RUS("Russian Federation"),
        UKR("Ukraine");

        private final String name;

        Country(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }

    }

}
