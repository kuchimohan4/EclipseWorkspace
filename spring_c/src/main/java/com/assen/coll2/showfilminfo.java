package com.assen.coll2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class showfilminfo {
	
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		FilmDirectors fDirectors=(FilmDirectors)context.getBean("filmdirectors");
		fDirectors.printFilmInfo();
		
	}
	

}
