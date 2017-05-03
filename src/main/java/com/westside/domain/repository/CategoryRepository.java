package com.westside.domain.repository;

import com.westside.domain.model.Category;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by bkwak on 05/01/2017.
 */

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAll(Sort sort);
}
