package com.spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class anna {
	@Value("hot")
	private String type;
	@Value("56")
	private int price;
	
	public int getPrice() {
		return price;
	}

//	public coffie(String type, int price) {
//		super();
//		this.type = type;
//		this.price = price;
//	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

//	public coffie(String type) {
//		super();
//		this.type = type;
//	}
//	public coffie(int price) {
//		super();
//		this.price = price;
//	}

	public void setPrice(int price) {
		this.price = price;
	}
//
//	public String brue() {
//		
//		return this.type+" coffie brued "+this.price;
//		
//	}

}
