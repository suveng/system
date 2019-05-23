package com.free.system.core.modules.permission.service.impl;

import com.free.system.core.modules.permission.entity.PermissionMenu;
import com.free.system.core.modules.permission.mapper.PermissionMenuMapper;
import com.free.system.core.modules.permission.service.IPermissionMenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限与菜单关联表 服务实现类
 * </p>
 *
 * @author suveng@163.com
 * @since 2019-05-23
 */
@Service
public class PermissionMenuServiceImpl extends ServiceImpl<PermissionMenuMapper, PermissionMenu> implements IPermissionMenuService {

}
