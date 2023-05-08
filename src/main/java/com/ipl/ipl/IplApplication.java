package com.ipl.ipl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IplApplication {

	public static void main(String[] args) {
		SpringApplication.run(IplApplication.class, args);
		System.out.println("Server Start....");
	}
}
