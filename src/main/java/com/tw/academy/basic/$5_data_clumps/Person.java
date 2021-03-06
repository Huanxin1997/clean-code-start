package com.tw.academy.basic.$5_data_clumps;

public class Person {
    private final String buyerName;
    private final String buyerPhoneNumber;
    private final String buyerAddress;

    public Person(String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.buyerName = buyerName;
        this.buyerPhoneNumber = buyerPhoneNumber;
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public String getBuyerPhoneNumber() {
        return buyerPhoneNumber;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }
}
