package com.zyx.mybookstore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zyx.mybookstore.mapper")
public class MybookstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybookstoreApplication.class, args);
    }

}
