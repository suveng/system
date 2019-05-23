package com.free.system.console.controller;

import com.alibaba.fastjson.JSON;
import com.free.system.core.common.logback.LogbackFactory;
import com.free.system.core.common.response.Result;
import com.free.system.core.common.response.ResultBuilder;
import com.free.system.core.common.response.ResultEnums;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
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
    private static final Logger logger = LogbackFactory.SYSTEM_LOGGER;
    /**
     * 方法:  login
     * @author suwenguang
     * @date 2019/5/23
     * @return Result
     */
    @RequestMapping("/login")
    public Result login(User user, HttpServletRequest httpServletRequest){
        logger.info("user:{}",JSON.toJSONString(user));
        httpServletRequest.getSession().setAttribute("token", JSON.toJSONString(user));
        return ResultBuilder.build(ResultEnums.SIMPLE_SUCCESS,null);
    }
}
