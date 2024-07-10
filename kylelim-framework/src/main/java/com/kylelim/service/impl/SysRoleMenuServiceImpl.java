package com.kylelim.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kylelim.domain.entity.SysRoleMenu;
import com.kylelim.mapper.SysRoleMenuMapper;
import com.kylelim.service.SysRoleMenuService;
import org.springframework.stereotype.Service;

/**
 * 角色和菜单关联表(SysRoleMenu)表服务实现类
 *
 * @author makejava
 * @since 2024-07-09 11:49:35
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements SysRoleMenuService {

}
