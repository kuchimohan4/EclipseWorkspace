package com.assen.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.assen.javaconfig")
public class douctorconfigaration {
	
	
	
	@Bean()
	public Douctor douctor1() {
	return new Douctor("kuchi", "nurolagizt");
	}
	@Bean()
	public Douctor douctor2() {
	return new Douctor("mohan", "cardiologist");
	}

}
