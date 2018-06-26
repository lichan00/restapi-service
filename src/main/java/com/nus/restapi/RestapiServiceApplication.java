package com.nus.restapi;

import com.nus.restapi.service.RestApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Application using SpringBoot
 */
@SpringBootApplication
public class RestapiServiceApplication implements CommandLineRunner {

	@Autowired
	private RestApiService restApiService;

	@Override
	public void run(String...args) throws Exception {
		restApiService.getData();

	}

	public static void main(String[] args) {
		SpringApplication.run(RestapiServiceApplication.class, args);
	}
}
