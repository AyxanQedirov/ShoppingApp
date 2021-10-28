package com.company.business.concrete;

import com.company.business.abstracts.CategoryManager;
import com.company.dao.abstracts.CategoryDao;
import com.company.entities.concrete.Category;

import java.util.List;

public class CategoryService implements CategoryManager {

    private CategoryDao categoryDao;

    public CategoryService(CategoryDao categoryDao){
        this.categoryDao=categoryDao;
    }

    @Override
    public List<Category> getAll() {
        return categoryDao.getAll();
    }

    @Override
    public Category getById(int id) {
        return categoryDao.getById(id);
    }
}
