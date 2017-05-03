package com.westside.domain.repository;

import com.westside.domain.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkwak on 05/01/2017.
 */

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
