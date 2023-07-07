package com.jcl.emp_backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.jcl.emp_backend.mapper")
public class EmpBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpBackendApplication.class, args);
	}

}
