package com.futurx.microservices.CurrencyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class CurrencyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyAppApplication.class, args);
	}

}
