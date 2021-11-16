package com.clevertech.check;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Product, Integer> cart = getCart(args);
        String formattedCheck = getFormattedCheck(cart);
        System.out.println(formattedCheck);

    }

    private static String getFormattedCheck(Map<Product, Integer> cart) {
        StringBuilder output = new StringBuilder();
        output.append(getHeaderLine());
        cart.forEach((product, quantity) -> output.append(getProductLine(product, quantity)));
        BigDecimal totalCost = calculateTotalCost(cart);
        output.append(getTotalLine(totalCost));
        return output.toString();
    }

    private static String getTotalLine(BigDecimal totalCost) {
        return String.format("");
    }

    private static BigDecimal calculateTotalCost(Map<Product, Integer> cart) {
        BigDecimal totalCost = BigDecimal.ZERO;
        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            BigDecimal productTotal = entry.getKey().getCost().multiply(BigDecimal.valueOf(entry.getValue()));
            totalCost = totalCost.add(productTotal);
        }
        return totalCost;
    }

    private static String getProductLine(Product product, Integer quantity) {
        BigDecimal total = product.getCost().multiply(BigDecimal.valueOf(quantity));
        return String.format("", quantity, product.getDescription(), product.getCost(), total);
    }

    private static String getHeaderLine() {
        return String.format("");
    }

    static ProductDao productDao = new ProductDao();

    private static Map<Product, Integer> getCart(String[] args) {
        Map<Product, Integer> cart = new HashMap<>();

        int quantity = 1;
        long id = 1;
        Product product = productDao.getById(id);
        cart.put(product, quantity);

        return cart;

    }
}

class Product {
    long id;
    String description;
    BigDecimal cost;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Product(long id, String description, BigDecimal cost) {
        this.id = id;
        this.cost = cost;
        this.description = description;
    }

    public String getDescription() {
        return null;
    }

    public BigDecimal getCost() {
        return null;
    }
}
