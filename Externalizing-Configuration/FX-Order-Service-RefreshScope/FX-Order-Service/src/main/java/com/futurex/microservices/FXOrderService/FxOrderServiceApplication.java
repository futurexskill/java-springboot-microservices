package com.futurex.microservices.FXOrderService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class FxOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FxOrderServiceApplication.class, args);
	}

}
