package com.spring.dependencyinjection.dependentobject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties.Tomcat.Resource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.dependencyinjection.primitivevalues.Employee;
import com.spring.dependencyinjection.primitivevalues.MainEmployee;

@SpringBootApplication
public class MainTest {

	public static void main(String[] args) {
		
		SpringApplication.run(MainTest.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/dependencyinjection/dependentobject/applicationContext.xml");
		Employee1 employee=(Employee1) context.getBean("e");
		employee.show();

	}

}
