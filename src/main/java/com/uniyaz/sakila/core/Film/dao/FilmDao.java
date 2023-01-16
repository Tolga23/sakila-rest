package com.uniyaz.sakila.core.Film.dao;

import com.uniyaz.sakila.core.Film.domain.Film;
import com.uniyaz.sakila.core.common.BaseDao;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmDao extends BaseDao<Film> {
}
