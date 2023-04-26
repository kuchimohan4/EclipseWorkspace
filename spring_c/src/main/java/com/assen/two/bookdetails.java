package com.assen.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class bookdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
		books books=(books)context.getBean("book");
		System.out.println(books);

	}

}
