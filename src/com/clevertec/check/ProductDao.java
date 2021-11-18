package com.clevertec.check;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private static final List<Product> PRODUCTS;

    static {
        PRODUCTS = new ArrayList<>();
        PRODUCTS.add(new Product(1, "Milk", BigDecimal.valueOf(2.99)));
        PRODUCTS.add(new Product(2, "Butter", BigDecimal.valueOf(4.99)));
        PRODUCTS.add(new Product(3, "Sugar", BigDecimal.valueOf(2.49)));
        PRODUCTS.add(new Product(4, "Bread", BigDecimal.valueOf(3.49)));
        PRODUCTS.add(new Product(5, "French Bread", BigDecimal.valueOf(1.99)));
        PRODUCTS.add(new Product(6, "Potato", BigDecimal.valueOf(2.99)));
        PRODUCTS.add(new Product(7, "Sweet Paper", BigDecimal.valueOf(1.69)));
        PRODUCTS.add(new Product(8, "Cucumber Organic", BigDecimal.valueOf(2.19)));
        PRODUCTS.add(new Product(9, "Tomatoes", BigDecimal.valueOf(2.99)));
        PRODUCTS.add(new Product(10, "Bananas", BigDecimal.valueOf(0.99)));
        PRODUCTS.add(new Product(11, "Orange", BigDecimal.valueOf(1.49)));
        PRODUCTS.add(new Product(12, "Apple", BigDecimal.valueOf(0.99)));
        PRODUCTS.add(new Product(13, "Beef Meat", BigDecimal.valueOf(3.99)));
        PRODUCTS.add(new Product(14, "Pork Meat", BigDecimal.valueOf(4.49)));
        PRODUCTS.add(new Product(15, "Turkey", BigDecimal.valueOf(2.34)));
        PRODUCTS.add(new Product(16, "Chicken", BigDecimal.valueOf(1.99)));
        PRODUCTS.add(new Product(17, "Cola", BigDecimal.valueOf(1.99)));
        PRODUCTS.add(new Product(18, "Mineral Water", BigDecimal.valueOf(0.69)));
        PRODUCTS.add(new Product(19, "Juice", BigDecimal.valueOf(4.69)));
        PRODUCTS.add(new Product(20, "Coffee", BigDecimal.valueOf(10.99)));
        PRODUCTS.add(new Product(21, "Tea", BigDecimal.valueOf(2.99)));
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
