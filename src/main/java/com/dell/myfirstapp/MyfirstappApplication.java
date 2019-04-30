package com.dell.myfirstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class MyfirstappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstappApplication.class, args);
	}

}
