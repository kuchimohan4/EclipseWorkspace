package bank1;

import java.util.Scanner;

public class bankService {
	currentaccout cacc;
	Scanner sc=new Scanner(System.in);
	
	
	public void addbankaccount() {
		
		System.out.println("1 for current or 2 for savings acc");
		int i=sc.nextInt();
		if(i==1) {
			System.out.println("enter acc no:");
			int accno=sc.nextInt();
			System.out.println("enter account holder name:");
			String accholder=sc.nextLine();
			sc.nextLine();
			System.out.println("enter account balance:");
			double accBalnce=sc.nextDouble();
			System.out.println("enter account overDraftLimit:");
			double overdraft=sc.nextDouble();
			cacc=new currentaccout(accno, accholder, accBalnce, true, overdraft);
			System.out.println("current accout created");
		}
		
		else if(i==2) {
			System.out.println("enter acc no:");
			int accno=sc.nextInt();
			System.out.println("enter account holder name:");
			sc.nextLine();
			String accholder=sc.nextLine();
			System.out.println("enter account balance:");
			double accBalnce=sc.nextDouble();
			cacc=new currentaccout(accno, accholder, accBalnce,false);
			System.out.println("savings accout created");
		}
		else {
			System.out.println("invalid input");
		}
	}
	
	
	
	
	public void deposit(double amount) {
		if(cacc.getIsCurrent()) {
		if(amount>0) {
			if(cacc.getCurrentOverDraft() < 0) {
				double currentoverdraft=cacc.getCurrentOverDraft();
				if(currentoverdraft>amount) {
				double finalAmount=amount-currentoverdraft;
				cacc.setCurrentOverDraft(finalAmount);
				System.out.println("rs."+amount+" deposited. current ballance is:0");
			}else {
				double finalAmount=amount-currentoverdraft;
				cacc.setBalance(finalAmount);
				System.out.println("rs."+amount+" deposited. current ballance is:"+(finalAmount));
				
			}
			
				}
			else {
			
			
			Double camt=cacc.getBalance();
			cacc.setBalance((amount+camt));
			System.out.println("rs."+amount+" deposited. current ballance is:"+(amount+camt));
		}}
		else {
			System.out.println("invalid amount");
		}
	}
		else{
			
			if(amount>0) {
				Double camt=cacc.getBalance();
				cacc.setBalance((amount+camt));
				System.out.println("rs."+amount+" deposited. current ballance is:"+(amount+camt));
			}
			else {
				System.out.println("invalid amount");
			}
			
		}
			
	
	}
	public void withdraw(double amount) {
		if(cacc.getIsCurrent()) {
		double camt=cacc.getBalance();
		if(amount <= camt) {
			cacc.setBalance(camt-amount);
			System.out.println("Rs."+amount+"withdrawn"+"current balance:"+(camt-amount));
		}
		else if (amount > camt) {
			
			if((-cacc.getCurrentOverDraft()+(camt-amount)>(-cacc.getOverDraftLimit()))) {
				double ovdraft=(-cacc.getCurrentOverDraft()+(camt-amount));
				System.out.println("Rs."+amount+"withdrawn"+"current balance:Rs.0 with overdraft Rs."+ovdraft);
				cacc.setCurrentOverDraft(ovdraft);
			}
			else {
				System.out.println("u can only withdraw"+ cacc.getOverDraftLimit() +"more than ur balance");
			}
	}	}
	
	else {
		double camt=cacc.getBalance();
		if(amount <= camt) {
			
			cacc.setBalance(camt-amount);
			System.out.println("Rs."+amount+" withdrawn "+"current balance:"+(camt-amount));
		}
		else {
			System.out.println("insuffitient balance");
		}
		
	}

}
	
	
	
	}
