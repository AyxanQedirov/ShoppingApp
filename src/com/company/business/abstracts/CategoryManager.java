package com.company.business.abstracts;

import com.company.entities.concrete.Category;

import java.util.List;

public interface CategoryManager {
    List<Category> getAll();
    Category getById(int id);
}
