package com.free.system.core.modules.permission.service.impl;

import com.free.system.core.modules.permission.entity.Role;
import com.free.system.core.modules.permission.mapper.RoleMapper;
import com.free.system.core.modules.permission.service.IRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author suveng@163.com
 * @since 2019-05-23
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
