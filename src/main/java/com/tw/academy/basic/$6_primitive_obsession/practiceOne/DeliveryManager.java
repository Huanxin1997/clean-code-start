package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private final Address toAddressObj;
    private final Address fromAddressObj;

    public DeliveryManager(Address fromAddress, Address toAddress) {
        toAddressObj = toAddress;
        fromAddressObj = fromAddress;
    }

    public DeliverCenter allocate(){
        if (isSameCity() && isSameProvince()){
            return DeliverCenter.LOCAL;
        }
        if (isSameProvince()) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private boolean isSameProvince() {
        return this.toAddressObj.isSameProvince(this.fromAddressObj);
    }

    private boolean isSameCity() {
        return this.toAddressObj.isSameCity(this.fromAddressObj);
    }

}