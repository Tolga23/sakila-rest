package com.uniyaz.sakila.core.category;

import com.uniyaz.sakila.core.Film.domain.Film;
import com.uniyaz.sakila.core.category.domain.Category;
import com.uniyaz.sakila.core.category.dto.CategoryDto;
import com.uniyaz.sakila.core.category.dto.CategoryFilmDto;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryConverter {

    public CategoryDto convertToCategoryDto(Category category){
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setCategoryName(category.getName());

        return categoryDto;
    }

    public CategoryFilmDto convertToCategoryFilmDto(Category category){
        CategoryFilmDto categoryDto = new CategoryFilmDto();
        Film film = new Film();
        categoryDto.setCatergoyId(category.getId());
        categoryDto.setCategory(category.getName());
        categoryDto.setFilm(film.getTitle());

        return categoryDto;
    }

    public List<CategoryDto> convertCategoryDtoList(List<Category> categories){
        List<CategoryDto> categoryDtos = new ArrayList<>();

        for (Category category : categories) {
            CategoryDto categoryDto = convertToCategoryDto(category);
            categoryDtos.add(categoryDto);
        }

        return categoryDtos;
    }

    public List<CategoryFilmDto> convertCategoryFilm(List<Category> categories){
        List<CategoryFilmDto> categoryFilmDtos = new ArrayList<>();

        for (Category category : categories) {
            CategoryFilmDto categoryFilmDto = convertToCategoryFilmDto(category);
            categoryFilmDtos.add(categoryFilmDto);
        }

        return categoryFilmDtos;
    }
}
