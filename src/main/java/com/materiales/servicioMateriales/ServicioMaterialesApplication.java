package com.materiales.servicioMateriales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;



@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class ServicioMaterialesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioMaterialesApplication.class, args);
	}
	


}
