package com.clevertec.check;

import lombok.Data;

import java.math.BigDecimal;

@Data
class Product {
    long id;
    String description;
    BigDecimal cost;
    boolean promotion;

    public Product(long id, String description, BigDecimal cost, boolean promotion) {
        this.id = id;
        this.cost = cost;
        this.description = description;
        this.promotion = promotion;
    }
}
