package com.api.cardgame.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

@Configuration
public class WebConfig {

	@Bean
	public ObjectMapper configureJson() {
		return new Jackson2ObjectMapperBuilder().indentOutput(true)
				.propertyNamingStrategy(PropertyNamingStrategies.KEBAB_CASE).build();
	}
}
