package com.uniyaz.sakila.rest.categoy;

import com.uniyaz.sakila.core.category.CategoryConverter;
import com.uniyaz.sakila.core.category.domain.Category;
import com.uniyaz.sakila.core.category.dto.CategoryDto;
import com.uniyaz.sakila.core.category.dto.CategoryFilmDto;
import com.uniyaz.sakila.core.category.service.CategoryService;
import com.uniyaz.sakila.core.common.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "category")
public class CategoryController extends BaseController<Category, CategoryService> {

    @Autowired
    CategoryService categoryService;

    @Autowired
    CategoryConverter categoryConverter;

    // localhost:8080/category/categoryByName?categoryName=Travel
    @GetMapping(path = "categoryByName")
    public ResponseEntity findCategoryByName(String categoryName){
        List<Category> categoryList = categoryService.findCategoryByName(categoryName);
        List<CategoryDto> categoryDtos = categoryConverter.convertCategoryDtoList(categoryList);

        if (!categoryDtos.isEmpty()) return new ResponseEntity(categoryDtos, HttpStatus.OK);
        else return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping(path = "categoryFilm")
    public ResponseEntity findFilmByCategory(String categoryName){
        List<Category> categoryList = categoryService.findFilmsByCategoryName(categoryName);
        List<CategoryFilmDto> categoryFilmDtoList = categoryConverter.convertCategoryFilm(categoryList);

        if (!categoryFilmDtoList.isEmpty())return new ResponseEntity(categoryFilmDtoList,HttpStatus.OK);
        else return new ResponseEntity(HttpStatus.NO_CONTENT);
    }



}
