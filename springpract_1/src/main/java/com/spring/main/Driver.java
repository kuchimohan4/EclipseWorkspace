package com.spring.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/main/beans.xml");
//		Outfit outfit =(Outfit) ctx.getBean("out");
//		Outfit outfit1 = (Outfit) ctx.getBean("out");
//		OutfitService os = (OutfitService) ctx.getBean("os");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Outfit outfit = ctx.getBean("out", Outfit.class);
		Outfit outfit1 = ctx.getBean("out", Outfit.class);
		OutfitService os = ctx.getBean("os", OutfitService.class);
	
		 
			System.out.println("Outfit 1 details");
			System.out.println("Enter the total income");
			double inc = sc.nextDouble();
			outfit.setTotalIncome(inc);
			System.out.println("Enter the salary of the designer");
			double sal = sc.nextDouble();
			outfit.setDesignerSalary(sal);
			
			System.out.println("Outfit 2 details");
			System.out.println("Enter the total income");
			double inc1 = sc.nextDouble();
			outfit1.setTotalIncome(inc1);
			System.out.println("Enter the salary of the designer");
			double sal1 = sc.nextDouble();
			outfit1.setDesignerSalary(sal1);
		
		 
			try {
				os.calculateNetProfit(outfit);
				System.out.println("The prize money for outfit 1 is $" + outfit.getPrizeMoney());

			} catch (NoProfitException e) {
				System.out.println(e.getMessage());
			}
			

			try {
				os.calculateNetProfit(outfit1);
				System.out.println("The prize money for outfit 2 is $" + outfit1.getPrizeMoney());

			} catch (NoProfitException e) {
				System.out.println(e.getMessage());
			}
		

	}
}
