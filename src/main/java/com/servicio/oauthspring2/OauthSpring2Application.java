package com.servicio.oauthspring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OauthSpring2Application {

	public static void main(String[] args) {
		SpringApplication.run(OauthSpring2Application.class, args);
	}

}
