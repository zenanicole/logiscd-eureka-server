package com.logiscdweb.logiscdwebeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LogiscdwebEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogiscdwebEurekaServerApplication.class, args);
	}

}
