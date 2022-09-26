package com.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.service.LearnerService;

@Configuration
public class LearnerConfiguration {
	
	@Bean(name = {"bean1","bean2"})
	
	public LearnerService getLearnerService() {
		return new LearnerService();
	}
 
}
