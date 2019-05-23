package com.free.system.core.modules.permission.service.impl;

import com.free.system.core.modules.permission.entity.Element;
import com.free.system.core.modules.permission.mapper.ElementMapper;
import com.free.system.core.modules.permission.service.IElementService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 页面元素表 服务实现类
 * </p>
 *
 * @author suveng@163.com
 * @since 2019-05-23
 */
@Service
public class ElementServiceImpl extends ServiceImpl<ElementMapper, Element> implements IElementService {

}
