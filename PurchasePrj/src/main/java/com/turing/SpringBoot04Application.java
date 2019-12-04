package com.turing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.turing.mapper")//扫描项目的mapper
//@ImportResource("classpath:spring-tran.xml")//导入事物配置xml
public class SpringBoot04Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot04Application.class, args);
	}

}
