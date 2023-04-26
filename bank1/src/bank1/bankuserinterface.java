package bank1;

import java.util.Scanner;

public class bankuserinterface {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		bankService bService=new bankService();
		bService.addbankaccount();
		boolean looping=true;
		while(looping) {
		System.out.println("1.Deposit \n2.Withdraw \n3.exit");
		int choice=sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter the amount:");
			double amout=sc.nextDouble();
			bService.deposit(amout);
			break;
		}
		case 2:{
			System.out.println("Enter the amount:");
			double amout=sc.nextDouble();
			bService.withdraw(amout);
			break;
			
		}
		case 3:{
			looping=false;
			break;
			
		}
		
		}
		}
	}
	

}
