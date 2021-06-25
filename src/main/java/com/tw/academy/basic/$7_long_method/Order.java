package com.tw.academy.basic.$7_long_method;

import java.util.List;

public class Order {
    List<LineItem> lineItems;
    private final Customer customer;

    public Order(Customer customer, List<LineItem> lineItems) {
        this.customer = customer;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return customer.getCustomerName();
    }

    public String getCustomerAddress() {
        return customer.getAddress();
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
