package com.blog.weiblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.blog.weiblog.dao")
public class WeiBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeiBlogApplication.class, args);
    }

}
