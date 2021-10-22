package com.company.dao.abstracts;

import com.company.entities.concrete.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getAll();

    List<Product> getById(int id);

    List<Product> getByCategory(String categoryName);

    void delete(int id);


}
