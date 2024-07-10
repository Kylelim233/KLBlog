package com.kylelim.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kylelim.domain.ResponseResult;
import com.kylelim.domain.entity.Category;


/**
 * 分类表(SgCategory)表服务接口
 *
 * @author makejava
 * @since 2024-07-09 11:36:13
 */
public interface CategoryService extends IService<Category> {

    ResponseResult categoryList();
}
