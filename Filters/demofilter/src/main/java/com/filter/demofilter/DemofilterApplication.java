package com.filter.demofilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
@ServletComponentScan

@SpringBootApplication
public class DemofilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemofilterApplication.class, args);
	}

}
