package com.uniyaz.sakila.core.category.service;

import com.uniyaz.sakila.core.category.dao.CategoryDao;
import com.uniyaz.sakila.core.category.domain.Category;
import com.uniyaz.sakila.core.common.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService extends BaseService<Category, CategoryDao> {
    @Autowired
    CategoryDao categoryDao;

    public List<Category> findCategoryByName(String name){
        return categoryDao.findCategoryByName(name);
    }

    public List<Category> findFilmsByCategoryName(String name) { return categoryDao.findFilmsByCategoryName(name);}
}
