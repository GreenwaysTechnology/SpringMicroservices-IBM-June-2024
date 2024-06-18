package com.ibm.spring.core.beans.xml.reference;

public class Order {
    private int orderId;
    private double ordervalue;

    private Product product ;

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", ordervalue=" + ordervalue +
                ", product=" + product +
                '}';
    }

    public Order(int orderId, double ordervalue, Product product) {
        this.orderId = orderId;
        this.ordervalue = ordervalue;
        this.product = product;
    }

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getOrdervalue() {
        return ordervalue;
    }

    public void setOrdervalue(double ordervalue) {
        this.ordervalue = ordervalue;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
