package com.hong.backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.hong.backend.Mapper")
@SpringBootApplication
public class MushroomApplication {

    public static void main(String[] args) {
        SpringApplication.run(MushroomApplication.class, args);
    }

}
