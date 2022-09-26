package com.spring.dependencyinjection.primitivevalues;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class MainEmployee {

	public static void main(String[] args) {
		SpringApplication.run(MainEmployee.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/dependencyinjection/primitivevalues/applicationContext.xml");
		Employee employee=(Employee) context.getBean("e");
		employee.show();


	}

}
