package com.uniyaz.sakila.core.category.dao;

import com.uniyaz.sakila.core.category.domain.Category;
import com.uniyaz.sakila.core.common.BaseDao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDao extends BaseDao<Category> {

    @Query("Select category from Category category where category.name = :categoryName")
    List<Category> findCategoryByName(@Param("categoryName") String categoryName);

    @Query("select category from Category category, Film film " +
            "where category.name = :categoryName")
    List<Category> findFilmsByCategoryName(@Param("categoryName") String categoryName);

}