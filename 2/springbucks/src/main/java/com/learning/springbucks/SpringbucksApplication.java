package com.learning.springbucks;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.learning.springbucks.mapper")
@SpringBootApplication
public class SpringbucksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbucksApplication.class, args);
	}

}
