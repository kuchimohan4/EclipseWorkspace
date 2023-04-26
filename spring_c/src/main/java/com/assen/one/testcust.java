package com.assen.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testcust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		cust customer=(cust)context.getBean("cust");
		customer.showCustomer();
		System.out.println("discount:"+customer.coumputeDiscount(30000.0));
		

	}

}
