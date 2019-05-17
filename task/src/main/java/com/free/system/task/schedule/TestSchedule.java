package com.free.system.task.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description:
 * @author suwenguang@52tt.com
 * @date 2019/5/17
 * @version 1.0.0
 **/
@Slf4j
@Controller
public class TestSchedule {
    @RequestMapping("/helo")
    @ResponseBody
    public String helo(){
        log.debug("hello");
        return "helo";
    }

}
