package com.free.system.core.modules.permission.service.impl;

import com.free.system.core.modules.permission.entity.File;
import com.free.system.core.modules.permission.mapper.FileMapper;
import com.free.system.core.modules.permission.service.IFileService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文件表 服务实现类
 * </p>
 *
 * @author suveng@163.com
 * @since 2019-05-23
 */
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements IFileService {

}
