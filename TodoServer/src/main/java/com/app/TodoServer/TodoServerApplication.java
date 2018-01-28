package com.app.TodoServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class TodoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoServerApplication.class, args);
	}
}
