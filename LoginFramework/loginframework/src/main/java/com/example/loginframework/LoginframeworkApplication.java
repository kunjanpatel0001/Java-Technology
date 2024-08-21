package com.example.loginframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ServletComponentScan
public class LoginframeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginframeworkApplication.class, args);
	}
}
