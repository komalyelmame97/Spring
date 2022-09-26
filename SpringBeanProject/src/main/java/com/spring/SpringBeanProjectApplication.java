package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.LearnerConfiguration;
import com.spring.service.LearnerService;

@SpringBootApplication
public class SpringBeanProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBeanProjectApplication.class, args);
		
		SpringApplication.run(SpringBeanProjectApplication.class, args);
		
		ApplicationContext ap = new AnnotationConfigApplicationContext(LearnerConfiguration.class);
		LearnerService l = (LearnerService) ap.getBean("bean1");
		System.out.println("Learner Details" +l.getList());
	}

}
