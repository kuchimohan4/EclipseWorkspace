package com.assen.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class douctordisp {

	
	
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(douctorconfigaration.class);
		Douctor douctor1=(Douctor) context.getBean("douctor1");
		Douctor douctor2=(Douctor) context.getBean("douctor2");
		System.out.println(douctor1);
		System.out.println(douctor2);
		
		
		
		
	}
	
	
}
