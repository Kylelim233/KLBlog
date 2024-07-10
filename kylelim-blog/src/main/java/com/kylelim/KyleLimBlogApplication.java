package com.kylelim;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kylelim.mapper")
public class KyleLimBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(KyleLimBlogApplication.class,args);
    }
}
