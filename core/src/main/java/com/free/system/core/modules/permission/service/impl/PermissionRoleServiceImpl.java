package com.free.system.core.modules.permission.service.impl;

import com.free.system.core.modules.permission.entity.PermissionRole;
import com.free.system.core.modules.permission.mapper.PermissionRoleMapper;
import com.free.system.core.modules.permission.service.IPermissionRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色与权限关联表 服务实现类
 * </p>
 *
 * @author suveng@163.com
 * @since 2019-05-23
 */
@Service
public class PermissionRoleServiceImpl extends ServiceImpl<PermissionRoleMapper, PermissionRole> implements IPermissionRoleService {

}
