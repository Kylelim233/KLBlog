package com.kylelim.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kylelim.domain.entity.Comment;
import com.kylelim.mapper.CommentMapper;
import com.kylelim.service.CommentService;
import org.springframework.stereotype.Service;

/**
 * 评论表(Comment)表服务实现类
 *
 * @author makejava
 * @since 2024-07-09 11:46:31
 */
@Service("commentService")
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
