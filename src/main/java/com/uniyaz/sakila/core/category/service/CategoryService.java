package com.uniyaz.sakila.core.category.service;

import com.uniyaz.sakila.core.category.dao.CategoryDao;
import com.uniyaz.sakila.core.category.domain.Category;
import com.uniyaz.sakila.core.common.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService extends BaseService<Category, CategoryDao> {

    private final CategoryDao categoryDao;

    public CategoryService(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public List<Category> findCategoryByName(String name){
        return categoryDao.findCategoryByName(name);
    }

    public List<Category> findFilmsByCategoryName(String name) { return categoryDao.findFilmsByCategoryName(name);}
}
