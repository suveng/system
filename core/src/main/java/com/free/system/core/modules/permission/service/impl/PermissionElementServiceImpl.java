package com.free.system.core.modules.permission.service.impl;

import com.free.system.core.modules.permission.entity.PermissionElement;
import com.free.system.core.modules.permission.mapper.PermissionElementMapper;
import com.free.system.core.modules.permission.service.IPermissionElementService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限与页面元素关联表 服务实现类
 * </p>
 *
 * @author suveng@163.com
 * @since 2019-05-23
 */
@Service
public class PermissionElementServiceImpl extends ServiceImpl<PermissionElementMapper, PermissionElement> implements IPermissionElementService {

}
