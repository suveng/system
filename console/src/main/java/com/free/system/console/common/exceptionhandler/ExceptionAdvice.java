package com.free.system.console.common.exceptionhandler;


import com.free.system.core.common.logback.LogbackFactory;
import com.free.system.core.common.response.Result;
import com.free.system.core.common.response.ResultBuilder;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author suwenguang
 * suveng@163.com
 * since 2019/2/27
 * description: spring统一异常处理类
 **/
@ControllerAdvice
public class ExceptionAdvice {
    private Logger logger = LogbackFactory.SYSTEM_LOGGER;

    @ExceptionHandler({Exception.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Result handleIndexOutOfBoundsException(Exception e) {
        logger.error("系统发生异常", e);
        return ResultBuilder.buildUnknownResult();
    }
}