package com.kylelim.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kylelim.domain.entity.Link;
import com.kylelim.mapper.LinkMapper;
import com.kylelim.service.LinkService;
import org.springframework.stereotype.Service;

/**
 * 友链(Link)表服务实现类
 *
 * @author makejava
 * @since 2024-07-09 11:46:51
 */
@Service("linkService")
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements LinkService {

}
