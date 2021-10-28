package com.company.dao.concrete;

import com.company.LocalData;
import com.company.dao.abstracts.CategoryDao;
import com.company.entities.concrete.Category;

import java.util.List;
import java.util.stream.Collectors;

public class LocalCategoryDao implements CategoryDao {
    @Override
    public List<Category> getAll() {
        return LocalData.categoryTable;
    }

    @Override
    public Category getById(int id) {
        return LocalData.categoryTable.stream().filter(c->c.getId()==id).collect(Collectors.toList()).get(0);
    }
}
