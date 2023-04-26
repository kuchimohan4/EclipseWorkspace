package com.kuchi.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;
@Component
public class juce implements item {
	private coffie lj;

	public coffie getLj() {
		return lj;
	}
	@Autowired
	@Qualifier("juce")
//	@Resou
	public void setLj(coffie lj) {
		this.lj = lj;
	}
	public void displayMenu() {
		System.out.println(lj.getPrice()+" $ for "+lj.getType()+".");
		
	}
	
	

}
