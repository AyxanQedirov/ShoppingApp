package com.company.business.abstracts;

import com.company.entities.concrete.Product;

import java.util.List;

public interface ProductManager {

    List<Product> getAll();

    Product getById(int id);

    List<Product> getByCategory(int categoryId);

}
