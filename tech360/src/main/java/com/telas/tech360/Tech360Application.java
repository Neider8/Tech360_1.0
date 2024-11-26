package com.telas.tech360;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class Tech360Application {

	public static void main(String[] args) {
		SpringApplication.run(Tech360Application.class, args);
	}

}
