package com.free.system.console.controller;

import com.free.system.core.common.logback.LogbackFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * description:
 * @author suwenguang@52tt.com
 * @date 2019/5/17
 * @version 1.0.0
 **/
@Controller
public class ViewController {
    private Logger logger = LogbackFactory.SYSTEM_LOGGER;
    @RequestMapping("/404")
    public String get404(){
        logger.info("404");
        return "public/error/404.html";
    }
}
