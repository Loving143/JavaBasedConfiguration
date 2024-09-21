package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.HelloService;
import com.example.configuration.ConfigFile;

@SpringBootApplication
public class JavaBasedConfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);

        // Retrieve the HelloService bean
        HelloService helloService = context.getBean(HelloService.class);

        System.out.println(helloService.sayHello());
		SpringApplication.run(JavaBasedConfigurationApplication.class, args);
	}

}
