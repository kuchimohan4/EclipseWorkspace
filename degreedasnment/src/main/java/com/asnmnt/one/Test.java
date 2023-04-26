package com.asnmnt.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static Customer loadcust() {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("dgreed.xml");
		
		Customer cust=(Customer)context.getBean("customer");
		
		
		return cust;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("dgreed.xml");
	
		Customer cs=loadcust();
		System.out.println(cs.getCustomerId());
		System.out.println(cs.getCustomerName());
		System.out.println(cs.getCustomerContact());
		System.out.println(cs.getCustomerAddress().getStreet()+","+cs.getCustomerAddress().getCity()+","+cs.getCustomerAddress().getZip()+","+cs.getCustomerAddress().getState()+","+cs.getCustomerAddress().getCountry());
		

	}

}
