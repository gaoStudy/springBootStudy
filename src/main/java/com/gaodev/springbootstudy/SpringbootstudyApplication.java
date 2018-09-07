package com.gaodev.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootstudyApplication {

	public static void main(String[] args) {
//        Disabling Restart 禁用重新启动
//        System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(SpringbootstudyApplication.class, args);
	}
}
