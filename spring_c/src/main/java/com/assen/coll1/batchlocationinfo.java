package com.assen.coll1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class batchlocationinfo {
	public static void main(String[] args) {
		
	
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Location loc =(Location)context.getBean("location");
	loc.displayInfo();
	
}}
