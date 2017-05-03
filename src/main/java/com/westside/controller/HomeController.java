package com.westside.controller;

import com.westside.domain.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by bkwak on 05/03/2017.
 */

@Controller
public class HomeController {

    private CategoryRepository categoryRepository;

    @Autowired
    public HomeController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home(Model model) {
        Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC, "name"));
        model.addAttribute("categories", categoryRepository.findAll(sort));

        return "home";
    }
}
