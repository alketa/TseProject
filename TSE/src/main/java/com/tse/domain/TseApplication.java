package com.tse.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TseApplication {

	public static void main(String[] args) {
		System.out.println("Test");
		System.out.println("Test second changes");
		SpringApplication.run(TseApplication.class, args);
	}
}