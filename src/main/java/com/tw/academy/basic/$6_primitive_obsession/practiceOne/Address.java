package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class Address {
    private final String address;

    public Address(String address) {
        this.address = address;
    }

    public String getFromAddress() {
        return address;
    }

    String getCity() {
        return getFromAddress().substring(getFromAddress().indexOf("Province") + 1, getFromAddress().indexOf("City"));
    }

    String getProvince() {
        return getFromAddress().substring(0, getFromAddress().indexOf("Province"));
    }

    boolean isSameCity(Address addressFrom) {
        return getCity().equals(addressFrom.getCity());
    }

    boolean isSameProvince(Address addressFrom) {
        return getProvince().equals(addressFrom.getProvince());
    }
}
