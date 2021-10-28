package com.company.dao.abstracts;

import com.company.entities.concrete.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getAll();

    Product getById(int id);

    List<Product> getByCategoryId(int categoryId);

    void delete(int id);

    void decreaseUnitInStockCount(int id,int decreasingCount);



}
