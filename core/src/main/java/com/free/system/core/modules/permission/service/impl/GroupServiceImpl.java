package com.free.system.core.modules.permission.service.impl;

import com.free.system.core.modules.permission.entity.Group;
import com.free.system.core.modules.permission.mapper.GroupMapper;
import com.free.system.core.modules.permission.service.IGroupService;
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
public class GroupServiceImpl extends ServiceImpl<GroupMapper, Group> implements IGroupService {

}
