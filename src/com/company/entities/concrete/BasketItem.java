package com.company.entities.concrete;

import com.company.entities.abstracts.Entity;

public class BasketItem implements Entity {

    private int id;
    private int productId;
    private int countOfProduct;

    private static int autoIncrement=0;

    public BasketItem(int productId, int countOfProduct) {
        this.productId = productId;
        this.countOfProduct = countOfProduct;
        this.id=++autoIncrement;
    }
    public int getId(){
        return this.id;
    }

    public int getProductId() {
        return productId;
    }

    public int getCountOfProduct() {
        return countOfProduct;
    }

}
