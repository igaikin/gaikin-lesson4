package com.clevertech.check;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private static final List<Product> PRODUCTS;

    static {
        PRODUCTS = new ArrayList<>();
        PRODUCTS.add(new Product(1, "Description", BigDecimal.valueOf(2.34)));
        PRODUCTS.add(new Product(1, "Description", BigDecimal.valueOf(2.34)));
        PRODUCTS.add(new Product(1, "Description", BigDecimal.valueOf(2.34)));
        PRODUCTS.add(new Product(1, "Description", BigDecimal.valueOf(2.34)));
        PRODUCTS.add(new Product(1, "Description", BigDecimal.valueOf(2.34)));
        PRODUCTS.add(new Product(1, "Description", BigDecimal.valueOf(2.34)));
    }

    public Product getById(long id) {
        for (Product product : PRODUCTS) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
