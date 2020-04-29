package com.nextgenesolutions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SmoochApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmoochApplication.class, args);
	}

}
