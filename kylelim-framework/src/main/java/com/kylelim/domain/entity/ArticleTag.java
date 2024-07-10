package com.kylelim.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 文章标签关联表(SgArticleTag)表实体类
 *
 * @author makejava
 * @since 2024-07-09 11:34:52
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sg_article_tag")
public class ArticleTag {

    //文章id
    private Long articleId;

    //标签id
    private Long tagId;
}
