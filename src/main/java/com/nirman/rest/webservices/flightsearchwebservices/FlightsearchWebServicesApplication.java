package com.nirman.rest.webservices.flightsearchwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class FlightsearchWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightsearchWebServicesApplication.class, args);
	}
	@ConditionalOnProperty(name = "cors.enabled", havingValue = "true", matchIfMissing = true)
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {

				registry.addMapping("/**")
						.allowedOrigins("*")
						.allowedHeaders("*")
						.allowedMethods("GET", "PUT", "POST")
						.allowCredentials(true);

			}
		};
	}
}
