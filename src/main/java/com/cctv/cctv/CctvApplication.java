package com.cctv.cctv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cctv.cctv")
public class CctvApplication {

	public static void main(String[] args) {
		SpringApplication.run(CctvApplication.class, args);
	}

}
