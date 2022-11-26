package com.kodilla.jmsmessage.domain;

public class Order {
    private String product;
    private double quantity;
    private double unitPrice;

    public Order(String product, double quantity, double unitPrice) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
