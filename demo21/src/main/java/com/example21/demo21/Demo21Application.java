package com.example21.demo21;

import org.springframework.boot.SpringApplication;
// import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
// import org.springframework.boot.web.servlet.ServletRegistrationBean;
// import org.springframework.context.annotation.Bean;

@ServletComponentScan
@SpringBootApplication
public class Demo21Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo21Application.class, args);
	}

// 	@Bean
// public ServletRegistrationBean<?> servletRegistrationBean() {
//     ServletRegistrationBean<?> bean = new ServletRegistrationBean<>(
//       new S1(), "/S1");
//     return bean;
// }

}
