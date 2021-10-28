package com.company.dao.abstracts;

import com.company.entities.concrete.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> getAll();

    Category getById(int id);
}
