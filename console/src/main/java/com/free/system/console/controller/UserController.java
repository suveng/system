package com.free.system.console.controller;

import com.alibaba.fastjson.JSON;
import com.free.system.core.common.logback.LogbackFactory;
import com.free.system.core.common.response.Result;
import com.free.system.core.common.response.ResultBuilder;
import com.free.system.core.common.response.ResultEnums;
import com.free.system.core.modules.user.entity.User;
import com.free.system.core.modules.user.service.IUserService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * description:
 * @author suwenguang@52tt.com
 * @date 2019/5/23
 * @version 1.0.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    /** Field logger  */
    private static final Logger logger = LogbackFactory.SYSTEM_LOGGER;

    @Autowired
    private IUserService userService;

    /**
     * 方法:  login
     * @author suwenguang
     * @date 2019/5/23
     * @return Result
     */
    @RequestMapping("/login")
    public Result login(User user, HttpServletRequest httpServletRequest) {
        logger.info("user:{}", JSON.toJSONString(user));
        httpServletRequest.getSession().setAttribute("token", JSON.toJSONString(user));
        return ResultBuilder.build(ResultEnums.SIMPLE_SUCCESS, null);
    }

    /**
     * 方法:  save
     * @author suwenguang
     * @date 2019/5/23
     * @return Result
     */
    @RequestMapping("/save")
    public Result save() {
        User t = new User();
        t.setUsername("sdf");
        t.setPassword("123");
//        t.setSalt("asd");
        userService.insert(t);
        return ResultBuilder.buildSimpleSuccessResult();
    }


}
