package com.free.system.core.modules.permission.service.impl;

import com.free.system.core.modules.permission.entity.PermissionFunction;
import com.free.system.core.modules.permission.mapper.PermissionFunctionMapper;
import com.free.system.core.modules.permission.service.IPermissionFunctionService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限与功能操作关联表 服务实现类
 * </p>
 *
 * @author suveng@163.com
 * @since 2019-05-23
 */
@Service
public class PermissionFunctionServiceImpl extends ServiceImpl<PermissionFunctionMapper, PermissionFunction> implements IPermissionFunctionService {

}
