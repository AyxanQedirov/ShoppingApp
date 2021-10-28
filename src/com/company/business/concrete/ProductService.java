package com.company.business.concrete;

import com.company.business.abstracts.ProductManager;
import com.company.dao.abstracts.ProductDao;
import com.company.entities.concrete.Product;

import java.util.List;

public class ProductService implements ProductManager {
    private ProductDao productDao;

    public ProductService (ProductDao productDao){

        this.productDao=productDao;
    }

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }

    @Override
    public Product getById(int id) {
        return productDao.getById(id);
    }

    @Override
    public List<Product> getByCategory(int categoryId) {
        return productDao.getByCategoryId(categoryId);
    }
}
