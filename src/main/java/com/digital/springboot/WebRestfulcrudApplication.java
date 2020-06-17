package com.digital.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.digital.springboot.mapper")
@SpringBootApplication
public class WebRestfulcrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebRestfulcrudApplication.class, args);
    }

}
