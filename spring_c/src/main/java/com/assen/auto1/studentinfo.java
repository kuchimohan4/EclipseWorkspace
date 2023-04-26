package com.assen.auto1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class studentinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Student student=(Student)context.getBean("student");
		System.out.println("student code"+student.getStudentCode()+"\nstudent name"+student.getStudentName()+"\nstudents "+student.getStuAdd());
		
		

	}

}
