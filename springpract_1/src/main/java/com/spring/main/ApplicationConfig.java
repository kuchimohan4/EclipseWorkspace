package com.spring.main;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Use appropriate annotation 
@Configuration
@ComponentScan(basePackages ="com.*")
 
@PropertySource("classpath:od.properties")
public class ApplicationConfig {

}
