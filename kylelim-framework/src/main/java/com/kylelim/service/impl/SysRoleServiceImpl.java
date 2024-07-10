package com.kylelim.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kylelim.domain.entity.SysRole;
import com.kylelim.mapper.SysRoleMapper;
import com.kylelim.service.SysRoleService;
import org.springframework.stereotype.Service;

/**
 * 角色信息表(SysRole)表服务实现类
 *
 * @author makejava
 * @since 2024-07-09 11:47:12
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

}
