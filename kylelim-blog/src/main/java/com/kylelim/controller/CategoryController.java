package com.kylelim.controller;


import com.kylelim.domain.ResponseResult;
import com.kylelim.domain.entity.Article;
import com.kylelim.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    CategoryService categoryService;

    @GetMapping("categoryList")
    public ResponseResult categoryList() {
        return categoryService.categoryList();
    }

}
