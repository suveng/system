package com.free.system.core.modules.permission.service.impl;

import com.free.system.core.modules.permission.entity.PermissionFile;
import com.free.system.core.modules.permission.mapper.PermissionFileMapper;
import com.free.system.core.modules.permission.service.IPermissionFileService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限与文件关联表 服务实现类
 * </p>
 *
 * @author suveng@163.com
 * @since 2019-05-23
 */
@Service
public class PermissionFileServiceImpl extends ServiceImpl<PermissionFileMapper, PermissionFile> implements IPermissionFileService {

}
