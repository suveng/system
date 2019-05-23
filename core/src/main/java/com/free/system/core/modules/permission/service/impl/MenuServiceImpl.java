package com.free.system.core.modules.permission.service.impl;

import com.free.system.core.modules.permission.entity.Menu;
import com.free.system.core.modules.permission.mapper.MenuMapper;
import com.free.system.core.modules.permission.service.IMenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author suveng@163.com
 * @since 2019-05-23
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
