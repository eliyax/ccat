package com.eliyax.ccat.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.eliyax.ccat.platform.dao")
public class CcatApplication {
    public static void main(String[] args) {
        SpringApplication.run(CcatApplication.class, args);
    }
}
