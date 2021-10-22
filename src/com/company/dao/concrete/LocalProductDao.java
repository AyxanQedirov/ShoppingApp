package com.company.dao.concrete;

import com.company.dao.abstracts.ProductDao;
import com.company.entities.concrete.Product;

import java.util.List;

public class LocalProductDao implements ProductDao {

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public List<Product> getById(int id) {
        return null;
    }

    @Override
    public List<Product> getByCategory(String categoryName) {
        return null;
    }

    @Override
    public void delete(int id) {



    }
}
