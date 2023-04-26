package com.assen.auto2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class displayemployee {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(applicationConfig.class);
		Emp emp=(Emp)context.getBean(Emp.class);
		
		System.out.println(emp.toString()+emp.geteDept());
		
	}
	
	
	

}
