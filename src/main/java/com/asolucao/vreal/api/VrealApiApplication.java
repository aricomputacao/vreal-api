package com.asolucao.vreal.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.asolucao.vreal.api.config.property.VrealApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(VrealApiProperty.class)
public class VrealApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VrealApiApplication.class, args);
	}

}
