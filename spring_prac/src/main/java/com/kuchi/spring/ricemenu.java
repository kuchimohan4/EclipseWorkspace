package com.kuchi.spring;

public class ricemenu implements item {
	
	
	private coffie fr;
	private coffie lr;
	private coffie mr;
	public coffie getFr() {
		return fr;
	}
	public void setFr(coffie fr) {
		this.fr = fr;
	}
	public coffie getLr() {
		return lr;
	}
	public void setLr(coffie lr) {
		this.lr = lr;
	}
	public coffie getMr() {
		return mr;
	}
	
	public void setMr(coffie mr) {
		this.mr = mr;
	}
	public void displayMenu() {
		System.out.println(fr.getPrice()+" $ for "+fr.getType()+" coffie.");
		System.out.println(mr.getPrice()+" $ for "+mr.getType()+" coffie.");
		System.out.println(lr.getPrice()+" $ for "+lr.getType()+" coffie.");
		
	}
	
	

}
