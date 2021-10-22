package com.company;

import com.company.entities.concrete.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalData {
    static List<Product> productsTable=Arrays.asList(
            new Product(1, "IPhone 11", 599.99, 100, "Phone"),
            new Product(2, "Samsung S21", 299.99, 140, "Phone"),
            new Product(3, "IPhone 12 Mini", 699.99, 20, "Phone"),
            new Product(4, "JBL 10T", 199.59, 200, "Speaker"),
            new Product(14, "Sony Plastation 5 1Tb", 500.99, 10, "Console"),
            new Product(19, "Type-C cabel 1m", 10.69, 300, "Cabel"),
            new Product(50, "HyperX Cloud 2", 100.00, 20, "Headphone"),
            new Product(300, "Airpods 3 new Gen", 200, 100 , "Headphone")
    );

    static List<String> categoryTable=Arrays.asList(
            "Phone",
            "Speaker",
            "Console",
            "Cabel",
            "Headphone"
    );





}
