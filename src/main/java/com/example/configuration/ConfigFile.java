package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.beans.HelloService;
import com.example.service.BookService;
import com.example.service.BookServiceImpl;

@Configuration
public class ConfigFile {
	
    @Bean
    public BookService bookService() {
        return new BookServiceImpl();
    }
    
    @Bean
    public HelloService helloService() {
        return new HelloService(); // This will be managed by Spring
    }

}

