package com.sopra.spring.ejerciciopeliculamodelorestjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EjercicioPeliculaModeloRestJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPeliculaModeloRestJpaApplication.class, args);
	}

}
