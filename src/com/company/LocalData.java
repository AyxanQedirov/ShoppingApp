package com.company;

import com.company.entities.concrete.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalData {

    public static List<Product> productsTable=Arrays.asList(
            new Product(1, "IPhone 11", 599.99, 100, 1),
            new Product(2, "Samsung S21", 299.99, 140, 1),
            new Product(3, "IPhone 12 Mini", 699.99, 20, 1),
            new Product(4, "JBL 10T", 199.59, 200, 2),
            new Product(14, "Sony Plastation 5 1Tb", 500.99, 10, 3),
            new Product(19, "Type-C cabel 1m", 10.69, 300, 4),
            new Product(50, "HyperX Cloud 2", 100.00, 20, 5),
            new Product(300, "Airpods 3 new Gen", 200, 100 , 5)
    );

    public static List<Category> categoryTable=Arrays.asList(
            new Category(1,"phone"),
            new Category(2,"speaker"),
            new Category(3,"console"),
            new Category(4,"cabel"),
            new Category(5,"headphones")
    );

    public static List<OrderDetail> orderDetailsTable=new ArrayList<>();

    public static List<OrderIteam> orderIteamsTable=new ArrayList<>();

    public static List<BasketItem> Basket=new ArrayList<>();

    public static List<PaymentDetail> paymentDetailTable=new ArrayList<>();




}
