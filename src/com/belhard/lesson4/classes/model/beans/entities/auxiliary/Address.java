package com.belhard.lesson4.classes.model.beans.entities.auxiliary;

import lombok.Data;

@Data
public class Address {
    private Country country;
    private String city;
    private String street;
    private int house;
    private String block;
    private int flat;

    public String getFormattedOutput() {
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
}
