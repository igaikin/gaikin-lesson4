package com.belhard.lesson4.classes.model.entities.auxilary;

import com.belhard.lesson4.classes.model.entities.Teacher;

public class Address {

    String city;
    String street;
    int house;
    String block;
    int flat;

    enum Country {
        BLR("Republic of Belarus"), POL("Poland"), LTU("Lithuania"), LVA("Latvia"), DEU("Germany"),
        RUS("Russian Federation"), UKR("Ukraine");

        private String country;

        Country(String country) {
        }

        String getCountry() {

            return country;
        }

    }

}
}
