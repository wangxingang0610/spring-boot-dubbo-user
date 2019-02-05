package com.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo //开启基于注解的dubbo功能
@SpringBootApplication
public class SpringBootDubboUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDubboUserApplication.class, args);
	}

}

