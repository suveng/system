package com.free.system.core.modules.permission.service.impl;

import com.free.system.core.modules.permission.entity.UserRole;
import com.free.system.core.modules.permission.mapper.UserRoleMapper;
import com.free.system.core.modules.permission.service.IUserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户与角色关联表 服务实现类
 * </p>
 *
 * @author suveng@163.com
 * @since 2019-05-23
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
