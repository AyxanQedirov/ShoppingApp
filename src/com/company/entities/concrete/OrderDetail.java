package com.company.entities.concrete;

import com.company.entities.abstracts.Entity;

public class OrderDetail implements Entity {


    private int id;
    private int totalPrice;
    private int paymentDetail;

    //For local db
    private static int autoIncrement=0;

    public OrderDetail(int totalPrice,int paymentDetail){
        this.id=++autoIncrement;
        this.paymentDetail=paymentDetail;
        this.totalPrice=totalPrice;

    }
    public int getId() {
        return id;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getPaymentDetail() {
        return paymentDetail;
    }


}
