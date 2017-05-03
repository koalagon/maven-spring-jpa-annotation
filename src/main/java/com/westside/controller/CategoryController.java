package com.westside.controller;

import com.westside.domain.model.Category;
import com.westside.domain.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bkwak on 05/01/2017.
 */
@RestController
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping("/categories")
    public List<Category> welcome() {//Welcome page, non-rest

        return categoryRepository.findAll();
    }
}
