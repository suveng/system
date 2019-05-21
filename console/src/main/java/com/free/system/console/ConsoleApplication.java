package com.free.system.console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description:
 * @author suwenguang@52tt.com
 * @date 2019/5/17
 * @version 1.0.0
 **/
@SpringBootApplication
public class ConsoleApplication {
    public static void main(String[] args) {
        System.out.println("hello");
        SpringApplication.run(ConsoleApplication.class, args);
    }
}
