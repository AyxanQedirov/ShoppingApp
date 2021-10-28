package com.company.dao.concrete;

import com.company.LocalData;
import com.company.dao.abstracts.ProductDao;
import com.company.entities.concrete.Product;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class LocalProductDao implements ProductDao {

    @Override
    public List<Product> getAll() {
        return LocalData.productsTable;
    }

    @Override
    public Product getById(int id) {
        return LocalData.productsTable.stream().filter(p->p.getId()==id).collect(Collectors.toList()).get(0);
    }

    @Override
    public List<Product> getByCategoryId(int categoryId) {

        return LocalData.productsTable.stream().filter(p->p.getCategory()==categoryId).collect(Collectors.toList());
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void decreaseUnitInStockCount(int id,int decreasingCount) {
        int currentUnitInStock= LocalData.productsTable.stream().filter(p->p.getId()==id).collect(Collectors.toList()).get(0).getUnitInStock();

        LocalData.productsTable.stream().filter(p->p.getId()==id).collect(Collectors.toList()).get(0).setUnitInStock(currentUnitInStock-decreasingCount);

    }
}
