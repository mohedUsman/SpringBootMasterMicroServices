package com.usman.eurakaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
/*
 why I need to add this annotation?
 This annotation is used to make this Spring Boot application act as a Eureka Server.
 Eureka Server is a service registry that allows microservices to register themselves and discover other services.
 It is a key component in a microservices architecture for service discovery and load balancing.
 */
@EnableEurekaServer
public class EurakaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakaserverApplication.class, args);
	}

}
