package com.spring.dependencyinjection.collectionvalues;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MainQuestion {

	public static void main(String[] args) {
		SpringApplication.run(MainQuestion.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/dependencyinjection/collectionvalues/applicationContext.xml");
		Question qes=(Question) context.getBean("q");
		qes.displayInfo();

	}

}
