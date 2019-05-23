package com.free.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * description:
 * @author suwenguang@52tt.com
 * @date 2019/5/17
 * @version 1.0.0
 **/
@SpringBootApplication
@MapperScan("com.free.system.core.modules.*.mapper")
public class ConsoleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsoleApplication.class, args);
    }
}
