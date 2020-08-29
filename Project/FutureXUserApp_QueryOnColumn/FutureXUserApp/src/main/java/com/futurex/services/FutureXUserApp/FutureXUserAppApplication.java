package com.futurex.services.FutureXUserApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FutureXUserAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FutureXUserAppApplication.class, args);
	}

}
