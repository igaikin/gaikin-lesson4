package com.belhard.lesson4.classes.model.entities.auxiliary;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Address {
    private Country country;
    private String city;
    private String street;
    private int house;
    private String block;
    private int flat;

    public enum Country {
        BLR("Republic of Belarus"),
        DEU("Germany"),
        IRQ("Iraq"),
        ISR("Israel"),
        LBY("Libya"),
        PAK("Pakistan"),
        RUS("Russian Federation"),
        SYR("Syrian Arab Republic"),
        UGA("Uganda"),
        UKR("Ukraine"),
        USSR("Union of Soviet Socialist Republics");

        private final String name;

        Country(String name) {
            this.name = name;
        }
    }

    public Address(Country country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

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

    @Override
    public String toString() {
        StringBuilder sb =
                new StringBuilder().append(country.name).append(", ").append(city).append("   ").append(street);
        if (house != 0) {
            sb.append(", ").append(house);
        }
        if (block != null) {
            sb.append("/").append(block);
        }
        if (flat != 0) {
            sb.append("-").append(flat);
        }
        return String.valueOf(sb);
    }
}
