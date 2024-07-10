package com.kylelim.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kylelim.domain.ResponseResult;
import com.kylelim.domain.entity.Article;
import com.kylelim.domain.entity.Category;
import com.kylelim.enums.ArticleStatusEnum;
import com.kylelim.mapper.CategoryMapper;
import com.kylelim.service.ArticleService;
import com.kylelim.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 分类表(Category)表服务实现类
 *
 * @author makejava
 * @since 2024-07-09 11:46:23
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    ArticleService articleService;

    /**
     * 获取正式文章中拥有的所有类型
     * @return
     */
    @Override
    public ResponseResult categoryList() {

        LambdaQueryWrapper<Article> articleWarpper = new LambdaQueryWrapper<>();

        articleWarpper.eq(Article::getStatus, ArticleStatusEnum.PUBLIC);
        List<Article> articles = articleService.list(articleWarpper);
        Set<Long> categoryIds = articles.stream()
                .map(Article::getCategoryId)
                .collect(Collectors.toSet());

        LambdaQueryWrapper<Category> categoryWrapper = new LambdaQueryWrapper<>();
        categoryWrapper.in(Category::getId, categoryIds);
        List<Category> categoryList = list(categoryWrapper);

        return ResponseResult.okResult(categoryList);
    }
}
