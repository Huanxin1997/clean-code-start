package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private final Address toAddressObj;
    private final Address fromAddressObj;

    public DeliveryManager(Address fromAddress, Address toAddress) {
        toAddressObj = toAddress;
        fromAddressObj = fromAddress;
    }

    public DeliverCenter allocate(){
        if (isLocalCity()){
            return DeliverCenter.LOCAL;
        }
        if (isSameProvince()) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private boolean isSameProvince() {
        return toAddressObj.getProvince().equals(fromAddressObj.getProvince());
    }

    private boolean isLocalCity() {
        return toAddressObj.getProvince().equals(fromAddressObj.getProvince())
                && toAddressObj.getCity().equals(fromAddressObj.getCity());
    }

}