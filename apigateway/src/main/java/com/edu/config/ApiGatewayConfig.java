package com.edu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer

public class ApiGatewayConfig {
	
	@Bean
    public ResourceServerConfigurerAdapter resourceServerConfigurerAdapter() {
        return new ResourceServerConfigurerAdapter() {
            @SuppressWarnings("deprecation")
			@Override
            public void configure(HttpSecurity http) throws Exception {
                http.authorizeRequests().requestMatchers("/api/**").authenticated();
            }
        };
    }

}
