package com.kuchi.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class drawing_application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		triangle triangle=new triangle();
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		triangle triangle=(triangle)context.getBean("triangle");
		
		
		
		
		triangle.draw();

	}

}
