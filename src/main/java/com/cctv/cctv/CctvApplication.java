package com.cctv.cctv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.cctv.cctv.repository")
@EntityScan(basePackages = "com.cctv.cctv.entity")
public class CctvApplication {

	public static void main(String[] args) {
		SpringApplication.run(CctvApplication.class, args);
	}

}
