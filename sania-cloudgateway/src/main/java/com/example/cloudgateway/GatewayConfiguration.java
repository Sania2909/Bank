package com.example.cloudgateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {
	
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
			.route(p->p.path("/admin/**").uri("lb://SANIA-ADMINSERVICE/admin"))
			.route(p->p.path("/user/**").uri("lb://SANIA-USERSERVICE/user"))
			.build();
		
	}

}