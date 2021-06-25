package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private final Person person;
    private int orderNumber;

    private String buyerName;
    private String buyerPhoneNumber;
    private String buyerAddress;

    public Order(int orderNumber, Person person) {
        this.orderNumber = orderNumber;

        this.person = person;
    }

    public String confirm(){
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", person.getBuyerName(), person.getBuyerPhoneNumber(), person.getBuyerAddress());
    }
}

