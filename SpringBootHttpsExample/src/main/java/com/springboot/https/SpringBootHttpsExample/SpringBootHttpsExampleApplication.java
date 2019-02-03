package com.springboot.https.SpringBootHttpsExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.springboot.https"})
public class SpringBootHttpsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHttpsExampleApplication.class, args);
	}

}

