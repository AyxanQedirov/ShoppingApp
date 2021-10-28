package com.company.entities.concrete;

import com.company.entities.abstracts.Entity;

public class OrderIteam implements Entity {

    private int id;
    private int orderId;
    private int productId;
    private int orderCount;

    //For Local db
    private static int autoIncrement=0;

    public OrderIteam(int orderId,int productId,int orderCount){
        this.id=++autoIncrement;

        this.orderCount=orderCount;
        this.orderId=orderId;
        this.productId=productId;
    }

    public int getId() {
        return id;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getProductId() {
        return productId;
    }

    public int getOrderCount(){
        return this.orderCount;
    }

}
