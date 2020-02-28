package com.incarcloud.hproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 问候项目启动类
 *
 * @author Aaric, created on 2020-02-28T11:16.
 * @version 0.0.1-SNAPSHOT
 */
@SpringBootApplication(scanBasePackages = {"com.incarcloud.mvc", "com.incarcloud.hproj"})
public class App {

    /**
     * Main
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
