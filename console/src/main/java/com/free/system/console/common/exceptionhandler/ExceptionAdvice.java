package com.free.system.console.common.exceptionhandler;


import com.free.system.core.common.logback.LogbackFactory;
import com.free.system.core.common.response.Result;
import com.free.system.core.common.response.ResultBuilder;
import com.free.system.core.common.response.ResultEnums;
import org.slf4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLException;

/**
 * @author suwenguang
 * suveng@163.com
 * since 2019/2/27
 * description: spring统一异常处理类
 **/
@ControllerAdvice
public class ExceptionAdvice {
    /** Field logger  */
    private Logger logger = LogbackFactory.SYSTEM_LOGGER;

    /**
     * 方法:  handleSQLException
     * @author suwenguang
     * @date 2019/5/23
     *
     * @param e (类型:Exception )
     * @return Result
     */
    @ExceptionHandler({DataAccessException.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Result handleSQLException(SQLException e) {
        logger.error("数据库SQL异常", e);
        return new Result(ResultEnums.SQL_ERROR.getCode(), "数据库SQL异常:" + e.getMessage(), null);
    }

    /**
     * 方法:  handleIndexOutOfBoundsException
     *
     * @author suwenguang@52tt.com
     * @date 2019/5/20
     *
     *
     * @param e (类型:Exception )
     * @return Result
     */
    @ExceptionHandler({Exception.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Result handleException(Exception e) {
        logger.error("系统发生异常", e);
        return new Result(ResultEnums.UNKNOWN_ERROR.getCode(), "系统发生异常:" + e.getMessage(), null);
    }


}
