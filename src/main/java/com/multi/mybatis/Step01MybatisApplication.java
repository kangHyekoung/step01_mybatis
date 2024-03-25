package com.multi.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.multi.member")
@MapperScan(basePackages = "com.multi.member")
public class Step01MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Step01MybatisApplication.class, args);
		System.out.println("서버 실행!!");
	}

}
