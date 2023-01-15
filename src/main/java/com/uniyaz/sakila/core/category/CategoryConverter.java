package com.uniyaz.sakila.core.category;

import com.uniyaz.sakila.core.category.domain.Category;
import com.uniyaz.sakila.core.category.dto.CategoryDto;
import org.springframework.stereotype.Component;

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

    public List<CategoryDto> convertCategoryDtoList(List<Category> categories){
        List<CategoryDto> categoryDtos = new ArrayList<>();

        for (Category category : categories) {
            CategoryDto categoryDto = convertToCategoryDto(category);
            categoryDtos.add(categoryDto);
        }

        return categoryDtos;
    }
}
