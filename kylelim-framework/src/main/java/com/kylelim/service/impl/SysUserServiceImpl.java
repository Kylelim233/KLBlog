package com.kylelim.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kylelim.domain.entity.SysUser;
import com.kylelim.mapper.SysUserMapper;
import com.kylelim.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * 用户表(SysUser)表服务实现类
 *
 * @author makejava
 * @since 2024-07-09 11:47:28
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
