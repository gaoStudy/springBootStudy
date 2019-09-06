package com.gaodev.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.gaodev.springbootstudy.mapper")
@EnableCaching
public class SpringbootstudyApplication {

    public static void main(String[] args) {
//        Disabling Restart 禁用重新启动
//        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(SpringbootstudyApplication.class, args);
    }
}
