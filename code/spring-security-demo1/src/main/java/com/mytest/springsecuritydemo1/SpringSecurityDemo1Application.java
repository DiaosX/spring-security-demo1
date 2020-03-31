package com.mytest.springsecuritydemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.mytest.springsecuritydemo1.dao"})
public class SpringSecurityDemo1Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityDemo1Application.class, args);
    }
}
