package com.uniyaz.sakila.core.category.dto;

public class CategoryFilmDto {

    private Long catergoyId;
    private String category;
    private String film;

    public Long getCatergoyId() {
        return catergoyId;
    }

    public void setCatergoyId(Long catergoyId) {
        this.catergoyId = catergoyId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }
}
