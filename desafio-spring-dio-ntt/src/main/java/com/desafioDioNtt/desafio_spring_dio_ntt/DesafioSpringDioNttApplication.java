package com.desafioDioNtt.desafio_spring_dio_ntt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DesafioSpringDioNttApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioSpringDioNttApplication.class, args);
	}

}
