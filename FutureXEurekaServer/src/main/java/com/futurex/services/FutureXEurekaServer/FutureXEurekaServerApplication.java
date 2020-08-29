package com.futurex.services.FutureXEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FutureXEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FutureXEurekaServerApplication.class, args);
	}

}
