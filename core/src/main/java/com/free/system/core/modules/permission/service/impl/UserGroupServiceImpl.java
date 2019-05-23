package com.free.system.core.modules.permission.service.impl;

import com.free.system.core.modules.permission.entity.UserGroup;
import com.free.system.core.modules.permission.mapper.UserGroupMapper;
import com.free.system.core.modules.permission.service.IUserGroupService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户组表 服务实现类
 * </p>
 *
 * @author suveng@163.com
 * @since 2019-05-23
 */
@Service
public class UserGroupServiceImpl extends ServiceImpl<UserGroupMapper, UserGroup> implements IUserGroupService {

}
