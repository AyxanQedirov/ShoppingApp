package com.company.entities.concrete;

import com.company.entities.abstracts.Entity;

 public class Product implements Entity {

    int id;
    String name ;
    double price;
    int unitInStock;
    String category;


    public Product(int id, String name, double price, int unitInStock, String category){
        this.id=id;
        this.category=category;
        this.name=name;
        this.price=price;
        this.unitInStock=unitInStock;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public String getCategory() {
        return category;
    }




}
