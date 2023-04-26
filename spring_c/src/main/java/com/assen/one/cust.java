package com.assen.one;

public class cust {
	
	private int  custCode;
	private String custName;
	private double orderValue;
	public int getCustCode() {
		return custCode;
	}
	public void setCustCode(int custCode) {
		this.custCode = custCode;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getOrderValue() {
		return orderValue;
	}
	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}
	public int coumputeDiscount(Double orderValue) {
		if (orderValue > 25000) {
			
			return 10;
			
			
			
		} else if(orderValue >10000){
			return  5;

		}
		else {
			return 0;
		}
		
		
	}
	public void showCustomer() {
		System.out.println("cust name:"+custName+"\ncust code:"+custCode+"\nordervalue:"+orderValue);
		
	}
	
	

}
