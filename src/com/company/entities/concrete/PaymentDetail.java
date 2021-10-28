package com.company.entities.concrete;

import com.company.entities.abstracts.Entity;

public class PaymentDetail implements Entity {

    private int id;
    private int totalPrice;
    private String paymentType;

    private static int autoIncrement=0;

    public PaymentDetail(int totalPrice,String paymentType){

        this.totalPrice=totalPrice;
        this.paymentType=paymentType;
        id=++autoIncrement;

    }

    public int getId() {
        return id;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getPaymentType() {
        return paymentType;
    }


}
