package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class clsldr {
	
	
	public static void main(String[] args) {
		
	
	ApplicationContext context=new AnnotationConfigApplicationContext(clsscner.class);
	anna na=(anna)context.getBean(anna.class);
	System.out.println(na.getPrice()+"$ for "+na.getType()+" coffie");
	
	}

}
