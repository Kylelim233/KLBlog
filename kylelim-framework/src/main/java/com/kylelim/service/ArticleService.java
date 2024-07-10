package com.kylelim.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kylelim.domain.ResponseResult;
import com.kylelim.domain.entity.Article;


/**
 * 文章表(Article)表服务接口
 *
 * @author makejava
 * @since 2024-07-09 11:35:33
 */
public interface ArticleService extends IService<Article> {

    ResponseResult hotArticleList();
}
