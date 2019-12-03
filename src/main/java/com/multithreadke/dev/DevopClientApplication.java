package com.multithreadke.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DevopClientApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DevopClientApplication.class, args);
	}
}
